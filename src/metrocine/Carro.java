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
class Carro {
    
    private  PilaTickets tickets;
    private int ticketsT; 
    private float monto;

    public int getTicketsT() {
        return ticketsT;
    }

    public void setTicketsT(int ticketsT) {
        this.ticketsT = ticketsT;
    }
  
    
     public float getMonto() {
        return monto;
    }
     
     public PilaTickets getTickets() {
        return tickets;
    }

    public void setTickets(PilaTickets tickets) {
        this.tickets = tickets;
    }
    
}
