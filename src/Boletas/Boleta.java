package Boletas;

import Interfaces.IComponente;
import Usuarios.TarjetaUsuario;
import Pedidos.Pedido;
import Funciones.Funcion;
import Multiplex.Asiento;
import java.util.ArrayList;

public class Boleta {
    
    private TarjetaUsuario cliente;
    private Pedido pedido;
    private ArrayList<IComponente> asientos;
    private Funcion funcion;
    private int precio = 0;
    private int numeroBoleta;
    
    public Boleta(TarjetaUsuario cliente, Pedido pedido, ArrayList<IComponente> asientos, Funcion funcion, int numeroBoleta){
        this.cliente = cliente;
        this.pedido = pedido;
        this.asientos = asientos;
        this.funcion = funcion;
        this.numeroBoleta = numeroBoleta;
    }
    
    public void calcularPrecio(){
        for (int i=0; i<asientos.size(); i++){
            precio = precio + asientos.get(i).getPrecio();
        }
        for (int i=0; i<pedido.getAlimentos().size(); i++){
            precio = precio + pedido.getAlimentos().get(i).getPrecio();
        }
    }
    
    public TarjetaUsuario getCliente(){
        return cliente;
    }
    
    public Pedido getPedido(){
        return pedido;
    }
    
    public ArrayList<IComponente> getAsientos(){
        return asientos;
    }
    
    public Funcion getFuncion(){
        return funcion;
    }
    
    public int getPrecio(){
        return precio;
    }
    
}
