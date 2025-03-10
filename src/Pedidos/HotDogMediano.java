package Pedidos;

import Interfaces.CreadorAlimento;

public class HotDogMediano implements CreadorAlimento{
    
    private Alimento alimento;
    
    public HotDogMediano(){
        this.alimento = new Alimento();
    }
    
    @Override
    public void agregarNombre(){
        alimento.setNombre("Hot Dog Mediano");
    }
    
    @Override
    public void agregarTipoAlimento(){
        alimento.setTipoAlimento("Comida");
    }
    
    @Override
    public void agregarSabor(){
        alimento.setSabor("Hot dog con salsas");
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
