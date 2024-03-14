/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so.Disk;

import java.util.concurrent.Semaphore;
import proyecto2_so.EDD.Queue;
import proyecto2_so.Character.Character;

/**
 *
 * @author andre
 */
public class Buffer {
    
    
    //personajes
    private Character[] nickCharacters = new Character[20];
    private Character[] cartoonCharacters = new Character[20];
    
    //listas de ganadores
    private Queue nickWinners = new Queue();
    private Queue cartoonWinners = new Queue();
    
    //colas de Nick
    private Queue nickTier1Queue = new Queue();
    private Queue nickTier2Queue = new Queue();
    private Queue nickTier3Queue = new Queue();
    private Queue nickEffortQueue = new Queue();
    
    //colas de Cartoon
    private Queue cartoonTier1Queue = new Queue();
    private Queue cartoonTier2Queue = new Queue();
    private Queue cartoonTier3Queue = new Queue();
    private Queue cartoonEffortQueue = new Queue();
    
    //semaforos de sincronizacion
    private final Semaphore s1 = new Semaphore(0);
    private final Semaphore s2 = new Semaphore(0);
    
    //contador de ciclos
    private int numCycle = 0;
    
    //luchadores 
    private Character nickFighter;
    private Character cartoonFighter;
    
    //simulacion
    private int simSpeed=2000;
    private int nextSim = 8000;

    public Buffer() {
    }

    /**
     * @return the nickCharacters
     */
    public Character[] getNickCharacters() {
        return nickCharacters;
    }

    /**
     * @param nickCharacters the nickCharacters to set
     */
    public void setNickCharacters(Character[] nickCharacters) {
        this.nickCharacters = nickCharacters;
    }

    /**
     * @return the cartoonCharacters
     */
    public Character[] getCartoonCharacters() {
        return cartoonCharacters;
    }

    /**
     * @param cartoonCharacters the cartoonCharacters to set
     */
    public void setCartoonCharacters(Character[] cartoonCharacters) {
        this.cartoonCharacters = cartoonCharacters;
    }

    /**
     * @return the nickWinners
     */
    public Queue getNickWinners() {
        return nickWinners;
    }

    /**
     * @param nickWinners the nickWinners to set
     */
    public void setNickWinners(Queue nickWinners) {
        this.nickWinners = nickWinners;
    }

    /**
     * @return the cartoonWinners
     */
    public Queue getCartoonWinners() {
        return cartoonWinners;
    }

    /**
     * @param cartoonWinners the cartoonWinners to set
     */
    public void setCartoonWinners(Queue cartoonWinners) {
        this.cartoonWinners = cartoonWinners;
    }

    /**
     * @return the nickTier1Queue
     */
    public Queue getNickTier1Queue() {
        return nickTier1Queue;
    }

    /**
     * @param nickTier1Queue the nickTier1Queue to set
     */
    public void setNickTier1Queue(Queue nickTier1Queue) {
        this.nickTier1Queue = nickTier1Queue;
    }

    /**
     * @return the nickTier2Queue
     */
    public Queue getNickTier2Queue() {
        return nickTier2Queue;
    }

    /**
     * @param nickTier2Queue the nickTier2Queue to set
     */
    public void setNickTier2Queue(Queue nickTier2Queue) {
        this.nickTier2Queue = nickTier2Queue;
    }

    /**
     * @return the nickTier3Queue
     */
    public Queue getNickTier3Queue() {
        return nickTier3Queue;
    }

    /**
     * @param nickTier3Queue the nickTier3Queue to set
     */
    public void setNickTier3Queue(Queue nickTier3Queue) {
        this.nickTier3Queue = nickTier3Queue;
    }

    /**
     * @return the nickEffortQueue
     */
    public Queue getNickEffortQueue() {
        return nickEffortQueue;
    }

    /**
     * @param nickEffortQueue the nickEffortQueue to set
     */
    public void setNickEffortQueue(Queue nickEffortQueue) {
        this.nickEffortQueue = nickEffortQueue;
    }

    /**
     * @return the cartoonTier1Queue
     */
    public Queue getCartoonTier1Queue() {
        return cartoonTier1Queue;
    }

    /**
     * @param cartoonTier1Queue the cartoonTier1Queue to set
     */
    public void setCartoonTier1Queue(Queue cartoonTier1Queue) {
        this.cartoonTier1Queue = cartoonTier1Queue;
    }

    /**
     * @return the cartoonTier2Queue
     */
    public Queue getCartoonTier2Queue() {
        return cartoonTier2Queue;
    }

    /**
     * @param cartoonTier2Queue the cartoonTier2Queue to set
     */
    public void setCartoonTier2Queue(Queue cartoonTier2Queue) {
        this.cartoonTier2Queue = cartoonTier2Queue;
    }

    /**
     * @return the cartoonTier3Queue
     */
    public Queue getCartoonTier3Queue() {
        return cartoonTier3Queue;
    }

    /**
     * @param cartoonTier3Queue the cartoonTier3Queue to set
     */
    public void setCartoonTier3Queue(Queue cartoonTier3Queue) {
        this.cartoonTier3Queue = cartoonTier3Queue;
    }

    /**
     * @return the cartoonEffortQueue
     */
    public Queue getCartoonEffortQueue() {
        return cartoonEffortQueue;
    }

    /**
     * @param cartoonEffortQueue the cartoonEffortQueue to set
     */
    public void setCartoonEffortQueue(Queue cartoonEffortQueue) {
        this.cartoonEffortQueue = cartoonEffortQueue;
    }

    /**
     * @return the s1
     */
    public Semaphore getS1() {
        return s1;
    }

   
    /**
     * @return the s2
     */
    public Semaphore getS2() {
        return s2;
    }

   
    /**
     * @return the numCycle
     */
    public int getNumCycle() {
        return numCycle;
    }

    /**
     * @param numCycle the numCycle to set
     */
    public void setNumCycle(int numCycle) {
        this.numCycle = numCycle;
    }

    /**
     * @return the nickFighter
     */
    public Character getNickFighter() {
        return nickFighter;
    }

    /**
     * @param nickFighter the nickFighter to set
     */
    public void setNickFighter(Character nickFighter) {
        this.nickFighter = nickFighter;
    }

    /**
     * @return the cartoonFighter
     */
    public Character getCartoonFighter() {
        return cartoonFighter;
    }

    /**
     * @param cartoonFighter the cartoonFighter to set
     */
    public void setCartoonFighter(Character cartoonFighter) {
        this.cartoonFighter = cartoonFighter;
    }

    /**
     * @return the simSpeed
     */
    public int getSimSpeed() {
        return simSpeed;
    }

    /**
     * @param simSpeed the simSpeed to set
     */
    public void setSimSpeed(int simSpeed) {
        this.simSpeed = simSpeed;
    }

    /**
     * @return the nextSim
     */
    public int getNextSim() {
        return nextSim;
    }
    
    public void setNextSim(int nextSim){
        this.nextSim = nextSim;
    }
    
    
    
}
