package Pedidos;

import Interfaces.CreadorAlimento;

public class NachosMediano implements CreadorAlimento{
    
    private Alimento alimento;
    
    public NachosMediano(){
        this.alimento = new Alimento();
    }
    
    @Override
    public void agregarNombre(){
        alimento.setNombre("Nachos mediano");
    }
    
    @Override
    public void agregarTipoAlimento(){
        alimento.setTipoAlimento("Comida");
    }
    
    @Override
    public void agregarSabor(){
        alimento.setSabor("Maiz");
    }
    
    @Override
    public void agregarCantidadNeta(){
        alimento.setCantidadNeta(200);
    }
    
    @Override
    public void agregarPrecio(){
        alimento.setPrecio(3000);
    }
    
    @Override
    public Alimento getAlimento(){
        return this.alimento;
    }
    
}
