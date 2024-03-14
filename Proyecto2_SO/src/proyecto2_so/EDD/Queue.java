/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so.EDD;

import proyecto2_so.Character.Character;
import proyecto2_so.Enum.TierEnum;

/**
 *
 * @author andre
 */
public class Queue {

    private Nodo front;
    private Nodo back;
    private int size;

    public Queue() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return getFront() == null;
    }

    public void empty() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }
    
    //Desencolar los nodos que ya llevan 8 ciclos
    public Queue dequeueFullCycle() {
        Queue auxQ = new Queue();
        int queueSize = getSize();
        for (int i = 0; i < queueSize; i++) {
            
            Nodo pAux = dequeue();
            if(pAux != null){
            if (pAux.getCycle() == 8 ) {
                pAux.setCycle(0);
                auxQ.queue(pAux);
                
            }else {
                pAux.setCycle(pAux.getCycle() + 1);
                queue(pAux);

            } }
        }

        return auxQ;
    }

    //Encola los nodos que deben cambiar de cola (completaron un ciclo)
    public void queueFullCycleNodes(Queue cycleQueue, TierEnum newTier) {
        System.out.println(cycleQueue.getSize());
        System.out.println(cycleQueue.isEmpty());
        
        if(!cycleQueue.isEmpty()){
        Nodo pAux=cycleQueue.dequeue();
            
            
            while(pAux !=null){
            
            pAux.getCharacter().setTier(newTier);
            queue(pAux);
            pAux = cycleQueue.dequeue();}
            
            
            
        }

    }

    public void queue(Character character, int id, int cycle) {
        Nodo newNodo = new Nodo(character, id, cycle);
        if (isEmpty()) {
            setFront(newNodo);
            setBack(newNodo);

        } else {
            getBack().setpNext(newNodo);
            setBack(newNodo);

        }
        setSize(getSize() + 1);

    }

    public void queue(Nodo newNodo) {
        newNodo.setpNext(null);
        if (isEmpty()) {
            setFront(newNodo);
            setBack(newNodo);

        } else {
            getBack().setpNext(newNodo);
            setBack(newNodo);

        }
        setSize(getSize() + 1);

    }

    public Nodo dequeue() {
        Nodo ret = null;
        if(getSize()==1){
            empty();
        }
        if (!isEmpty()) {
            ret = getFront();

            setFront(getFront().getpNext());
            setSize(getSize() - 1);

        }
        return ret;
    }

    public Character dequeueCharacter() {
        Character ret = null;

        if (!isEmpty()) {
            ret = getFront().getCharacter();
            dequeue();
        }
        return ret;
    }

    public String[] toArray() {
        try {
            if (!isEmpty()) {
                String[] array = new String[getSize()];
                Nodo ch = null;
                for (int i = 0; i < array.length; i++) {
                    ch = dequeue();
                    array[i] = ch.getId() + ": " + ch.getCharacter().getName();
                    queue(ch);
                }

                return array;

            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @return the front
     */
    public Nodo getFront() {
        return front;
    }

    /**
     * @param front the front to set
     */
    public void setFront(Nodo front) {
        this.front = front;
    }

    /**
     * @return the back
     */
    public Nodo getBack() {
        return back;
    }

    /**
     * @param back the back to set
     */
    public void setBack(Nodo back) {
        this.back = back;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

   public void print(){
        Nodo aux = this.getFront();
        Nodo in=aux;
        do{
            System.out.println(front.getCharacter().getName());
            dequeue();
            queue(in);
            in=this.getFront();
        }while(aux!=in);
        System.out.println("done");
    }
    
}
