package Usuarios;

import Interfaces.Usuario;

public abstract class TarjetaUsuario implements Usuario{
    
    private String nombre;
    private int identificacion;
    private String correo;
    private String contrasena;
    private String tipo;
    private int numeroUsuario;
    private int precio;
    private int puntos=0;

    public TarjetaUsuario(String nombre, int identificacion, String correo, String contrasena, String tipo, int numeroUsuario, int precio) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipo = tipo;
        this.numeroUsuario = numeroUsuario;
        this.precio = precio;
    }
    
    
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public int getIdentificacion(){
        return identificacion;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public int getNumeroUsuario(){
        return numeroUsuario;
    }
    
    @Override
    public String getContrasena(){
        return contrasena;
    }
    
    @Override
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
}
