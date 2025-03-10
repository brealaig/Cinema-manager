package BasesDeDatos;

import Interfaces.Usuario;
import Usuarios.TarjetaUsuario;
import java.util.ArrayList;

public class UsuarioDB {
    
    private static UsuarioDB conexion;
    private ArrayList<TarjetaUsuario> usuarioDB;
    
    private UsuarioDB(){
        this.usuarioDB = new ArrayList<TarjetaUsuario>();
    }
    
    public static UsuarioDB getConexion(){
        if (conexion == null){
            conexion = new UsuarioDB();
        }
        return conexion;
    }
    
    public void conectar(){
        System.out.println("Data base 'UsuarioDB' has been connected");
    }
    
    public void desconectar(){
        System.out.println("Data base 'UsuarioDB' has been disconnected");
    }
    
    public void subirUsuario(TarjetaUsuario usuario){
        usuarioDB.add(usuario);
    }
    
    public int getNumeroUsuario(){
        return usuarioDB.size();
    }
    
    public TarjetaUsuario getUsuario(int index){
        TarjetaUsuario usuario = usuarioDB.get(index);
        return usuario;
    }
    
    public ArrayList<TarjetaUsuario> getBaseDeDatos(){
        return usuarioDB;
    }
}
