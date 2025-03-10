package Multiplex;

import Interfaces.IComponente;
import java.util.ArrayList;

public class Asiento implements IComponente{
    
    private String identificadorAsiento;
    private String tipo;
    private int precio;
    private boolean estadoOcupado = false;
    
    public Asiento(String tipo, String identificadorAsiento){
        this.tipo = tipo;
        this.identificadorAsiento = identificadorAsiento;
        
        if(tipo.equals("GENERAL")){
            this.precio = 11000;
        }
        else if(tipo.equals("PREFERENCIAL")){
            this.precio = 15000;
        }
        else{
            this.precio = 11000;
        }
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    @Override
    public String getIdentificador(){
        return identificadorAsiento;
    }
    
    public boolean getEstadoOcupado(){
        return estadoOcupado;
    }
    
    public void setEstadoOcupado(boolean estadoOcupado){
        this.estadoOcupado = estadoOcupado;
    }

    @Override
    public ArrayList<IComponente> getComponentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
