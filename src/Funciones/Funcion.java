package Funciones;

import Multiplex.Multiplex;
import Interfaces.IComponente;

public class Funcion {
    
    private Pelicula pelicula;
    private Multiplex multiplex;
    private IComponente sala;
    private String hora;
    private int numeroFuncion;
    
    public Funcion(Pelicula pelicula, Multiplex multiplex, IComponente sala, String hora, int numeroFuncion){
        this.pelicula = pelicula;
        this.multiplex = multiplex;
        this.sala = sala;
        this.hora = hora;
        this.numeroFuncion = numeroFuncion;
    }
    
    public Pelicula getPelicula(){
        return pelicula;
    }
    
    public IComponente getMultiplex(){
        return multiplex;
    }
    
    public IComponente getSala(){
        return sala;
    }
    
    public String getHora(){
        return hora;
    }    
}
