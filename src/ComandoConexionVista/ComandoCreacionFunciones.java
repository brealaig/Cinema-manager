package ComandoConexionVista;


import Interfaces.Comando;
import Fachadas.FachadaCreacionFunciones;
import Multiplex.Multiplex;

public class ComandoCreacionFunciones implements Comando{
    
    private FachadaCreacionFunciones fachada;
    private int numeroPelicula;
    private Multiplex multiplex;
    private int numeroSala;
    private String hora;
    
    public ComandoCreacionFunciones(FachadaCreacionFunciones fachada, int numeroPelicula, Multiplex multiplex, int numeroSala, String hora){
        this.fachada = fachada;
        this.numeroPelicula = numeroPelicula;
        this.multiplex = multiplex;
        this.numeroSala = numeroSala;
        this.hora = hora;
    }
    
    @Override
    public void accion(){
        fachada.crearFuncion(numeroPelicula, multiplex, numeroSala, hora);
    }
    
}