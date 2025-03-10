package Fachadas;

import Interfaces.Fachada;
import Interfaces.Usuario;
import BasesDeDatos.UsuarioDB;
import Usuarios.TarjetaEstandar;
import Usuarios.TarjetaUsuario;

public class FachadaCreacionUsuario implements Fachada{
    
    private TarjetaUsuario tarjetaUsuario;
    private UsuarioDB usuarioDB;
    private static FachadaCreacionUsuario fachada ;
    
    private FachadaCreacionUsuario(){
        this.usuarioDB = UsuarioDB.getConexion();
    }
    
    public static FachadaCreacionUsuario getFachada(){
        if (fachada == null){
            fachada = new FachadaCreacionUsuario();
        }
        return fachada;
    }
    
    public void crearUsuario(String nombre, int identificacion, String correo, String contrasena, String tipo, int precio){
        
        int numeroUsuario = usuarioDB.getNumeroUsuario();
        
        if(tipo.equals("ESTANDAR")){
            this.tarjetaUsuario = new TarjetaEstandar(nombre,identificacion,correo,contrasena,tipo, numeroUsuario, precio);
        }
        else{
            this.tarjetaUsuario = new TarjetaEstandar(nombre,identificacion,correo,contrasena,tipo, numeroUsuario, precio);
        }
        
        usuarioDB.subirUsuario(tarjetaUsuario);
    }
    
    public TarjetaUsuario getUsuario(int index){
        tarjetaUsuario =  usuarioDB.getUsuario(index);
        return tarjetaUsuario;
    }
    
}
