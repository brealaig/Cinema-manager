package Multiplex;

import Interfaces.IComponente;
import java.util.ArrayList;

public class Contenedor implements IComponente{
    
    private ArrayList<IComponente> componentes = new ArrayList<>();
    private String identificador;
    
    public void agregarComponente(IComponente componente){
        componentes.add(componente);
    }
    
    public void removerComponente(IComponente componente){
        componentes.remove(componente);
    }
    
    public ArrayList<IComponente> getComponentes(){
        return componentes;
    }
    
    @Override
    public String getIdentificador(){
        return identificador;
    }

    @Override
    public int getPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
