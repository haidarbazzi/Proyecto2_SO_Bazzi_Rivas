/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so.System;

import proyecto2_so.Disk.Buffer;
import proyecto2_so.Interfaces.MainWindow;
import proyecto2_so.Character.Character;

/**
 *
 * @author HP
 */
public class Processor extends Thread{
    
    private Buffer buffer;
    private MainWindow mainWindow;
    
    public Processor(Buffer buffer, MainWindow main){
        this.buffer = buffer;
        this.mainWindow = main;
    }
    
    @Override
    public void run(){
    
    }
    
    
    public boolean chooseWinner(Character nick, Character cartoon){
        if(nick.getType().getId()>cartoon.getType().getId()){
            return true;
        }else if(nick.getType().getId()<cartoon.getType().getId()){
            return false;
        }else{
            //si tienen el mismo tipo, coin toss
            int wins=0;
            for (int i = 0; i < 3; i++) { 
                double rand = Math.random();
                wins = (rand<0.5)? wins+1: wins-1;
            }
            if(wins>0){
                return true;
            }else if(wins<0){
                return false;
            
            }else{
                //muerte subita
                double rand = Math.random();
                if (rand<0.5){
                    return true;
                }else{
                    return false;
                }
            }
        
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
    
    
    
}
