package Fachadas;

import Interfaces.Fachada;
import Interfaces.Usuario;
import Empleados.*;
import BasesDeDatos.EmpleadoDB;

public class FachadaCreacionEmpleado {
    
    private Empleado empleado;
    private EmpleadoDB empleadoDB;
    private static FachadaCreacionEmpleado fachada;
    
    private FachadaCreacionEmpleado(){
        this.empleadoDB = EmpleadoDB.getConexion();
    }
    
    public static FachadaCreacionEmpleado getFachada(){
        if (fachada == null){
            fachada = new FachadaCreacionEmpleado();
        }
        return fachada;
    }
    
    public void crearEmpleado(int codigo, String multiplex, int cedula, String nombre, int numTelefono, int salario, String contrasena, String fechaInicioContrato){
        
        int numeroEmpleado = empleadoDB.getNumeroEmpleado();
        
        this.empleado = new Empleado(codigo,multiplex,cedula,nombre,numTelefono,salario,contrasena,fechaInicioContrato,numeroEmpleado);
        
        empleadoDB.subirEmpleado(empleado);
    }
    
    public Empleado getEmpleado(int index){
        empleado = empleadoDB.getEmpleado(index);
        return empleado;
    }
    
}
