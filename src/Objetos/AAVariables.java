package Objetos;
import UI.Login;
import Estructuras.*;

public class AAVariables {

    public static TablaHash miTablaUsuarios = new TablaHash(45);
    
    public AAVariables() {
        Login miPantalla = new Login();
        miPantalla.setVisible(true);
        miPantalla.setTitle("USAC LIBRARY");
    }
}
