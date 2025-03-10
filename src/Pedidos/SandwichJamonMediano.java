package Pedidos;

import Interfaces.CreadorAlimento;

public class SandwichJamonMediano implements CreadorAlimento{
    
    private Alimento alimento;
    
    public SandwichJamonMediano(){
        this.alimento = new Alimento();
    }
    
    @Override
    public void agregarNombre(){
        alimento.setNombre("Sandwich de Jamon Mediano");
    }
    
    @Override
    public void agregarTipoAlimento(){
        alimento.setTipoAlimento("Comida");
    }
    
    @Override
    public void agregarSabor(){
        alimento.setSabor("Jamon");
    }
    
    @Override
    public void agregarCantidadNeta(){
        alimento.setCantidadNeta(100);
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
