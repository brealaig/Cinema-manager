package Pedidos;

import Interfaces.CreadorAlimento;

public class ChefAlimento {
    
    private CreadorAlimento creadorAlimento;
    
    public ChefAlimento(CreadorAlimento creadorAlimento){
        this.creadorAlimento = creadorAlimento;
    }
    
    public Alimento getAlimento(){
        return this.creadorAlimento.getAlimento();
    }
    
    public void crearAlimento(){
        this.creadorAlimento.agregarNombre();
        this.creadorAlimento.agregarTipoAlimento();
        this.creadorAlimento.agregarSabor();
        this.creadorAlimento.agregarCantidadNeta();
        this.creadorAlimento.agregarPrecio();
    }
    
}
