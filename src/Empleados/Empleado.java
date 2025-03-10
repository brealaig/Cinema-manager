package Empleados;

import Interfaces.Usuario;

public class Empleado implements Usuario{
    
    private int codigo;
    private String multiplex;
    private int cedula;
    private String nombre;
    private int numTelefono;
    private int salario;
    private String contrasena;
    private String fechaInicioContrato;
    private int numeroEmpleado;
    
    public Empleado(int codigo, String multiplex, int cedula, String nombre, int numTelefono, int salario, String contrasena, String fechaInicioContrato, int numeroEmpleado){
        this.codigo = codigo;
        this.multiplex = multiplex;
        this.cedula = cedula;
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.salario = salario;
        this.contrasena = contrasena;
        this.fechaInicioContrato = fechaInicioContrato;
    }
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getMultiplex(){
        return multiplex;
    }
    
    @Override
    public int getIdentificacion(){
        return cedula;
    }
    
    public int getNumTelefono(){
        return numTelefono;
    }
    
    public int getSalario(){
        return salario;
    }
    
    public String getFechaInicioContrato(){
        return fechaInicioContrato;
    }
    
    @Override
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    
    public void setSalario(int salario){
        this.salario = salario;
    }
    
    public void setNumTelefono(int numTelefono){
        this.numTelefono = numTelefono;
    }
    
    public void setMultiplex(String multiplex){
        this.multiplex = multiplex;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String getContrasena() {
        return contrasena;
    }
}
