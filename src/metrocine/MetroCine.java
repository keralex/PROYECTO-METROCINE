
package metrocine;

import java.util.Random;


public class MetroCine {
    
    private ArbolSucursal sucursales;
    private ListaPelicula peliculas;
    private ArbolCliente clientes;
    private int n;
    Random random=new Random();
    
    
    public MetroCine(){
        sucursales= new ArbolSucursal();
        peliculas=new ListaPelicula();
        clientes=new ArbolCliente();
        
        //crear Sucursales
        Sucursal Guarenas=new Sucursal("Guarenas",3,2,1);
        Sucursal Caracas=new Sucursal("Caracas",1,2,3);
        Sucursal Valencia=new Sucursal("Valencia",1,1,1);
        
        //Agregar Peliculas
        peliculas.InsertarPelicula(new Pelicula("Terror","Español","SAW"));
        peliculas.InsertarPelicula(new Pelicula("Terror","Ingles","SAW"));
        
        peliculas.InsertarPelicula(new Pelicula("Comedia","Español","Jumanji"));
        peliculas.InsertarPelicula(new Pelicula("Comedia","Ingles","Jumanji"));
        
        peliculas.InsertarPelicula(new Pelicula("Drama","Español","Maria Magdalena"));
        peliculas.InsertarPelicula(new Pelicula("Drama","Ingles","Maria Magdalena"));
        
        peliculas.InsertarPelicula(new Pelicula("Fantasia","Español","Un Viaje en el Tiempo"));
        peliculas.InsertarPelicula(new Pelicula("Fantasia","Ingles","Un Viaje en el Tiempo"));
        
        peliculas.InsertarPelicula(new Pelicula("Accion","Español","Pantera Negra"));
        peliculas.InsertarPelicula(new Pelicula("Accion","Ingles","Pantera Negra"));
        //Agregar Sucursales al arbol     
        
        
        sucursales.insertarSucursal(sucursales.getRaiz(),Guarenas);
        sucursales.insertarSucursal(sucursales.getRaiz(),Caracas);
        sucursales.insertarSucursal(sucursales.getRaiz(),Valencia);
        
        
        //Agregar Pelicula a Sala
       this.AgregarPelicula(Caracas.getSalas().getRaiz());
       this.AgregarPelicula(Guarenas.getSalas().getRaiz());
       this.AgregarPelicula(Valencia.getSalas().getRaiz());
        
        
    }
    public void AgregarPelicula(Sala aux){
        
         if(aux != null){
            
            this.AgregarPelicula(aux.gethIzquierdo());
            n=random.nextInt(peliculas.contarNodos())+1;
            aux.setPelicula( peliculas.BuscarPorUbicacion(n));
             System.out.println(aux.getPelicula().getNombre());
            this.AgregarPelicula(aux.gethDerecho()); 
            
        }
    }
    

    public ArbolSucursal getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArbolSucursal sucursales) {
        this.sucursales = sucursales;
    }

    public ListaPelicula getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ListaPelicula peliculas) {
        this.peliculas = peliculas;
    }

    public ArbolCliente getClientes() {
        return clientes;
    }

    public void setClientes(ArbolCliente clientes) {
        this.clientes = clientes;
    }
    
    
    
    
    
    
    
    
    
}
