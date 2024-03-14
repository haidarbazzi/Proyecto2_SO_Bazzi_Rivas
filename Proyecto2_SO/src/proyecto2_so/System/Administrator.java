/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so.System;

import javax.swing.DefaultListModel;
import proyecto2_so.Disk.Buffer;
import proyecto2_so.EDD.Nodo;
import proyecto2_so.EDD.Queue;
import proyecto2_so.Interfaces.MainWindow;
import proyecto2_so.Character.Character;
import static proyecto2_so.Enum.CompanyEnum.CARTOONNETWORK;
import static proyecto2_so.Enum.CompanyEnum.NICKELODEON;
import proyecto2_so.Enum.TierEnum;
import static proyecto2_so.Enum.TierEnum.FIRST;
import static proyecto2_so.Enum.TierEnum.REINFORCEMENT;
import static proyecto2_so.Enum.TierEnum.SECOND;
import static proyecto2_so.Enum.TierEnum.THIRD;

/**
 *
 * @author HP
 */
public class Administrator extends Thread {

    private Buffer buffer;
    private MainWindow mainWindow;
    private int nextID;

    public Administrator(Buffer buffer, MainWindow main, int lastID) {
        this.buffer = buffer;
        this.mainWindow = main;
        this.nextID = lastID + 1;
    }

    @Override
    public void run() {

        while (true) {

            try {
                getBuffer().getS1().release();
                getBuffer().getS2().acquire();

            } catch (Exception e) {
            }

            if (getBuffer().getNumCycle() == 2) {
                //Ingresar un nuevo personaje después de dos ciclos
                double randomNum = Math.random();

                if (randomNum <= 0.80) {

                    createNewCharacter();

                }
                
                getBuffer().setNumCycle(0);
            }

            if(getBuffer().getNickFighter()!=null && getBuffer().getCartoonFighter()!=null){
               movetoQueue(getBuffer().getCartoonFighter());
               movetoQueue(getBuffer().getNickFighter());
               System.out.println(getBuffer().getCartoonFighter().getName() + " ACA ESTA");
               
               System.out.println("NICK 1");
               if(!getBuffer().getNickTier1Queue().isEmpty()){
                   getBuffer().getNickTier1Queue().print();
               }
            }
             updateWindow();

            //Actualizar las colas segun los nodos que completaron ciclo
            Queue fullCycleQueueNick2 = getBuffer().getNickTier2Queue().dequeueFullCycle();
            getBuffer().getNickTier1Queue().queueFullCycleNodes(fullCycleQueueNick2, TierEnum.FIRST);

            Queue fullCycleQueueNick3 = getBuffer().getNickTier3Queue().dequeueFullCycle();
            getBuffer().getNickTier2Queue().queueFullCycleNodes(fullCycleQueueNick3, TierEnum.SECOND);

            Queue fullCycleQueueCart2 = getBuffer().getCartoonTier2Queue().dequeueFullCycle();
            getBuffer().getCartoonTier1Queue().queueFullCycleNodes(fullCycleQueueCart2, TierEnum.FIRST);

            Queue fullCycleQueueCart3 = getBuffer().getCartoonTier2Queue().dequeueFullCycle();
            getBuffer().getCartoonTier2Queue().queueFullCycleNodes(fullCycleQueueCart3, TierEnum.SECOND);

            //Seleccionar los personajes a batallar
            Character nickFighter = null;
            Character cartoonFighter = null;
 
            if (!buffer.getNickTier1Queue().isEmpty()) {
               

                nickFighter = getBuffer().getNickTier1Queue().dequeueCharacter();

            } else if (!buffer.getNickTier2Queue().isEmpty()) {

                nickFighter = getBuffer().getNickTier2Queue().dequeueCharacter();

            } else if (!buffer.getNickTier3Queue().isEmpty()) {

                nickFighter = getBuffer().getNickTier3Queue().dequeueCharacter();

            }
            

            if (!buffer.getCartoonTier1Queue().isEmpty()) {

                cartoonFighter = getBuffer().getCartoonTier1Queue().dequeueCharacter();

            } else if (!buffer.getCartoonTier2Queue().isEmpty()) {

                cartoonFighter = getBuffer().getCartoonTier2Queue().dequeueCharacter();

            } else if (!buffer.getCartoonTier3Queue().isEmpty()) {

                cartoonFighter = getBuffer().getCartoonTier3Queue().dequeueCharacter();

            }
           

            //Administracion de cola de refuerzo
            double randomNum2 = Math.random();
           
            if (randomNum2 <= 0.40) {

                if (!buffer.getCartoonEffortQueue().isEmpty()) {

                    Nodo CartNewFighter = getBuffer().getCartoonEffortQueue().dequeue();
                    CartNewFighter.getCharacter().setTier(FIRST);
                    getBuffer().getCartoonTier1Queue().queue(CartNewFighter);

                }
                if (!buffer.getNickEffortQueue().isEmpty()) {

                    Nodo NickNewFighter = getBuffer().getNickEffortQueue().dequeue();
                    NickNewFighter.getCharacter().setTier(FIRST);
                    getBuffer().getNickTier1Queue().queue(NickNewFighter);

                }
            }

            updateWindow();
            getBuffer().setNickFighter(nickFighter);
            getBuffer().setCartoonFighter(cartoonFighter);
            getBuffer().setNumCycle(getBuffer().getNumCycle() + 1);
            
        }
    }

    public void updateWindow() {
        updateQueues(getMainWindow().getEffortNick(), getBuffer().getNickEffortQueue());
        updateQueues(getMainWindow().getEffortCartoon(), getBuffer().getCartoonEffortQueue());
        updateQueues(getMainWindow().getTier1Nick(), getBuffer().getNickTier1Queue());
        updateQueues(getMainWindow().getTier1Cartoon(), getBuffer().getCartoonTier1Queue());
        updateQueues(getMainWindow().getTier2Nick(), getBuffer().getNickTier2Queue());
        updateQueues(getMainWindow().getTier2Cartoon(), getBuffer().getCartoonTier2Queue());
        updateQueues(getMainWindow().getTier3Nick(), getBuffer().getNickTier3Queue());
        updateQueues(getMainWindow().getTier3Cartoon(), getBuffer().getCartoonTier3Queue());

    }

    public void updateQueues(javax.swing.JList<String> list, Queue queue) {
        DefaultListModel model = new DefaultListModel();
        list.setModel(model);
        String[] elements = queue.toArray();
        if (elements != null) {
            for (String element : elements) {
                model.addElement(element);
            }
        }

    }

    public void createNewCharacter() {
        int random = (int) Math.round(Math.random() * 19);
        Character nickC;
        Character cartoonC;
        System.out.println("DENTRO DE CREATE NEW CHARACTER");
        try {
            nickC = new Character(getBuffer().getNickCharacters()[random]);
            cartoonC = new Character(getBuffer().getCartoonCharacters()[random]);

            nickC.setId(getNextID());
            movetoQueue(nickC);
            cartoonC.setId(getNextID() + 1);
            movetoQueue(cartoonC);
            setNextID(getNextID() + 2);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void movetoQueue(Character fighter) {
        switch (fighter.getCompany()) {
            case NICKELODEON:
                switch (fighter.getTier()) {
                    case REINFORCEMENT:
                        getBuffer().getNickEffortQueue().queue(fighter, fighter.getId(), 0);
                        break;
                    case THIRD:
                        getBuffer().getNickTier3Queue().queue(fighter, fighter.getId(), 0);
                        break;
                    case SECOND:
                        getBuffer().getNickTier2Queue().queue(fighter, fighter.getId(), 0);
                        break;
                    case FIRST:
                        getBuffer().getNickTier1Queue().queue(fighter, fighter.getId(), 0);
                        break;

                }
                break;
            case CARTOONNETWORK:
                switch (fighter.getTier()) {
                    case REINFORCEMENT:
                        getBuffer().getCartoonEffortQueue().queue(fighter, fighter.getId(), 0);                      
                        break;
                    case THIRD:
                        getBuffer().getCartoonTier3Queue().queue(fighter, fighter.getId(), 0);
                        break;
                    case SECOND:
                        getBuffer().getCartoonTier2Queue().queue(fighter, fighter.getId(), 0);
                        break;
                    case FIRST:
                        getBuffer().getCartoonTier1Queue().queue(fighter, fighter.getId(), 0);
                        break;

                }
                break;
        }

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

    /**
     * @return the nextID
     */
    public int getNextID() {
        return nextID;
    }

    /**
     * @param nextID the nextID to set
     */
    public void setNextID(int nextID) {
        this.nextID = nextID;
    }
}
