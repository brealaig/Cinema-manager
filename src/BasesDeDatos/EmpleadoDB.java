package BasesDeDatos;

import Empleados.Empleado;
import java.util.ArrayList;

public class EmpleadoDB {
    
    private static EmpleadoDB conexion;
    private ArrayList<Empleado> empleadoDB;
    
    private EmpleadoDB(){
        this.empleadoDB = new ArrayList<Empleado>();
    }
    
    public static EmpleadoDB getConexion(){
        if (conexion == null){
            conexion = new EmpleadoDB();
        }
        return conexion;
    }
    
    public void conectar(){
        System.out.println("Data base 'EmpleadoDB' has been connected");
    }
    
    public void desconectar(){
        System.out.println("Data base 'EmpleadoDB' has been disconnected");
    }
    
    public void subirEmpleado(Empleado empleado){
        empleadoDB.add(empleado);
    }
    
    public int getNumeroEmpleado(){
        return empleadoDB.size();
    }
    
    public Empleado getEmpleado(int index){
        Empleado empleado = empleadoDB.get(index);
        return empleado;
    }
    
    public ArrayList<Empleado> getBaseDeDatos(){
        return empleadoDB;
    }
    
}
