package Estructuras;
import Objetos.Categoria;

public class NodoArbolAVL {

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public NodoArbolAVL getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbolAVL hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbolAVL getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbolAVL hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    private int fe;
    private Categoria categoria;
    private NodoArbolAVL hijoIzquierdo;
    private NodoArbolAVL hijoDerecho;
    
    public NodoArbolAVL(Categoria c){
        this.categoria=c;
        this.fe=0;
        this.hijoIzquierdo=null;
        this.hijoDerecho=null;
    }
}
