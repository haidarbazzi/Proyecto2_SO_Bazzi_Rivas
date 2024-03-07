/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2_so;

/**
 *
 * @author andre
 */
public class Proyecto2_SO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        int sum = 0;
        String woed = "vord";
        for (int i = 0; i<woed.length(); i++){
            int char1 = woed.charAt(i);
            sum += char1;
        }
        System.out.println(sum);
    }
    
    
}
