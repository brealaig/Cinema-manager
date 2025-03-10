package ComandoConexionVista;

import Interfaces.Comando;
import Fachadas.FachadaCompraBoleta;
import java.util.ArrayList;

public class ComandoCreacionBoleta implements Comando{
    
    private FachadaCompraBoleta fachada;
    private int numeroCliente;
    private ArrayList<String> pedido;
    private ArrayList<Integer> asientos;
    private int numeroFuncion;
    
    public ComandoCreacionBoleta(FachadaCompraBoleta fachada, int numeroCliente, ArrayList<String> pedido, ArrayList<Integer> asientos, int numeroFuncion){
        this.fachada = fachada;
        this.numeroCliente = numeroCliente;
        this.pedido = pedido;
        this.asientos = asientos;
        this.numeroFuncion = numeroFuncion;
    }
    
    @Override
    public void accion(){
        fachada.comprarBoleta(numeroCliente, pedido, asientos ,numeroFuncion);
    }
    
}
