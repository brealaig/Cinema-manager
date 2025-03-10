package BasesDeDatos;

import Boletas.Boleta;
import java.util.ArrayList;

public class BoletasDB {
    
    private static BoletasDB conexion;
    private ArrayList<Boleta> boletasDB;
    
    private BoletasDB(){
        this.boletasDB = new ArrayList<Boleta>();
    }
    
    public static BoletasDB getConexion(){
        if (conexion == null){
            conexion = new BoletasDB();
        }
        return conexion;
    }
    
    public void conectar(){
        System.out.println("Data base 'BoletasDB' has been connected");
    }
    
    public void desconectar(){
        System.out.println("Data base 'BoletasDB' has been disconnected");
    }
    
    public void subirBoleta(Boleta boleta){
        boletasDB.add(boleta);
    }
    
    public int getNumeroBoleta(){
        return boletasDB.size();
    }
    
    public Boleta getBoleta(int index){
        Boleta boleta = boletasDB.get(index);
        return boleta;
    }
    
    public ArrayList<Boleta> getBaseDeDatos(){
        return boletasDB;
    }
}
