package ComandoConexionVista;

import Interfaces.Comando;
import Fachadas.FachadaCreacionEmpleado;

public class ComandoCreacionEmpleado implements Comando{
    
    private FachadaCreacionEmpleado fachada;
    private int codigo;
    private String multiplex;
    private int cedula;
    private String nombre;
    private int numTelefono;
    private int salario;
    private String contrasena;
    private String fechaInicioContrato;
    
    public ComandoCreacionEmpleado(FachadaCreacionEmpleado fachada, int codigo, String multiplex, int cedula, String nombre, int numTelefono, int salario, String contrasena, String fechaInicioContrato){
        this.fachada = fachada;
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
    public void accion(){
        fachada.crearEmpleado(codigo, multiplex, cedula, nombre, numTelefono, salario, contrasena, fechaInicioContrato);
    }
    
}