package ComandoConexionVista;

import Interfaces.Comando;

public class Invocador {
    
    public void ejecutar(Comando comando){
        comando.accion();
    }
    
}
