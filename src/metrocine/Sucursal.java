/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocine;

import java.util.Random;

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
    private ListaPelicula peliculas;
    
    //constructor 
    
    public Sucursal(String ubicacion, int cant2D, int cant3D, int cant4D){
        this.codigo=this.crearCodigo();
        this.ubicacion=ubicacion;
        salas=new ArbolSala();
        this.AgregarSalas(cant2D, cant3D, cant4D);
    }
    
    //metodos  
    
    //Crear codigo random
    
    public int crearCodigo(){
        int numero = (int) (Math.random() * 9999) + 1000;
        return numero;
    }
    //agregar salas ssegun su tipo 
    public void AgregarSalas(int cantDosD, int canTresD, int cantCuatroD){
        for(int i=0;i<cantDosD;i++){
            this.AgregarSala2D();
        }
        for(int i=0;i<canTresD;i++){
            this.AgregarSala3D();
        }
        for(int i=0;i<cantCuatroD;i++){
            this.AgregarSala4DX();
        }
    }
    
    //esto es para agregar el tipo de sala y el numero de sala
    public void AgregarSala2D(){
       salas.InsertarSalas(salas.getRaiz(), new Sala(salas.contarNodos(salas.getRaiz())+1,2));
    }
    public void AgregarSala3D(){
        salas.InsertarSalas(salas.getRaiz(), new Sala(salas.contarNodos(salas.getRaiz())+1,3));
    }
    public void AgregarSala4DX(){
        salas.InsertarSalas(salas.getRaiz(), new Sala(salas.contarNodos(salas.getRaiz())+1,4));
    }
    
//Agregar Peliculas
    
    public void AgregarPelicula(String genero,String idioma, String nombre){
    
    }

    //getters y setters
    
    
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
