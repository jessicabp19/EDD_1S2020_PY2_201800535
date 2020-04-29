package Estructuras;
import Objetos.Libro;

public class NodoArbolB {
    //private String categoria;
    private Libro[] libros;
    private NodoArbolB[] hijos;
    private int M;
    
    public NodoArbolB(){}
    
    public NodoArbolB(int M){//,String categoria
        //this.categoria=categoria;
        libros = new Libro[M-1];
        hijos = new NodoArbolB[M]; 
        this.M=M;
    }

    /*public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }*/
    
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
