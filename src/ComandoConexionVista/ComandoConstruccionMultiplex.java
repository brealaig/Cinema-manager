package ComandoConexionVista;


import Interfaces.Comando;
import Fachadas.FachadaConstruccionMultiplex;

public class ComandoConstruccionMultiplex implements Comando{
    
    private FachadaConstruccionMultiplex fachada;
    private String identificadorMultiplex;
    private int cantidadSalas;
    
    public ComandoConstruccionMultiplex(FachadaConstruccionMultiplex fachada, String identificadorMultiplex, int cantidadSalas){
        this.fachada = fachada;
        this.identificadorMultiplex = identificadorMultiplex;
        this.cantidadSalas = cantidadSalas;
    }
    
    @Override
    public void accion(){
        fachada.construirMultiplex(identificadorMultiplex, cantidadSalas);
    }
    
}
