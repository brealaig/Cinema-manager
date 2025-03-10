package Pedidos;

import Interfaces.CreadorAlimento;

public class PopCornSalMediano implements CreadorAlimento{
    
    private Alimento alimento;
    
    public PopCornSalMediano(){
        this.alimento = new Alimento();
    }
    
    @Override
    public void agregarNombre(){
        alimento.setNombre("Palomitas saladas");
    }
    
    @Override
    public void agregarTipoAlimento(){
        alimento.setTipoAlimento("Comida");
    }
    
    @Override
    public void agregarSabor(){
        alimento.setSabor("Salado");
    }
    
    @Override
    public void agregarCantidadNeta(){
        alimento.setCantidadNeta(300);
    }
    
    @Override
    public void agregarPrecio(){
        alimento.setPrecio(5000);
    }
    
    @Override
    public Alimento getAlimento(){
        return this.alimento;
    }
    
}