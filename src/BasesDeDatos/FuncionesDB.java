package BasesDeDatos;

import Funciones.Funcion;
import java.util.ArrayList;

public class FuncionesDB {
    
    private static FuncionesDB conexion;
    private ArrayList<Funcion> funcionesDB;
    
    private FuncionesDB(){
        this.funcionesDB = new ArrayList<Funcion>();
    }
    
    public static FuncionesDB getConexion(){
        if (conexion == null){
            conexion = new FuncionesDB();
        }
        return conexion;
    }
    
    public void conectar(){
        System.out.println("Data base 'FuncionesDB' has been connected");
    }
    

    public void desconectar(){
        System.out.println("Data base 'FuncionesDB' has been disconnected");
    }
    
    public void subirFuncion(Funcion funcion){
        funcionesDB.add(funcion);
    }
    
    public int getNumeroFuncion(){
        return funcionesDB.size();
    }
    
    public Funcion getFuncion(int index){
        Funcion funcion = funcionesDB.get(index);
        return funcion;
    }
    
    public ArrayList<Funcion> getBaseDeDatos(){
        return funcionesDB;
    }
}
