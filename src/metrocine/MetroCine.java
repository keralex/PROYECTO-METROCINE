
package metrocine;


public class MetroCine {
    
    private ArbolSucursal sucursales;
    
    public MetroCine(){
        sucursales= new ArbolSucursal();
        Sucursal Guarenas=new Sucursal(1234,"Guarenas",3,2,1);
        Sucursal Caracas=new Sucursal(8546,"Caracas",1,2,3);
        Sucursal Valencia=new Sucursal(8974,"Valencia",1,1,1);
        
        
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
