/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so.EDD;
import proyecto2_so.Character.Character;

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
        this.size = 0 ;
    }
    
    public boolean isEmpty(){
        return getFront()==null;
    }
    
    //Desencolar los nodos que ya llevan 8 ciclos
    public Queue dequeueFullCycle(){
        Queue auxQ = new Queue();
        int size1 = this.size;
        for (int i =0; i<size1;i++){
            Nodo pAux = this.dequeue();
            if(pAux.getCycle() == 8){
                pAux.setCycle(0);
                auxQ.queue(pAux);
            } else {
            pAux.setCycle(pAux.getCycle()+1);
            this.queue(pAux);
            }
        }
        return auxQ;
    }
    
    //Encola los nodos que deben cambiar de cola (completaron un ciclo)
    public void queueFullCycleNodes(Queue cycleQueue){
        
        for (int i=0; i<cycleQueue.getSize();i++){
            Nodo pAux =cycleQueue.dequeue();
            this.queue(pAux);
        }
    }
    
    public void queue(Character character, int id, int cycle){
        Nodo newNodo = new Nodo(character, id, cycle);
        if(isEmpty()){
            setFront(newNodo);
            setBack(newNodo);
        }else{
            getBack().setpNext(newNodo);
            setBack(newNodo);
            setSize(getSize()+1);
        }
        
    }
    public void queue(Nodo newNodo){
        if(isEmpty()){
            setFront(newNodo);
            setBack(newNodo);
        }else{
            getBack().setpNext(newNodo);
            setBack(newNodo);
            setSize(getSize()+1);
        }
        
    }
    
    public Nodo dequeue(){
        Nodo ret = null;
        if(!isEmpty()){
            ret = getFront();
            setFront(getFront().getpNext());
            setSize(getSize()-1);
        }
        return ret;
    }
    public Character dequeueCharacter(){
        Character ret = null;
        if(!isEmpty()){
            ret = getFront().getCharacter();
            setFront(getFront().getpNext());
            setSize(getSize()-1);
        }
        return ret;
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
    
}
