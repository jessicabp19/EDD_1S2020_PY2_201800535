package Estructuras;
import Objetos.Categoria;

public class NodoArbolAVL {
    int fe;
    Categoria categoria;
    NodoArbolAVL hijoIzquierdo, hijoDerecho;
    
    public NodoArbolAVL(Categoria c){
        this.categoria=c;
        this.fe=0;
        this.hijoIzquierdo=null;
        this.hijoDerecho=null;
    }
}
