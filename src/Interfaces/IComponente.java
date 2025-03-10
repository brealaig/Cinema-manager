package Interfaces;

import java.util.ArrayList;

public interface IComponente {
    
    public String getIdentificador();
    
    public ArrayList<IComponente> getComponentes();

    public int getPrecio();
    
}
