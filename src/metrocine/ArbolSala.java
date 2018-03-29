
package metrocine;


public class ArbolSala {
    private Sala raiz;
    
    //Metodos
      public boolean estaVacio() {
        
        return this.raiz == null;
        
    }
    
    public void InsertarSalas(Sala aux, Sala nuevo){
                   if (estaVacio()) {
            
            this.raiz = nuevo;
            
        }else if (nuevo.getNumero() < aux.getNumero()) {
            
            if (aux.gethIzquierdo() == null) {
                
		aux.sethIzquierdo(nuevo);
                
            }else {
                
                this.insertarSucursal(aux.gethIzquierdo(), nuevo);
                
            }
            
        }else if (nuevo.getCodigo()> aux.getCodigo()) {
            
            if (aux.gethDerecho() == null) {
                
		aux.sethDerecho(nuevo);
                
            }else {
                
		this.insertarSucursal(aux.gethDerecho(), nuevo);
                
            }
            
        }else{
            
            System.out.println("Dicho nodo ya se encuentra dentro del árbol");
            
        }
    }
    
    //getters y setters
    public Sala getRaiz() {
        return raiz;
    }

    public void setRaiz(Sala raiz) {
        this.raiz = raiz;
    }
    
    
}
