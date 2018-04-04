/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocine;

/**
 *
 * @author Estudiantes
 */
public class PilaTickets {
    private Ticket cabeza;

    public Ticket getCabeza() {
        return cabeza;
    }

    public void setCabeza(Ticket cabeza) {
        this.cabeza = cabeza;
    }
    
    public boolean estaVacia() {
        
        return this.cabeza == null;
        
    }
    public void Push(Ticket nuevo){
        if(!this.estaVacia()){
         
            nuevo.setProximoTicket(this.cabeza);
            
        }
    
        this.cabeza = nuevo;
    }
    
    public void Pop(){
         
        if(! this.estaVacia()){
            
            this.cabeza = this.cabeza.getProximoTicket();
            
        }
    }
   
    
}
