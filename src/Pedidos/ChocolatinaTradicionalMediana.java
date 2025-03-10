package Pedidos;

import Interfaces.CreadorAlimento;

public class ChocolatinaTradicionalMediana implements CreadorAlimento{
    
    private Alimento alimento;
    
    public ChocolatinaTradicionalMediana(){
        this.alimento = new Alimento();
    }
    
    @Override
    public void agregarNombre(){
        alimento.setNombre("Chocolatina tradicional mediana");
    }
    
    @Override
    public void agregarTipoAlimento(){
        alimento.setTipoAlimento("Comida");
    }
    
    @Override
    public void agregarSabor(){
        alimento.setSabor("Chocolate");
    }
    
    @Override
    public void agregarCantidadNeta(){
        alimento.setCantidadNeta(100);
    }
    
    @Override
    public void agregarPrecio(){
        alimento.setPrecio(1000);
    }
    
    @Override
    public Alimento getAlimento(){
        return this.alimento;
    }
    
}
