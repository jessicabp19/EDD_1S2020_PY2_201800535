package Objetos;

import UI.UsacLibrary;
import Estructuras.*;
import Objetos.*;
import Archivos.BTree;

public class AAVariables {

    public static TablaHash miTablaUsuarios = new TablaHash(45);
    public static Usuario miUsuarioLogueado;
    public static ArbolAVL miArbolAVLCategorias = new ArbolAVL();
    public static ArbolB miArbolBActual;// = new ArbolB(5);//PARA LAS PRIMERAS PRUEBAS
    //public static Btree miArbolActual;

    public AAVariables() {
        Usuario defaultUser = new Usuario(123, "Admin", "Encargado", "AdmonEmpresas", "123");
        miTablaUsuarios.insertar(defaultUser);
        UsacLibrary miPantalla = new UsacLibrary();
        miPantalla.setVisible(true);
        miPantalla.setTitle("USAC LIBRARY");
        miPantalla.setResizable(false);
        miPantalla.setLocationRelativeTo(null);
        //pruebasAVL();
    }

    
    
    public void pruebasAVL(){
        ArbolB b1 = new ArbolB(5);
        Categoria c1 = new Categoria("Bonito", b1, 201800535);
        miArbolAVLCategorias.insertar(c1);
        
        ArbolB b2 = new ArbolB(5);
        Categoria c2 = new Categoria("Lirico", b2, 201800535);
        miArbolAVLCategorias.insertar(c2);
        
        ArbolB b3 = new ArbolB(5);
        Categoria c3 = new Categoria("U", b3, 201800535);
        miArbolAVLCategorias.insertar(c3);
        
        ArbolB b11 = new ArbolB(5);
        Categoria c11 = new Categoria("AA", b11, 201800535);
        miArbolAVLCategorias.insertar(c11);
        
        ArbolB b21 = new ArbolB(5);
        Categoria c21 = new Categoria("CC", b21, 201800535);
        miArbolAVLCategorias.insertar(c21);
        
        ArbolB b31 = new ArbolB(5);
        Categoria c31 = new Categoria("W", b31, 201800535);
        miArbolAVLCategorias.insertar(c31);
        
        ArbolB b311 = new ArbolB(5);
        Categoria c311 = new Categoria("V", b311, 201800535);
        miArbolAVLCategorias.insertar(c311);
    }
    
    

}
