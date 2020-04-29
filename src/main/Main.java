package main;
import Estructuras.*;

public class Main {
    public static void main(String[] args){
        //new AAInicio();
        ArbolB ABBB = new ArbolB(5, "Suspenso");
        
        ABBB.insertar(10);
        ABBB.insertar(8);
        ABBB.insertar(5);
        
        ABBB.recorridoNiveles();
    }
}
