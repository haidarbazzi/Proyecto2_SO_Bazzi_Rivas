/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_so;

import proyecto2_so.Disk.Buffer;
import proyecto2_so.Enum.CompanyEnum;
import proyecto2_so.Interfaces.MainWindow;
import proyecto2_so.Character.Character;
import proyecto2_so.System.Administrator;
/**
 *
 * @author andre
 */
public class Init {
    
    public Init(){}
    
    public void init(){
        MainWindow main= new MainWindow();
        Buffer buffer = new Buffer();
        
        for (int i = 0; i < 20; i++) {
            buffer.getNickCharacters()[i]= new Character("personaje"+String.valueOf(i), i, CompanyEnum.NICKELODEON);
            buffer.getCartoonCharacters()[i]= new Character("personaje"+String.valueOf(i), i, CompanyEnum.CARTOONNETWORK);
            
                  
        }
        
        Administrator admin = new Administrator(buffer, main,19);
        admin.createNewCharacter();
    
    }
    
}
