package ComandoConexionVista;

import Interfaces.Comando;
import Fachadas.FachadaCreacionUsuario;

public class ComandoCreacionUsuario implements Comando{
    
    private FachadaCreacionUsuario fachada;
    private String nombre;
    private int identificacion;
    private String correo;
    private String contrasena;;
    private String tipo;
    private int precio;
    
    public ComandoCreacionUsuario(FachadaCreacionUsuario fachada, String nombre, int identificacion, String correo, String contrasena, String tipo, int precio){
        this.fachada = fachada;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    @Override
    public void accion(){
        fachada.crearUsuario(nombre, identificacion, correo, contrasena, tipo, precio);
    }
    
}
