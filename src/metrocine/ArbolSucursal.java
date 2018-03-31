
package metrocine;


public class ArbolSucursal {
    private Sucursal raiz;
    
    //Metodo para ver si esta vacio
     public boolean estaVacio() {
        
        return this.raiz == null;
        
    }
     //Metodo para Insertar alguna sucursal
    
    public void insertarSucursal( Sucursal aux, Sucursal nuevo){
              if (estaVacio()) {
            
            this.raiz = nuevo;
            
        }else if (nuevo.getCodigo() < aux.getCodigo()) {
            
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
    
    public int contarNodos(Sucursal aux) {
        
        if(aux == null) {
            
            return 0;
            
        }else {
            
            return 1 + this.contarNodos(aux.gethIzquierdo())+ this.contarNodos(aux.gethDerecho());
            
        }
        
    }
    
    //Buscar por ubicacion la sucursal
    public Sucursal BuscarPorUbicacion(Sucursal aux, String ubicacion){
            
               
        return null;
        
    }
    
     public void recorrerEnOrden(Sucursal aux) {
        
        if(aux != null){
            
            this.recorrerEnOrden(aux.gethIzquierdo());
            
            aux.Presentar();
            
            this.recorrerEnOrden(aux.gethDerecho()); 
            
        }
        
    }
   
      
 
   
    //Getters setters

    public Sucursal getRaiz() {
        return raiz;
    }

    public void setRaiz(Sucursal raiz) {
        this.raiz = raiz;
    }
    
    
    
    
}
