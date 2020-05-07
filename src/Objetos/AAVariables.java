package Objetos;
import UI.Inicio;
import Estructuras.*;

public class AAVariables {

    public static TablaHash miTablaUsuarios = new TablaHash(45);
    
    public AAVariables() {
        Inicio miPantalla = new Inicio();
        miPantalla.setVisible(true);
        miPantalla.setTitle("USAC LIBRARY");
    }
}
