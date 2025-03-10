package Fachadas;

import Interfaces.Fachada;
import Interfaces.IComponente;
import Boletas.Boleta;
import Usuarios.TarjetaUsuario;
import Pedidos.Pedido;
import Multiplex.Asiento;
import Funciones.Funcion;
import BasesDeDatos.BoletasDB;
import BasesDeDatos.FuncionesDB;
import BasesDeDatos.UsuarioDB;
import java.util.ArrayList;


public class FachadaCompraBoleta implements Fachada{
    
    private Boleta boleta;
    private BoletasDB boletasDB;
    private FuncionesDB funcionesDB;
    private UsuarioDB usuarioDB;
    private static FachadaCompraBoleta fachada;
    
    private FachadaCompraBoleta(){
        this.boletasDB = boletasDB.getConexion();
        this.funcionesDB = funcionesDB.getConexion();
    }
    
    public static FachadaCompraBoleta getFachada(){
        if (fachada == null){
            fachada = new FachadaCompraBoleta();
        }
        return fachada;
    }
    
    public void comprarBoleta(int numeroCliente, ArrayList<String> pedido, ArrayList<Integer> asientos, int numeroFuncion){
        
        TarjetaUsuario cliente = usuarioDB.getUsuario(numeroCliente);
        
        Pedido pedidoCliente = realizarPedido(pedido);
        
        Funcion funcion = funcionesDB.getFuncion(numeroFuncion);
        
        int numeroBoleta = boletasDB.getNumeroBoleta();
        
        ArrayList<IComponente> asientosBoleta = asignarAsientos(funcion, asientos);
        
        this.boleta = new Boleta(cliente, pedidoCliente, asientosBoleta, funcion, numeroBoleta);
        
        boleta.calcularPrecio();
        
        boletasDB.subirBoleta(boleta);
    }
    
    public Pedido realizarPedido(ArrayList<String> alimentos){
        
        Pedido pedidoCliente = new Pedido(alimentos);
        
        pedidoCliente.prepararAlimentos();
        
        return pedidoCliente;
    }
    
    public ArrayList<IComponente> asignarAsientos(Funcion funcion, ArrayList<Integer> asientos){
        
        ArrayList<IComponente> asientosAsignados = new ArrayList<IComponente>();
        
        for (int i=0; i<asientos.size(); i++){
            IComponente asiento = funcion.getSala().getComponentes().get(asientos.get(i)-1);
            asientosAsignados.add(asiento);
        }
        
        return asientosAsignados;
    }
    
    public Boleta getBoleta(int index){
        boleta = boletasDB.getBoleta(index);
        return boleta;
    }
    
}
