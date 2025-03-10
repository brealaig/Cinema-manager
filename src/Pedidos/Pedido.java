package Pedidos;

import java.util.ArrayList;
import Interfaces.CreadorAlimento;

public class Pedido {
    
    private ArrayList<Alimento> alimentos;
    private ArrayList<String> listaAlimentos;
    
    public Pedido(ArrayList<String> listaAlimentos){
        this.listaAlimentos = listaAlimentos;
    }
    
    public void prepararAlimentos(){
        
        CreadorAlimento alimento;
        
        for(int i = 0; i<listaAlimentos.size(); i++){
            if(listaAlimentos.get(i).equals("HOTDOGMEDIANO")){
                alimento = new HotDogMediano();
            }
            else if(listaAlimentos.get(i).equals("SANDWICHJAMONMEDIANO")){
                alimento = new SandwichJamonMediano();
            }
            else if(listaAlimentos.get(i).equals("NACHOSMEDIANO")){
                alimento = new NachosMediano();
            }
            else if(listaAlimentos.get(i).equals("POPCORNSALMEDIANO")){
                alimento = new PopCornSalMediano();
            }
            else if(listaAlimentos.get(i).equals("POPCORNDULCEMEDIANO")){
                alimento = new PopCornDulceMediano();
            }
            else if(listaAlimentos.get(i).equals("POPCORNMIXTOMEDIANO")){
                alimento = new PopCornMixtoMediano();
            }
            else if(listaAlimentos.get(i).equals("CHOCOLATINATRADICIONALMEDIANA")){
                alimento = new ChocolatinaTradicionalMediana();
            }
            else if(listaAlimentos.get(i).equals("COCACOLAMEDIANA")){
                alimento = new CocaColaMediana();
            }
            else{
                alimento = null;
            }
            
            ChefAlimento chef = new ChefAlimento(alimento);
            chef.crearAlimento();
            
            Alimento alimentoCreado = chef.getAlimento();
            
            alimentos.add(alimentoCreado);
            
        }

    }
    
    public ArrayList<Alimento> getAlimentos(){
        return alimentos;
    }
    
}
