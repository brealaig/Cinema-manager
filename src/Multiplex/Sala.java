package Multiplex;

import Interfaces.IComponente;

public class Sala extends Contenedor implements IComponente{
    
    private String identificadorSala;
    
    public Sala(String identificadorSala){
        this.identificadorSala = identificadorSala;
    }
    
    @Override
    public String getIdentificador(){
        return identificadorSala;
    }
    
}

