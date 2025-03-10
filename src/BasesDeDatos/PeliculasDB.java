package BasesDeDatos;

import Funciones.Pelicula;
import java.util.ArrayList;

public class PeliculasDB {
   
    private static PeliculasDB conexion;
    private ArrayList<Pelicula> peliculasDB;
    
    private PeliculasDB(){
        this.peliculasDB = new ArrayList<Pelicula>();
    }
    
    public static PeliculasDB getConexion(){
        if (conexion == null){
            conexion = new PeliculasDB();
        }
        return conexion;
    }
    
    public void conectar(){
        System.out.println("Data base 'PeliculasDB' has been connected");
    }
    
    public void desconectar(){
        System.out.println("Data base 'PeliculasDB' has been disconnected");
    }
    
    public void subirPelicula(Pelicula pelicula){
        peliculasDB.add(pelicula);
    }
    
    public int getNumeroPelicula(){
        return peliculasDB.size();
    }
    
    public Pelicula getPelicula(int index){
        Pelicula pelicula = peliculasDB.get(index);
        return pelicula;
    }
    
    public ArrayList<Pelicula> getBaseDeDatos(){
        return peliculasDB;
    }
}
