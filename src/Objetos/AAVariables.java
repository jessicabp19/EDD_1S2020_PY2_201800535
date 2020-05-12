package Objetos;
import UI.UsacLibrary;
import Estructuras.*;
import Objetos.*;

public class AAVariables {

    public static TablaHash miTablaUsuarios = new TablaHash(45);
    public static Usuario miUsuarioLogueado;
    
    public AAVariables() {
        UsacLibrary miPantalla = new UsacLibrary();
        miPantalla.setVisible(true);
        miPantalla.setTitle("USAC LIBRARY");
        miPantalla.setResizable(false);
        miPantalla.setLocationRelativeTo(null);
    }
}
