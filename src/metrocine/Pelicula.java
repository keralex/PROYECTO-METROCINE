package metrocine;


public class Pelicula                                                      {

    private String genero;
    private String idioma;
    private String nombre;
    private Pelicula proximaPelicula;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pelicula getProximaPelicula() {
        return proximaPelicula;
    }

    public void setProximaPelicula(Pelicula proximaPelicula) {
        this.proximaPelicula = proximaPelicula;
    }
    
    
    

}