/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so.System;

import proyecto2_so.Disk.Buffer;
import proyecto2_so.EDD.Nodo;
import proyecto2_so.EDD.Queue;
import proyecto2_so.Interfaces.MainWindow;
import proyecto2_so.Character.Character;

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

            if (getBuffer().getNumCycle() == 2) {
                //Ingresar un nuevo personaje después de dos ciclos
                double randomNum = Math.random();

                if (randomNum <= 0.80) {

                    createNewCharacter();
                    getBuffer().setNumCycle(0);

                }
            }
            //Actualizar las colas segun los nodos que completaron ciclo

            Queue fullCycleQueueNick2 = buffer.getNickTier2Queue().dequeueFullCycle();
            buffer.getNickTier1Queue().queueFullCycleNodes(fullCycleQueueNick2);

            Queue fullCycleQueueNick3 = buffer.getNickTier3Queue().dequeueFullCycle();
            buffer.getNickTier2Queue().queueFullCycleNodes(fullCycleQueueNick3);

            Queue fullCycleQueueCart2 = buffer.getCartoonTier2Queue().dequeueFullCycle();
            buffer.getCartoonTier1Queue().queueFullCycleNodes(fullCycleQueueCart2);

            Queue fullCycleQueueCart3 = buffer.getCartoonTier2Queue().dequeueFullCycle();
            buffer.getCartoonTier2Queue().queueFullCycleNodes(fullCycleQueueCart3);

            //Seleccionar los personajes a batallar
            Character nickFighter;
            Character cartoonFighter;

            if (!buffer.getNickTier1Queue().isEmpty()) {

                nickFighter = getBuffer().getNickTier1Queue().dequeueCharacter();
                getBuffer().setNickFighter(nickFighter);

            } else if (!buffer.getNickTier2Queue().isEmpty()) {

                nickFighter = getBuffer().getNickTier2Queue().dequeueCharacter();
                getBuffer().setNickFighter(nickFighter);

            } else if (!buffer.getNickTier3Queue().isEmpty()) {

                nickFighter = getBuffer().getNickTier3Queue().dequeueCharacter();
                getBuffer().setNickFighter(nickFighter);

            }

            if (!buffer.getCartoonTier1Queue().isEmpty()) {

                cartoonFighter = getBuffer().getCartoonTier1Queue().dequeueCharacter();
                getBuffer().setCartoonFighter(cartoonFighter);

            } else if (!buffer.getCartoonTier2Queue().isEmpty()) {

                cartoonFighter = getBuffer().getCartoonTier2Queue().dequeueCharacter();
                getBuffer().setCartoonFighter(cartoonFighter);

            }

            if (!buffer.getCartoonTier3Queue().isEmpty()) {

                cartoonFighter = getBuffer().getCartoonTier3Queue().dequeueCharacter();
                getBuffer().setCartoonFighter(cartoonFighter);
            }

            //Administracion de cola de refuerzo
            double randomNum2 = Math.random();

            if (randomNum2 <= 0.40) {

                if (!buffer.getCartoonEffortQueue().isEmpty()) {

                    Nodo CartNewFighter = getBuffer().getCartoonEffortQueue().dequeue();
                    getBuffer().getCartoonTier1Queue().queue(CartNewFighter);

                }
                if (!buffer.getNickEffortQueue().isEmpty()) {

                    Nodo NickNewFighter = getBuffer().getNickEffortQueue().dequeue();
                    getBuffer().getNickTier1Queue().queue(NickNewFighter);

                }
            }

            getBuffer().setNumCycle(getBuffer().getNumCycle() + 1);

            //Actualizar la interfaz
        }
    }

    public void createNewCharacter() {
        int random = (int) Math.round(Math.random() * 10);
        Character nickC;
        Character cartoonC;
        try {
            nickC = new Character(getBuffer().getNickCharacters()[random]);
            cartoonC = new Character(getBuffer().getCartoonCharacters()[random]);

            nickC.setId(getNextID());
            cartoonC.setId(getNextID() + 1);
            setNextID(getNextID() + 1);
        } catch (Exception e) {
            System.out.println(e);
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
