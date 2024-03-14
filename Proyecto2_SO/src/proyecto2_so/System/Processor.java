/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so.System;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import proyecto2_so.Disk.Buffer;
import proyecto2_so.Interfaces.MainWindow;
import proyecto2_so.Character.Character;
import proyecto2_so.Enum.CompanyEnum;
import proyecto2_so.Enum.TierEnum;
import proyecto2_so.Enum.TypeEnum;

/**
 *
 * @author HP
 */
public class Processor extends Thread {

    private Buffer buffer;
    private MainWindow mainWindow;

    public Processor(Buffer buffer, MainWindow main) {
        this.buffer = buffer;
        this.mainWindow = main;
    }

    @Override
    public void run() {
        while (true) {
            try {
                try {
                    getBuffer().getS2().release();
                    getBuffer().getS1().acquire();

                } catch (Exception e) {
                }

                getMainWindow().getFighterNick().setText("");
                getMainWindow().getFighterCartoon().setText(" ");
                getMainWindow().getNickCharacterCard().setIcon(null);
                getMainWindow().getCartoonCharacterCard().setIcon(null);
                getMainWindow().getNickCharacterImage1().setIcon(null);
                getMainWindow().getCartoonCharacterImage().setIcon(null);

                
                sleep(getBuffer().getSimLoad());
                System.out.println(getBuffer().getSimLoad());

                Character nickFighter = getBuffer().getNickFighter();
                Character cartoonFighter = getBuffer().getCartoonFighter();

                //Después de escoger los luchadores, colocarlos en el mainWindow
                if (nickFighter != null && cartoonFighter != null) {
                    System.out.println(nickFighter.getName() + "vs" + cartoonFighter.getName());
                    getMainWindow().getFighterNick().setText(nickFighter.getName());
                    getMainWindow().getFighterCartoon().setText(cartoonFighter.getName());

                    ImageIcon card = new ImageIcon(getCardType(nickFighter.getType(), nickFighter.getCompany()));
                    getMainWindow().getNickCharacterCard().setIcon(card);
                    card = new ImageIcon(getCardType(cartoonFighter.getType(), cartoonFighter.getCompany()));
                    getMainWindow().getCartoonCharacterCard().setIcon(card);

                    ImageIcon icon = new ImageIcon(nickFighter.getImgPath());
                    getMainWindow().getNickCharacterImage1().setIcon(icon);
                    icon = new ImageIcon(cartoonFighter.getImgPath());
                    getMainWindow().getCartoonCharacterImage().setIcon(icon);

                    getMainWindow().getStateAI().setText("Decidiendo");
                    sleep(getBuffer().getSimSpeed());

                    double prob = Math.random();

                    //Decidir quién gana
                    if (prob <= 0.4) {
                        System.out.println("fight");
                        boolean result = chooseWinner(nickFighter, cartoonFighter);
                        if (result) {
                            getBuffer().getNickWinners().queue(nickFighter, nickFighter.getId(), 0);
                            getMainWindow().getStateAI().setText("Nick Gana");
                            int nickWins = Integer.parseInt(getMainWindow().getWinnersNick().getText());
                            nickWins++;
                            getMainWindow().getWinnersNick().setText(String.valueOf(nickWins));
                            System.out.println("nick wins");
                        } else {
                            getBuffer().getCartoonWinners().queue(cartoonFighter, nickFighter.getId(), 0);
                            getMainWindow().getStateAI().setText("Cartoon Gana");
                            int cartoonWins = Integer.parseInt(getMainWindow().getWinnersCartoon().getText());
                            cartoonWins++;
                            getMainWindow().getWinnersCartoon().setText(String.valueOf(cartoonWins));
                            System.out.println("cartoon wins");
                        }
                        getBuffer().setNickFighter(null);
                        getBuffer().setCartoonFighter(null);
                         
                    } else if (prob <= 0.67) {
                        getMainWindow().getStateAI().setText("Empate");
                        System.out.println("fix");
                        nickFighter.setTier(TierEnum.FIRST);
                        cartoonFighter.setTier(TierEnum.FIRST);

                       

                    } else {
                        getMainWindow().getStateAI().setText("No es posible");
                        System.out.println("not possible");
                        
                        
                        nickFighter.setTier(TierEnum.REINFORCEMENT);
                        cartoonFighter.setTier(TierEnum.REINFORCEMENT);

                      

                    }

                    sleep(getBuffer().getNextSim());

                }

            } catch (InterruptedException ex) {
                System.out.println(ex);
                Logger.getLogger(Processor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public boolean chooseWinner(Character nick, Character cartoon) {
        if (nick.getType().getId() > cartoon.getType().getId()) {
            return true;
        } else if (nick.getType().getId() < cartoon.getType().getId()) {
            return false;
        } else {
            //si tienen el mismo tipo, coin toss
            int wins = 0;
            for (int i = 0; i < 3; i++) {
                double rand = Math.random();
                wins = (rand < 0.5) ? wins + 1 : wins - 1;
            }
            if (wins > 0) {
                return true;
            } else if (wins < 0) {
                return false;

            } else {
                //muerte subita
                double rand = Math.random();
                if (rand < 0.5) {
                    return true;
                } else {
                    return false;
                }
            }

        }
    }

    

    public String getCardType(TypeEnum type, CompanyEnum comp) {
        switch (comp) {
            case NICKELODEON:
                switch (type) {
                    case MASTER:
                        return "src\\proyecto2_so\\NickImages\\MasterCardAvatar.png";
                    case SKILLED:
                        return "src\\proyecto2_so\\NickImages\\SkilledCardAvatar.png";
                    case AVERAGE:
                        return "src\\proyecto2_so\\NickImages\\AverageCardAvatar.png";
                    case DEFICIENT:
                        return "src\\proyecto2_so\\NickImages\\DeficientCardAvatar.png";
                    case WEAK:
                        return "src\\proyecto2_so\\NickImages\\WeakCardAvatar.png";

                }
                break;
            case CARTOONNETWORK:
                switch (type) {
                    case MASTER:
                        return "src\\proyecto2_so\\CartoonImages\\MasterCardRegShow.png";
                    case SKILLED:
                        return "src\\proyecto2_so\\CartoonImages\\SkilledCardRegShow.png";
                    case AVERAGE:
                        return "src\\proyecto2_so\\CartoonImages\\AverageCardRegShow.png";
                    case DEFICIENT:
                        return "src\\proyecto2_so\\CartoonImages\\DeficientCardRegShow.png";
                    case WEAK:
                        return "src\\proyecto2_so\\CartoonImages\\WeakCardReg.png";

                }
        }
        return "";
    }

    /**
     * @return the buffer
     */
    public Buffer getBuffer() {
        return buffer;
    }

    /**
     * @param buffer the buffer to set
     */
    public void setBuffer(Buffer buffer) {
        this.buffer = buffer;
    }

    /**
     * @return the mainWindow
     */
    public MainWindow getMainWindow() {
        return mainWindow;
    }

    /**
     * @param mainWindow the mainWindow to set
     */
    public void setMainWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

}
