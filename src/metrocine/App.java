/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocine;




/**
 *
 * @author kerlis
 */
public class App {

    /**
     * @param args the command line arguments
     */
    private static MetroCine cine;
  
         
   
     
    public static void main(String[] args) {
        // TODO code application logic here
        cine=new MetroCine();
        Inicio inicio=new Inicio(cine);
        inicio.setVisible(true);
    }
    
}
