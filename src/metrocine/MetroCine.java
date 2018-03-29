
package metrocine;


public class MetroCine {
    
    private ArbolSucursal sucursales;
   
    
    public MetroCine(){
        sucursales= new ArbolSucursal();
        
        sucursales.insertarSucursal(sucursales.getRaiz(),new Sucursal(1234,"Guarenas",3,2,1));
        sucursales.insertarSucursal(sucursales.getRaiz(),new Sucursal(8546,"Caracas",1,2,3));
        sucursales.insertarSucursal(sucursales.getRaiz(),new Sucursal(8974,"Valencia",1,1,1));
        
    }
    

    public ArbolSucursal getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArbolSucursal sucursales) {
        this.sucursales = sucursales;
    }
    
    
    
    
    
    
    
    
}
