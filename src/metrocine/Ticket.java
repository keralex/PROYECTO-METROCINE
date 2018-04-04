
package metrocine;

import java.util.Random;
public class Ticket {
    private Ticket ProximoTicket;
    private int Codigo;
    private Sucursal sucursal;
    private int TipoSala;
    private float precio=100000;
    private Cliente cliente;
    
    public Ticket(Sucursal sucursal,int TipoSala,Cliente cliente){
        this.Codigo=this.crearCodigo();
        this.cliente=cliente;
        this.TipoSala=TipoSala;
        this.sucursal=sucursal;
        
        
    }
    public float precioSala(Sala sala){
        float p=100000;
        switch (sala.getTipo()) {
            case 3:
                p=(float) (p*1.5);
                break;
            case 2:
                p=(float) (p*1.2);
                break;
            default:
                return p;
        }
       return p;
    }
     public int crearCodigo(){
        int numero = (int) (Math.random() * 9999999) + 1000000;
        return numero;
    }
    public Ticket getProximoTicket() {
        return ProximoTicket;
    }

    public void setProximoTicket(Ticket ProximoTicket) {
        this.ProximoTicket = ProximoTicket;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
