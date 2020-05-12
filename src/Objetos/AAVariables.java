package Objetos;
import UI.UsacLibrary;
import Estructuras.*;
import Objetos.*;

public class AAVariables {

    public static TablaHash miTablaUsuarios = new TablaHash(45);
    public static Usuario miUsuarioLogueado;
    
    public AAVariables() {
        Usuario defaultUser = new Usuario(123,"Admin","Encargado", "AdmonEmpresas", "123");
        miTablaUsuarios.insertar(defaultUser);
        UsacLibrary miPantalla = new UsacLibrary();
        miPantalla.setVisible(true);
        miPantalla.setTitle("USAC LIBRARY");
        miPantalla.setResizable(false);
        miPantalla.setLocationRelativeTo(null);
    }
}
