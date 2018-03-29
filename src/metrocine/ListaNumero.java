/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocine;

/**
 *
 * @author Luis Aguado
 */
public class ListaNumero {
    
    private NodoNumero cabeza;
    
    
     public boolean estaVacia() {
        
        return this.cabeza == null;
        
    }
     
        public int contarNodos(){
        
        int cuenta = 0;
        
        NodoNumero aux = this.cabeza;
        
        for(; aux != null; cuenta++){
            
            aux = aux.getNodoProximo();
        
        }
        
        return cuenta;
    }
    
    public void insertarPrimero(NodoNumero nuevoNodo){
        
        if(!this.estaVacia()){
         
            nuevoNodo.setNodoProximo(this.cabeza);
            
        }
    
        this.cabeza = nuevoNodo;
  
    }
}
