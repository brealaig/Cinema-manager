package Interfaces;

import Pedidos.Alimento;

public interface CreadorAlimento {
    
    public void agregarNombre();
    
    public void agregarTipoAlimento();
    
    public void agregarSabor();
    
    public void agregarCantidadNeta();
    
    public void agregarPrecio();
    
    public Alimento getAlimento();
    
}
