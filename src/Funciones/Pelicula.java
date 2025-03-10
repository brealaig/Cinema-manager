package Funciones;

public class Pelicula {
    
    private String nombre;
    private String genero;
    private String duracion;
    private String director;
    private String descripcion;
    private int numeroPelicula;
    
    public Pelicula(String nombre, String genero, String duracion, String director, String descripcion, int numeroPelicula){
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
        this.descripcion = descripcion;
        this.numeroPelicula = numeroPelicula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public String getDuracion(){
        return duracion;
    }
    
    public String getDirector(){
        return director;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public int getNumeroPelicula(){
        return numeroPelicula;
    }
    
}
