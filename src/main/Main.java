package main;

import Estructuras.*;
import Interfaces.ITree;
import Archivos.BTree;
import Objetos.*;

public class Main {

    public static void main(String[] args) {
        /*ArbolB ABBB = new ArbolB(5, "Suspenso");
        BTree bt = new BTree();
        bt.add(10);
        bt.add(8);
        bt.add(5);
        
        ABBB.insertar(10);
        ABBB.insertar(8);
        ABBB.insertar(5);
        
        ABBB.recorridoNiveles();*/
        Btree t = new Btree(3);
        t.insert(10);
        t.insert(20);
        t.insert(5);
        t.insert(6);
        t.insert(12);
        t.insert(30);
        t.insert(7);
        t.insert(17);
        t.insert(25);
        
        t.insert(8);
        t.insert(9);
        
        t.insert(30);
        t.insert(35);
        
        t.insert(40);
        t.insert(45);
        
        t.insert(50);
        t.insert(55);
        
        t.insert(60);
        System.out.println("Traversal of the constucted tree is ");
        t.traverse();
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
        
        new AAVariables();

    }
}
