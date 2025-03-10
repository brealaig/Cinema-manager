package Fachadas;

import Interfaces.Fachada;
import Interfaces.IComponente;
import Multiplex.*;
import BasesDeDatos.MultiplexDB;

public class FachadaConstruccionMultiplex {
    
    private Multiplex multiplex;
    private MultiplexDB multiplexDB;
    private static FachadaConstruccionMultiplex fachada;
    
    private FachadaConstruccionMultiplex(){
        this.multiplexDB = multiplexDB.getConexion();
    }
    
    public static FachadaConstruccionMultiplex getFachada(){
        if (fachada == null){
            fachada = new FachadaConstruccionMultiplex();
        }
        return fachada;
    }
    
    public void construirMultiplex(String identificadorMultiplex, int cantidadSalas){
        
        int numeroMultiplex = multiplexDB.getNumeroMultiplex();
        
        this.multiplex = new Multiplex(identificadorMultiplex, numeroMultiplex);
        
        crearSalas(multiplex, cantidadSalas);
        
        multiplexDB.subirMultiplex(multiplex);
        
    }
    
    public void crearSalas(Multiplex multiplex, int cantidadSalas){
        
        for(int i = 0; i<cantidadSalas; i++){
            
            Contenedor sala = new Sala(String.valueOf(i+1));
            
            crearAsientos(sala);
            
            multiplex.agregarComponente(sala);
        }
        
    }
    
    public void crearAsientos(Contenedor sala){
        for (int i=0; i<40; i++){
            IComponente asiento = new Asiento("GENERAL",String.valueOf(i+1));
            sala.agregarComponente(asiento);
        }
        for (int i=40; i<60; i++){
            IComponente asiento = new Asiento("PREFERENCIAL",String.valueOf(i+1));
            sala.agregarComponente(asiento);
        }
    }
    
    public Multiplex getMultiplex(int index){
        multiplex = multiplexDB.getMultiplex(index);
        return multiplex;
    }
    
}
