package Pedidos;

import Interfaces.PlantillaAlimento;

public class Alimento implements PlantillaAlimento{
   
    private String nombre;
    private String tipoAlimento;
    private String sabor;
    private int cantidadNeta;
    private int precio;
    
    @Override
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void setTipoAlimento(String tipoAlimento){
        this.tipoAlimento = tipoAlimento;
    }
    
    @Override
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    
    @Override
    public void setCantidadNeta(int cantidadNeta){
        this.cantidadNeta = cantidadNeta;
    }
    
    @Override
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    public int getPrecio(){
        return precio;
    }
    
}
