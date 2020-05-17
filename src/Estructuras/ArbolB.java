package Estructuras;

import Objetos.Libro;
import java.util.LinkedList;

public class ArbolB {

    private NodoArbolB raiz;
    private int M;
    private boolean soloIngresar = true;

    //CONSTRUCTORES
    public ArbolB() {
    }
    public ArbolB(int M) {
        this.raiz= new NodoArbolB(M, true);//=null;//
        this.M = M;
    }

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
        for (int i = 0; i < M - 1; i++) {
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
        for (int i = 0; i < M; i++) {
            if (arbol.getHijo(i) == null) {
                contHijosNulos++;
            }
        }
        return contHijosNulos == M;
    }

    public NodoArbolB nodoHoja(NodoArbolB arbol, int isbn) {
        for (int i = 0; i < M - 1; i++) {
            if (arbol.getLibro(i) != null) {
                if (arbol.getLibro(i).getISBN() > isbn) {
                    return arbol.getHijo(i);
                } else if ((arbol.getLibro(i).getISBN() < isbn) && (i == M - 2)) {
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

                for (int i = 0; i < M; i++) {//CICLO PARA AGREGAR HIJOS
                    if (aux.getHijo(i) != null) {
                        cola.addFirst(aux.getHijo(i));
                    }
                }                
            }            
        }
    }

    
    
    public void recorrerImprimir(NodoArbolB arbol) {
        for (int i = 0; i < M - 1; i++) {
            if (arbol.getLibro(i) != null) {
                System.out.print(arbol.getLibro(i).getISBN() + ", ");
            }
        }
    }

}
