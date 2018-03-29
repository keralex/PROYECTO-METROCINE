
package metrocine;

import java.util.Random;


public class Sala {

    private int numero;
    
    // 2= 2d, 3=3d, 4=4DX
    private int tipo;
    private ListaPelicula peliculas;
    private Sala hIzquierdo;
    private Sala hDerecho;
    //Constructor
    
    public Sala(int numero, int tipo){
        this.numero=numero;

        this.tipo=tipo;
    }
    
    //Metodos
  
    //getters y setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public ListaPelicula getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ListaPelicula peliculas) {
        this.peliculas = peliculas;
    }

    public Sala gethIzquierdo() {
        return hIzquierdo;
    }

    public void sethIzquierdo(Sala hIzquierdo) {
        this.hIzquierdo = hIzquierdo;
    }

    public Sala gethDerecho() {
        return hDerecho;
    }

    public void sethDerecho(Sala hDerecho) {
        this.hDerecho = hDerecho;
    }
    
    
    
}
