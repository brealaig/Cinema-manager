package cinedistrital;

import BasesDeDatos.*;
import Fachadas.*;
import ComandoConexionVista.*;
import Vista.*;

public class CineDistrital {

    public static void main(String[] args) {
        
        iniciarBasesDeDatos();
        
        Inicio vistaInicio = new Inicio();
        vistaInicio.setVisible(true);
        
        
        //mostrarBasesDeDatos();
        
    }
    
    public static void inicializarBasesDeDatos(){
        BoletasDB boletasDB = BoletasDB.getConexion();
        EmpleadoDB empleadoDB = EmpleadoDB.getConexion();
        FuncionesDB funcionesDB = FuncionesDB.getConexion();
        MultiplexDB multiplexDB = MultiplexDB.getConexion();
        PeliculasDB peliculasDB = PeliculasDB.getConexion();
        UsuarioDB usuarioDB = UsuarioDB.getConexion();
     }
    
    public static void inicializarFachadas(){
        FachadaCompraBoleta fachadaCompraBoleta = FachadaCompraBoleta.getFachada();
        FachadaConstruccionMultiplex fachadaConstruccionMultiplex = FachadaConstruccionMultiplex.getFachada();
        FachadaCreacionEmpleado fachadaCreacionEmpleado = FachadaCreacionEmpleado.getFachada();
        FachadaCreacionFunciones fachadaCreacionFunciones = FachadaCreacionFunciones.getFachada();
        FachadaCreacionPelicula fachadaCreacionPelicula = FachadaCreacionPelicula.getFachada();
        FachadaCreacionUsuario fachadaCreacionUsuario = FachadaCreacionUsuario.getFachada();
    }
    
    private static void construirMultiplex(){
        
        FachadaConstruccionMultiplex fachada = FachadaConstruccionMultiplex.getFachada();
        ComandoConstruccionMultiplex comando;
        Invocador invocador = new Invocador();
        
        String[] multiplexExistentes ={"Titan", "Unicentro", "Plaza Central","Gran Estacion", "Embajador Centro", "Las Americas"};
        
        
        for(int i=0; i < multiplexExistentes.length; i++){
            comando = new ComandoConstruccionMultiplex(fachada,multiplexExistentes[i],i+10);
            
            invocador.ejecutar(comando);
        }
    }
    
    private static void crearUsuarios(){
        
        FachadaCreacionUsuario fachada = FachadaCreacionUsuario.getFachada().getFachada();
        ComandoCreacionUsuario comando;
        Invocador invocador = new Invocador();
        
        String[] nombresUsuarios ={"Carlos Arturo", "Yassine Bounou", "Dumar Aljure","Octavio Mesa"};
        int[] identificacionesUsuarios ={41245, 21456, 21566,86541};
        String[] correos ={"Carturito@gmail.com", "brmdz@gmail.com", "sangresitanegra@gmail.com","machete21@gmail.com"};
        String[] contrasena ={"111", "222", "333","444"};
        
        for(int i=0; i < nombresUsuarios.length; i++){
            comando = new ComandoCreacionUsuario(fachada,nombresUsuarios[i],identificacionesUsuarios[i],correos[i],contrasena[i],"Estandar",0);
            
            invocador.ejecutar(comando);
        }
    }
    
    private static void crearPeliculas(){
        FachadaCreacionPelicula fachada = FachadaCreacionPelicula.getFachada();
        ComandoCreacionPelicula comando;
        Invocador invocador = new Invocador();
        
        String[] nombresPeliculas ={"El gato con botas: El ultimo deseo", "Pantera negra: Wakanda por siempre", "El menu"};
        String[] genero = {"Aventura/Comedia","Accion/Aventura","Terror/Suspenso"};
        String[] duracion = {"100","161","107"};
        String[] director = {"Joel Crawford","Ryan Coogler","Mark Mylod"};
        String[] descripcion = {"Un gato con botas","Una pantera negra","Un chef desquiciado"};
        
        for(int i=0; i < nombresPeliculas.length; i++){
            comando = new ComandoCreacionPelicula(fachada,nombresPeliculas[i],genero[i],duracion[i], director[i], descripcion[i]);
            
            invocador.ejecutar(comando);
        }
    }
    
    private static void crearFunciones(){
        
        PeliculasDB peliculasDB = PeliculasDB.getConexion();
        MultiplexDB multiplexDB = MultiplexDB.getConexion();
        
        FachadaCreacionFunciones fachada = FachadaCreacionFunciones.getFachada().getFachada();
        ComandoCreacionFunciones comando;
        Invocador invocador = new Invocador();
        
        
        String[] hora = {"10:00","13:00","15:00"};
        
        for(int i=0; i < peliculasDB.getBaseDeDatos().size(); i++){
            
            for(int j=0; j<multiplexDB.getBaseDeDatos().size(); j++){
                
                for(int k=0; k<10; k++){
                    
                    comando = new ComandoCreacionFunciones(fachada, i, multiplexDB.getMultiplex(j), k, hora[i]);
                    invocador.ejecutar(comando);
                }
                
            } 
            
        }
    }
    
    private static void crearEmpleados(){
        FachadaCreacionEmpleado fachada = FachadaCreacionEmpleado.getFachada();
        ComandoCreacionEmpleado comando;
        Invocador invocador = new Invocador();
        
        int[] codigos = {202020, 452313, 434142, 752341};
        int[] cedulas = {215215, 565231, 976554, 512512};
        String[] nombres = {"Gabriela Eslava","Alejandro Cely","Jeison Cuenca","Jonathan Agudelo"};
        int[] numTelefono = {124521, 125771, 213151, 257711};
        String[] contrasena = {"2204","3151","2516","8653"};
        
        
        for(int i=0; i < nombres.length; i++){
            comando = new ComandoCreacionEmpleado(fachada,codigos[i],"Titan", cedulas[i], nombres[i], numTelefono[i], 6000000, contrasena[i], "2022-11-08");
            
            invocador.ejecutar(comando);
        }
    }
    
    private static void iniciarBasesDeDatos(){
        inicializarBasesDeDatos();
        inicializarFachadas();
        construirMultiplex();
        crearUsuarios();
        crearPeliculas();
        crearFunciones();
        crearEmpleados();
    }
    
    private static void mostrarBasesDeDatos(){
        MultiplexDB multiplexDB = MultiplexDB.getConexion();
        UsuarioDB usuarioDB = UsuarioDB.getConexion();
        PeliculasDB peliculasDB = PeliculasDB.getConexion();
        FuncionesDB funcionesDB = FuncionesDB.getConexion();
        EmpleadoDB empleadoDB = EmpleadoDB.getConexion();
        
        
        for (int i = 0; i<multiplexDB.getBaseDeDatos().size(); i++){
            System.out.println(multiplexDB.getMultiplex(i).getIdentificador());
        }
        
        for (int i = 0; i<usuarioDB.getBaseDeDatos().size(); i++){
            System.out.println(usuarioDB.getUsuario(i).getNombre());
        }
        
        for (int i = 0; i<peliculasDB.getBaseDeDatos().size(); i++){
            System.out.println(peliculasDB.getPelicula(i).getNombre());
        }
        
        for (int i = 0; i<funcionesDB.getBaseDeDatos().size(); i++){
            System.out.println(funcionesDB.getFuncion(i).getPelicula().getNombre() + " " + funcionesDB.getFuncion(i).getMultiplex().getIdentificador() + " Sala " + funcionesDB.getFuncion(i).getSala().getIdentificador() + " Hora " + funcionesDB.getFuncion(i).getHora());
        }
        
        for (int i = 0; i<empleadoDB.getBaseDeDatos().size(); i++){
            System.out.println(empleadoDB.getEmpleado(i).getNombre());
        }
    }
}
