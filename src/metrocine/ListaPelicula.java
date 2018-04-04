
package metrocine;

public class ListaPelicula {
    private Pelicula cabeza;
    
    public boolean EstaVacia(){
        return this.cabeza==null;
    }
    public void InsertarPelicula(Pelicula nueva){
        if(!this.EstaVacia()){
            nueva.setProximaPelicula(this.cabeza);
        }
        this.cabeza=nueva;
    }
    public Pelicula BuscarPorUbicacion(int posicion){
        
        if(posicion < 1 || posicion > this.contarNodos() + 1){
            
            return null;
            
        }else{
            
            if(posicion == 1){
               
               return this.cabeza;
            
            }else {
            
               Pelicula aux = this.cabeza;
                
                for(int cuenta = 1; cuenta < posicion ; cuenta++) {
                    
                    aux = aux.getProximaPelicula();
                    
                }
                return aux;

                
            }
            
        }
    }
    
    public int contarNodos(){
        int cont=0;
        Pelicula aux=this.cabeza;
        for(;aux!=null;cont++){
            aux=aux.getProximaPelicula();
        }
        return cont;
    }
    /*
    public  ListaPelicula BuscarPelicula(String genero, String idioma){
            
        while()
        
        return null;
        
    }*/
    
}
