package Fachadas;

import Interfaces.Fachada;
import Interfaces.IComponente;
import Funciones.*;
import Multiplex.Multiplex;
import Multiplex.Sala;
import BasesDeDatos.FuncionesDB;
import BasesDeDatos.PeliculasDB;

public class FachadaCreacionFunciones implements Fachada{

    private Funcion funcion;
    private PeliculasDB peliculasDB;
    private FuncionesDB funcionesDB;
    private static FachadaCreacionFunciones fachada;
    
    private FachadaCreacionFunciones(){
        this.peliculasDB = PeliculasDB.getConexion();
        this.funcionesDB = FuncionesDB.getConexion();
    }
    
    public static FachadaCreacionFunciones getFachada(){
        if (fachada == null){
            fachada = new FachadaCreacionFunciones();
        }
        return fachada;
    }
    
    public void crearFuncion(int numeroPelicula, Multiplex multiplex, int numeroSala, String hora){
        
        Pelicula pelicula = peliculasDB.getPelicula(numeroPelicula);
        
        IComponente sala = multiplex.getComponentes().get(numeroSala);
        
        int numeroFuncion = funcionesDB.getNumeroFuncion();
        
        this.funcion = new Funcion(pelicula, multiplex, sala, hora, numeroFuncion);
        
        funcionesDB.subirFuncion(funcion);
        
    }
    
    public Funcion getFuncion(int index){
        funcion = funcionesDB.getFuncion(index);
        return funcion;
    }
    
}
