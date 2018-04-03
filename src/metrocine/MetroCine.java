
package metrocine;


public class MetroCine {
    
    private ArbolSucursal sucursales;
    private ListaPelicula peliculas;
    private ArbolCliente clientes;
    
    
    public MetroCine(){
        sucursales= new ArbolSucursal();
        peliculas=new ListaPelicula();
        clientes=new ArbolCliente();
        Sucursal Guarenas=new Sucursal("Guarenas",3,2,1);
        Sucursal Caracas=new Sucursal("Caracas",1,2,3);
        Sucursal Valencia=new Sucursal("Valencia",1,1,1);
        
        
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
        
       
        
        
        sucursales.insertarSucursal(sucursales.getRaiz(),Guarenas);
        sucursales.insertarSucursal(sucursales.getRaiz(),Caracas);
        sucursales.insertarSucursal(sucursales.getRaiz(),Valencia);
        
    }


    public ArbolSucursal getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArbolSucursal sucursales) {
        this.sucursales = sucursales;
    }
    
    
    
    
    
    
    
    
}
