package Estructuras;
import Objetos.Libro;

public class NodoArbolB {
    private Libro[] libros;//CLAVES
    private NodoArbolB[] hijos;//HIJOS
    private int M;//Max número de hijos
    private int n;//Número actual de claves en el nodo
    private boolean leaf;//Boleano que indica si es hoja 
    
    public NodoArbolB(){}
    
    public NodoArbolB(int M, boolean leaf){
        this.M=M;
        this.leaf=leaf;
        this.libros = new Libro[M-1];
        this.hijos = new NodoArbolB[M]; 
        this.n=0;
    }
    
    public Libro getLibro(int pos) {return libros[pos];}
    public void setLibro(int pos, Libro libro) {
        this.libros[pos] = libro;
    }
    public NodoArbolB getHijo(int pos) {return hijos[pos];}
    public void setHijo(int pos, NodoArbolB hijo) {
        this.hijos[pos] = hijo;
    }

    public Libro[] getLibros() {return libros;}
    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }
    public NodoArbolB[] getHijos() {return hijos;}
    public void setHijos(NodoArbolB[] hijos) {
        this.hijos = hijos;
    }

    public int cantLibros(){
        int cantLibros=0;
        for(int i=0; i<M-1;i++){
            if(getLibro(i) != null){
               cantLibros++;
            }
        }
        return cantLibros;
    }
    
    public boolean hayEspacio(){
        if(cantLibros()<M-2){
            return true;
        }
        return false;
    }
}
