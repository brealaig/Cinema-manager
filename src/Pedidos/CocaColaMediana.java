package Pedidos;

import Interfaces.CreadorAlimento;

public class CocaColaMediana implements CreadorAlimento{
    
    private Alimento alimento;
    
    public CocaColaMediana(){
        this.alimento = new Alimento();
    }
    
    @Override
    public void agregarNombre(){
        alimento.setNombre("CocaCola mediana");
    }
    
    @Override
    public void agregarTipoAlimento(){
        alimento.setTipoAlimento("Bebida");
    }
    
    @Override
    public void agregarSabor(){
        alimento.setSabor("Soda");
    }
    
    @Override
    public void agregarCantidadNeta(){
        alimento.setCantidadNeta(500);
    }
    
    @Override
    public void agregarPrecio(){
        alimento.setPrecio(4000);
    }
    
    @Override
    public Alimento getAlimento(){
        return this.alimento;
    }
    
}
