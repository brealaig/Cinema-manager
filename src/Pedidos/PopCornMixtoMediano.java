package Pedidos;

import Interfaces.CreadorAlimento;

public class PopCornMixtoMediano implements CreadorAlimento{
    
    private Alimento alimento;
    
    public PopCornMixtoMediano(){
        this.alimento = new Alimento();
    }
    
    @Override
    public void agregarNombre(){
        alimento.setNombre("Palomitas mixtas");
    }
    
    @Override
    public void agregarTipoAlimento(){
        alimento.setTipoAlimento("Comida");
    }
    
    @Override
    public void agregarSabor(){
        alimento.setSabor("Salado y Dulce");
    }
    
    @Override
    public void agregarCantidadNeta(){
        alimento.setCantidadNeta(300);
    }
    
    @Override
    public void agregarPrecio(){
        alimento.setPrecio(6000);
    }
    
    @Override
    public Alimento getAlimento(){
        return this.alimento;
    }
    
}
