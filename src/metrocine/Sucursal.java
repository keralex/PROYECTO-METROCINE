/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocine;

/**
 *
 * @author kerlis
 */
public class Sucursal {
    private int codigo;
    private String ubicacion;
    private Sucursal hIzquierdo;
    private Sucursal hDerecho;
    private ArbolSala salas;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Sucursal gethIzquierdo() {
        return hIzquierdo;
    }

    public void sethIzquierdo(Sucursal hIzquierdo) {
        this.hIzquierdo = hIzquierdo;
    }

    public Sucursal gethDerecho() {
        return hDerecho;
    }

    public void sethDerecho(Sucursal hDerecho) {
        this.hDerecho = hDerecho;
    }

    public ArbolSala getSalas() {
        return salas;
    }

    public void setSalas(ArbolSala salas) {
        this.salas = salas;
    }
    
    
    
            
}
