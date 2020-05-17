package Objetos;

import UI.UsacLibrary;
import Estructuras.*;
import Objetos.*;
import Archivos.BTree;

public class AAVariables {

    public static TablaHash miTablaUsuarios = new TablaHash(45);
    public static Usuario miUsuarioLogueado;
    public static ArbolAVL miArbolAVLCategorias = new ArbolAVL();
    public static Btree miArbolBActual;
    public static Btree t = new Btree(3);

    public AAVariables() {
        Usuario defaultUser = new Usuario(123, "Admin", "Encargado", "AdmonEmpresas", "123");
        miTablaUsuarios.insertar(defaultUser);
        UsacLibrary miPantalla = new UsacLibrary();
        miPantalla.setVisible(true);
        miPantalla.setTitle("USAC LIBRARY");
        miPantalla.setResizable(false);
        miPantalla.setLocationRelativeTo(null);
        pruebas();
        pruebasAVL();
        pruebasMiArbolB();
    }

    public void pruebas() {
        t.insert(1);
        t.insert(3);
        t.insert(7);
        t.insert(10);
        t.insert(11);
        t.insert(13);
        t.insert(14);
        t.insert(15);//
        t.insert(18);
        t.insert(16);
        t.insert(19);//
        t.insert(24);
        t.insert(25);
        t.insert(26);
        t.insert(21);//
        t.insert(4);
        t.insert(5);
        t.insert(20);
        t.insert(22);//
        /*t.insert(2);
        t.insert(17);
        t.insert(12);
        t.insert(6);*/

        System.out.println("\nTraversal of tree constructed is\n");
        t.traverse();

        BTreeNode aux;
        aux=t.search(1);
        System.out.println(aux.getN()+" - "+aux.getKeys().length +" - "+aux.isLeaf());
        
        aux=t.search(19);
        System.out.println(aux.getN()+" - "+aux.getKeys().length +" - "+aux.isLeaf());
        
        aux=t.search(16);
        System.out.println(aux.getN()+" - "+aux.getKeys().length +" - "+aux.isLeaf());
        
        aux=t.search(11);
        System.out.println(aux.getN()+" - "+aux.getKeys().length +" - "+aux.isLeaf());
        
        
        aux=t.search(24);
        System.out.println(aux.getN()+" - "+aux.getKeys().length +" - "+aux.isLeaf());
        
        aux=t.search(7);
        System.out.println(aux.getN()+" - "+aux.getKeys().length +" - "+aux.isLeaf());
        
        aux=t.search(14);
        System.out.println(aux.getN()+" - "+aux.getKeys().length +" - "+aux.isLeaf());
        
        aux=t.search(26);
        System.out.println(aux.getN()+" - "+aux.getKeys().length +" - "+aux.isLeaf());
        
        int k = 6;
        if(t.search(k) != null){
            System.out.println("\nPresent");
        }else{
            System.out.println("\nNot Present");
        }

        k = 15;
        if(t.search(k) != null){
            System.out.println("\nPresent");
        }else{
            System.out.println("\nNot Present");
        }
        
        /*t.remove(6);
        System.out.println("\nTraversal of tree constructed r6\n");
        t.traverse();

        t.remove(13);
        System.out.println("\nTraversal of tree constructed r13\n");
        t.traverse();

        t.remove(7);
        System.out.println("\nTraversal of tree constructed r7\n");
        t.traverse();

        t.remove(4);
        System.out.println("\nTraversal of tree constructed r4\n");
        t.traverse();

        t.remove(2);
        System.out.println("\nTraversal of tree constructed r2\n");
        t.traverse();

        t.remove(16);
        System.out.println("\nTraversal of tree constructed r6\n");
        t.traverse();*/

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
    
    public void pruebasMiArbolB(){
        ArbolB ABBB = new ArbolB(5);
        ABBB.insertar(10);
        ABBB.insertar(8);
        ABBB.insertar(5);
        
        ABBB.recorridoNiveles();
        
        BTree bt = new BTree();
        BTree bt1;
        
        /*BTree<Libro> bt2 = new BTree<Libro>();
        bt.toCollection();
        BTree<String> arbol1 = new BTree<>();
        BTree<Usuario> arbol2 = new BTree<>();
        BTree<Libro> arbol3 = new BTree<>();
        BTree<Categoria> arbol = new BTree<>();*/
        bt.add(10);
        bt.add(8);
        bt.add(5);
        
    }

}
