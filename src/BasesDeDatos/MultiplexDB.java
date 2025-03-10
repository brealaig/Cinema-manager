package BasesDeDatos;

import Multiplex.Multiplex;
import java.util.ArrayList;

public class MultiplexDB {
    
    private static MultiplexDB conexion;
    private ArrayList<Multiplex> multiplexDB;
    
    private MultiplexDB(){
        this.multiplexDB = new ArrayList<Multiplex>();
    }
    
    public static MultiplexDB getConexion(){
        if (conexion == null){
            conexion = new MultiplexDB();
        }
        return conexion;
    }
    
    public void conectar(){
        System.out.println("Data base 'MultiplexDB' has been connected");
    }
    
    public void desconectar(){
        System.out.println("Data base 'MultiplexDB' has been disconnected");
    }
    
    public void subirMultiplex(Multiplex multiplex){
        multiplexDB.add(multiplex);
    }
    
    public int getNumeroMultiplex(){
        return multiplexDB.size();
    }
    
    public Multiplex getMultiplex(int index){
        Multiplex multiplex = multiplexDB.get(index);
        return multiplex;
    }
    
    public ArrayList<Multiplex> getBaseDeDatos(){
        return multiplexDB;
    }
    
}
