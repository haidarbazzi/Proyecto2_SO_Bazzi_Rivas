/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so.Enum;

/**
 *
 * @author andre
 */
public enum TypeEnum {
    
    MASTER(0),
    SKILLED(1),
    AVERAGE(2),
    DEFICIENT(3),
    WEAK(4);
    
     private final int id;
    
    private TypeEnum(int id){
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    
    
}
