
package metrocine;


public class MetroCine {
    
    private ArbolSucursal sucursales;
   
    
    public MetroCine(){
        sucursales= new ArbolSucursal();
        
        sucursales.insertarSucursal(sucursales.getRaiz(),new Sucursal(1234,"Guarenas"));
        sucursales.insertarSucursal(sucursales.getRaiz(),new Sucursal(8546,"Caracas"));
        sucursales.insertarSucursal(sucursales.getRaiz(),new Sucursal(8974,"Valencia"));
        
    }
    

    public ArbolSucursal getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArbolSucursal sucursales) {
        this.sucursales = sucursales;
    }
    
    
    
    
    
    
    
    
}
