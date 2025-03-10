package Multiplex;

public class Multiplex extends Contenedor{
    
    private String identificadorMultiplex;
    private int numeroMultiplex;
    
    public Multiplex(String identificadorMultiplex, int numeroMultiplex){
       this.identificadorMultiplex = identificadorMultiplex;
       this.numeroMultiplex = numeroMultiplex;
    }
    
    @Override
    public String getIdentificador(){
        return identificadorMultiplex;
    }
    
}
