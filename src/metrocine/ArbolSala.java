
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
                this.InsertarSalas(aux.gethIzquierdo(), nuevo);
                
            }
            
        }else if (nuevo.getNumero()> aux.getNumero()) {
            
            if (aux.gethDerecho() == null) {
                
		aux.sethDerecho(nuevo);
                
            }else {
                this.InsertarSalas(aux.gethDerecho(), nuevo);
	
                
            }
            
        }else{
            
            System.out.println("Dicho nodo ya se encuentra dentro del árbol");
            
        }
    }
    
    public int contarNodos(Sala aux) {
        
        if(aux == null) {
            
            return 0;
            
        }else {
            
            return 1 + this.contarNodos(aux.gethIzquierdo())+ this.contarNodos(aux.gethDerecho());
            
        }
        
    }
       public Sala buscarNodo(Sala aux, int data) {
        
        if (aux != null) {
            
            if (data < aux.getNumero()) {

                return this.buscarNodo(aux.gethIzquierdo(), data);

            }else if (data > aux.getNumero()) {

                return this.buscarNodo(aux.gethDerecho(), data);

            }else {
                
                return aux;
                
            }
            
        }
        
        return null;
        
    }
       
       public Sala BuscarPorPelicula(Sala aux, String nombre){
           if (aux != null) {
            if (aux.getPelicula().getNombre().equals(nombre)) {
                return aux;
            } else {
                if (aux.gethDerecho() != null) {
                    if (!aux.gethDerecho().getPelicula().getNombre().equals(nombre)) {
                        return this.BuscarPorPelicula(aux.gethDerecho(), nombre);
                    } else if (aux.gethDerecho().getPelicula().getNombre().equals(nombre)) {
                        return aux.gethDerecho();
                    }
                }
                if (aux.gethIzquierdo() != null) {
                    if (!aux.gethIzquierdo().getPelicula().getNombre().equals(nombre)) {
                        return this.BuscarPorPelicula(aux.gethIzquierdo(), nombre);
                    } else if (aux.gethIzquierdo().getPelicula().getNombre().equals(nombre)) {
                        return aux.gethIzquierdo();
                    }
                }

            }
        }
        return null;

       }
       
       
       
      
    //getters y setters
    public Sala getRaiz() {
        return raiz;
    }

    public void setRaiz(Sala raiz) {
        this.raiz = raiz;
    }
    
    
}
