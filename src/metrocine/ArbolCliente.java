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
public class ArbolCliente {
    
    private Cliente raiz;
    
     public boolean estaVacio() {
        
        return this.raiz == null;
        
    }
     
    public void InsertarCliente(Cliente aux, Cliente nuevo){
                   if (estaVacio()) {
            
            this.raiz = nuevo;
            
        }else if (nuevo.getCedula()< aux.getCedula()) {
            
            if (aux.gethIzquierdo() == null) {
                
		aux.sethIzquierdo(nuevo);
                
            }else {
                this.InsertarCliente(aux.gethIzquierdo(), nuevo);
                
            }
            
        }else if (nuevo.getCedula()> aux.getCedula()) {
            
            if (aux.gethDerecho() == null) {
                
		aux.sethDerecho(nuevo);
                
            }else {
                this.InsertarCliente(aux.gethDerecho(), nuevo);
	
                
            }
            
        }else{
            
            System.out.println("Dicho nodo ya se encuentra dentro del árbol");
            
        }
    }
    
      public int contarClientes(Cliente aux) {
        
        if(aux == null) {
            
            return 0;
            
        }else {
            
            return 1 + this.contarClientes(aux.gethIzquierdo())+ this.contarClientes(aux.gethDerecho());
            
        }
        
    }
      
      
         public Cliente buscarCliente(Cliente aux, int key) {
        
        if (aux != null) {
            
            if (key < aux.getCedula()) {

                return this.buscarCliente(aux.gethIzquierdo(), key);

            }else if (key > aux.getCedula()) {

                return this.buscarCliente(aux.gethDerecho(), key);

            }else {
                
                return aux;
                
            }
            
        }
        
        return null;
        
    }

    public Cliente getRaiz() {
        return raiz;
    }

    public void setRaiz(Cliente raiz) {
        this.raiz = raiz;
    }
         
         
}
