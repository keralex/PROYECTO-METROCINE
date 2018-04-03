
package metrocine;


public class Cliente extends Persona{
    
    private String nombre;
    private int Cedula;
    private int telefono;
    private Carro carro;
    private Cliente hIzquierdo;
     private Cliente hDerecho;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente gethIzquierdo() {
        return hIzquierdo;
    }

    public void sethIzquierdo(Cliente hIzquierdo) {
        this.hIzquierdo = hIzquierdo;
    }

    public Cliente gethDerecho() {
        return hDerecho;
    }

    public void sethDerecho(Cliente hDerecho) {
        this.hDerecho = hDerecho;
    }

    
    
}
