
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
    /*
    public  ListaPelicula BuscarPelicula(String genero, String idioma){
            
        while()
        
        return null;
        
    }*/
    
}
