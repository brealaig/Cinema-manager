package Fachadas;

import Interfaces.Fachada;
import Funciones.Pelicula;
import BasesDeDatos.PeliculasDB;

public class FachadaCreacionPelicula implements Fachada{
    
    private Pelicula pelicula;
    private PeliculasDB peliculasDB;
    private static FachadaCreacionPelicula fachada;
    
    private FachadaCreacionPelicula(){
        this.peliculasDB = PeliculasDB.getConexion();
    }
    
    public static FachadaCreacionPelicula getFachada(){
        if (fachada == null){
            fachada = new FachadaCreacionPelicula();
        }
        return fachada;
    }
    
    public void crearPelicula(String nombre, String genero, String duracion, String director, String descripcion){
        
        int numeroPelicula = peliculasDB.getNumeroPelicula();
        
        this.pelicula = new Pelicula(nombre,genero,duracion,director,descripcion,numeroPelicula);
        
        peliculasDB.subirPelicula(pelicula);
    }
    
    public Pelicula getPelicula(int index){
        pelicula = peliculasDB.getPelicula(index);
        return pelicula;
    }
    
}
