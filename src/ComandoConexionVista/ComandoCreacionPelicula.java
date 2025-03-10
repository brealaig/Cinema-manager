package ComandoConexionVista;


import Interfaces.Comando;
import Fachadas.FachadaCreacionPelicula;

public class ComandoCreacionPelicula implements Comando{
    
    private FachadaCreacionPelicula fachada;
    private String nombre;
    private String genero;
    private String duracion;
    private String director;
    private String descripcion;
    
    public ComandoCreacionPelicula(FachadaCreacionPelicula fachada, String nombre, String genero, String duracion, String director, String descripcion){
        this.fachada = fachada;
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
        this.descripcion = descripcion;
    }
    
    @Override
    public void accion(){
        fachada.crearPelicula(nombre, genero, duracion, director, descripcion);
    }
    
}
