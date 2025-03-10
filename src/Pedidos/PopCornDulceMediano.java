package Pedidos;

import Interfaces.CreadorAlimento;

public class PopCornDulceMediano implements CreadorAlimento{
    
    private Alimento alimento;
    
    public PopCornDulceMediano(){
        this.alimento = new Alimento();
    }
    
    @Override
    public void agregarNombre(){
        alimento.setNombre("Palomitas dulces");
    }
    
    @Override
    public void agregarTipoAlimento(){
        alimento.setTipoAlimento("Comida");
    }
    
    @Override
    public void agregarSabor(){
        alimento.setSabor("Dulce");
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
