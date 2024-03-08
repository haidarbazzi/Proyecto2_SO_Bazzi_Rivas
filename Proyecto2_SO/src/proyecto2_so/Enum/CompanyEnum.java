/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so.Enum;

/**
 *
 * @author andre
 */
public enum CompanyEnum {
    
    NICKELODEON(0),
    CARTOONNETWORK(1),;
    
    private final int id;
    
    
    private CompanyEnum(int id){
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

}
