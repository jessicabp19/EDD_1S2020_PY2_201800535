package Estructuras;

import Objetos.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArbolB {
    
    private int maxHijos;
    private int maxClaves;
    private int minHijos;
    private int minClaves;
    private NodoArbolB raiz = null;//Sin null
    private int tamanio;
    
    public ArbolB(int orden) {
        this.maxHijos = orden;
        this.maxClaves = orden - 1;
        this.minHijos = (orden - 1) / 2;
        this.minClaves = (orden - 1) / 2;

        this.raiz = null;
        this.tamanio = 0;
    }

    public boolean add(Libro book) {//Integer isbn, String title, String author, String editorial, int year, int edition, Categoria category, String language, Usuario user
        //Libro book = new Libro(isbn, title, author, editorial, year, edition, category, language, user);
        if (raiz == null) {
            raiz = new NodoArbolB(null, maxClaves, maxHijos);
            raiz.addKey(book);
        } else {
            NodoArbolB node = raiz;
            while (node != null) {
                if (node.numberOfChildren() == 0) {
                    node.addKey(book);
                    if (node.numberOfKeys() <= maxClaves) {
                        break;
                    }
                    // Se necesita dividir
                    split(node);
                    break;
                }
                // Navegando

                // Lesser or equal
                Libro lesser = node.getKey(0);
                if (book.getISBN().compareTo(lesser.getISBN()) <= 0) {
                    node = node.getChild(0);
                    continue;
                }

                // Greater
                int numberOfKeys = node.numberOfKeys();
                int last = numberOfKeys - 1;
                Libro greater = node.getKey(last);
                if (book.getISBN().compareTo(greater.getISBN()) > 0) {
                    node = node.getChild(numberOfKeys);
                    continue;
                }

                // Search internal nodes
                for (int i = 1; i < node.numberOfKeys(); i++) {
                    Libro prev = node.getKey(i - 1);
                    Libro next = node.getKey(i);
                    if (book.getISBN().compareTo(prev.getISBN()) > 0 && book.getISBN().compareTo(next.getISBN()) <= 0) {
                        node = node.getChild(i);
                        break;
                    }
                }
            }
        }
        tamanio++;
        return true;
    }
    
    private void split(NodoArbolB nodeToSplit) {
        NodoArbolB node = nodeToSplit;
        int numberOfKeys = node.numberOfKeys();
        int medianIndex = numberOfKeys / 2;
        Libro medianValue = node.getKey(medianIndex);

        NodoArbolB left = new NodoArbolB(null, maxClaves, maxHijos);
        for (int i = 0; i < medianIndex; i++) {
            left.addKey(node.getKey(i));
        }
        if (node.numberOfChildren() > 0) {
            for (int j = 0; j <= medianIndex; j++) {
                NodoArbolB c = node.getChild(j);
                left.addChild(c);
            }
        }

        NodoArbolB right = new NodoArbolB(null, maxClaves, maxHijos);
        for (int i = medianIndex + 1; i < numberOfKeys; i++) {
            right.addKey(node.getKey(i));
        }
        if (node.numberOfChildren() > 0) {
            for (int j = medianIndex + 1; j < node.numberOfChildren(); j++) {
                NodoArbolB c = node.getChild(j);
                right.addChild(c);
            }
        }

        if (node.parent == null) {
            // new raiz, height of tree is increased
            NodoArbolB newRoot = new NodoArbolB(null, maxClaves, maxHijos);
            newRoot.addKey(medianValue);
            node.parent = newRoot;
            raiz = newRoot;
            node = raiz;
            node.addChild(left);
            node.addChild(right);
        } else {
            // Move the median value up to the parent
            NodoArbolB parent = node.parent;
            parent.addKey(medianValue);
            parent.removeChild(node);
            parent.addChild(left);
            parent.addChild(right);

            if (parent.numberOfKeys() > maxClaves) {
                split(parent);
            }
        }
    }
    
    public NodoArbolB getRoot(){
        return raiz;
    }
    
    
    
    
    
    
    
    
    
    private boolean soloIngresar = true;
    //CONSTRUCTORES
    public ArbolB() {
    }
    /*public ArbolB(int M) {
        this.raiz= new NodoArbolB(M, true);//=null;//
        this.maxHijos = M;
    }*/
    //INSERTAR
    public void insertar(int isbn) {
        NodoArbolB temp = buscar(raiz, isbn);
        Libro miLibro = new Libro(isbn);
        Libro aux1, aux2=null;
        int pos = 0, j=0;
        if (temp == null) {
            System.out.println("LO SENTIMOS, YA EXISTE UN LIBRO CON ESE ISBN");
        } else {//PERDON POR EL DESORDEN, aun debo optimizar y limpiar el codigo
            if (temp.hayEspacio()) {
                
                int i=temp.cantLibros()-1;
                while (i >= 0 && temp.getLibro(i).getISBN() > isbn) {
                    temp.setLibro(i+1, temp.getLibro(i));
                    i--;
                }
                // Insert the new key at found location 
                temp.setLibro(i+1, miLibro);
                
            } else {
                System.out.println("Sin espacio");
            }
        }
    }
    //BUSCAR
    public NodoArbolB buscar(NodoArbolB arbol, int isbn) {
        if (contieneClave(arbol, isbn)) {
            return null;//debe indicar que esta repetido
        } else {
            if (esHoja(arbol)) {
                return arbol;//
            } else {
                buscar(nodoHoja(arbol, isbn), isbn);//Si no funciona, while y una bandera
            }
        }
        return null;
    }
    public boolean contieneClave(NodoArbolB arbol, int isbn) {
        for (int i = 0; i < maxHijos - 1; i++) {
            if (arbol != null && arbol.getLibro(i) != null) {
                if (arbol.getLibro(i).getISBN() == isbn) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean esHoja(NodoArbolB arbol) {
        int contHijosNulos = 0;
        for (int i = 0; i < maxHijos; i++) {
            if (arbol.getHijo(i) == null) {
                contHijosNulos++;
            }
        }
        return contHijosNulos == maxHijos;
    }
    public NodoArbolB nodoHoja(NodoArbolB arbol, int isbn) {
        for (int i = 0; i < maxHijos - 1; i++) {
            if (arbol.getLibro(i) != null) {
                if (arbol.getLibro(i).getISBN() > isbn) {
                    return arbol.getHijo(i);
                } else if ((arbol.getLibro(i).getISBN() < isbn) && (i == maxHijos - 2)) {
                    return arbol.getHijo(i + 1);
                }
            }
        }
        return null;
    }
    //RECORRER POR NIVELES 
    public void recorridoNiveles() {
        amplitud(raiz);
    }
    public void amplitud(NodoArbolB a) { //INICIAMOS CON RAIZ DEL ARBOL
        LinkedList cola;
        NodoArbolB aux;

        if (a != null) { //SI LA RAIZ ES DIFERENTE DE NULL...
            cola = new LinkedList();
            cola.addFirst(a);

            while (cola.peek() != null) { //MIENTRAS HAYAN LIBROS EN LA COLA...
                aux = (NodoArbolB) cola.removeLast();//Obtenemos el ultimo
                recorrerImprimir(aux);//Recorremos sus claves y las imprimimos

                for (int i = 0; i < maxHijos; i++) {//CICLO PARA AGREGAR HIJOS
                    if (aux.getHijo(i) != null) {
                        cola.addFirst(aux.getHijo(i));
                    }
                }                
            }            
        }
    }
    public void recorrerImprimir(NodoArbolB arbol) {
        for (int i = 0; i < maxHijos - 1; i++) {
            if (arbol.getLibro(i) != null) {
                System.out.print(arbol.getLibro(i).getISBN() + ", ");
            }
        }
    }

}
