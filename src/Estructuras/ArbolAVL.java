package Estructuras;
import Objetos.Categoria;
import javax.swing.JOptionPane;

public class ArbolAVL {
    
    private NodoArbolAVL raiz;
    
    public ArbolAVL(){
        raiz=null;
    }
    public NodoArbolAVL obtenerRaiz(){
        return raiz;
    }
    //Buscar 
    public NodoArbolAVL buscar(String d, NodoArbolAVL r){//IGNORE CASE Y COMPARETO
        if(raiz==null){
            return null;
        }else if(r.categoria.getNomCategoria().equalsIgnoreCase(d)){
            return r;
        }else if(r.categoria.getNomCategoria().compareTo(d) < 0){
            return buscar(d, r.hijoDerecho);
        }else{
            return buscar(d, r.hijoIzquierdo);
        }
    }
    //Obtener el Factor de Equilibrio
    public int obtenerFE(NodoArbolAVL x){
        if(x==null){
            return -1;
        }else{
            return x.fe;
        }
    }
    
    //Rotacion Simple Izquierda
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL c){
        NodoArbolAVL auxiliar=c.hijoIzquierdo;
        c.hijoIzquierdo=auxiliar.hijoDerecho;
        auxiliar.hijoDerecho=c;
        c.fe=Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho))+1;
        auxiliar.fe=Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho))+1;
        return auxiliar;
    }
    //Rotacion Simple Derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL c){
        NodoArbolAVL auxiliar=c.hijoDerecho;
        c.hijoDerecho=auxiliar.hijoIzquierdo;
        auxiliar.hijoIzquierdo=c;
        c.fe=Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho))+1;
        auxiliar.fe=Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho))+1;
        return auxiliar;
    }
    //Rotacion Doble a la Izquierda
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL c){
        NodoArbolAVL temporal;
        c.hijoIzquierdo=rotacionDerecha(c.hijoIzquierdo);
        temporal=rotacionIzquierda(c);
        return temporal;
    }
    //Rotacion Doble a la Derecha
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL c){
        NodoArbolAVL temporal;
        c.hijoDerecho=rotacionIzquierda(c.hijoDerecho);
        temporal=rotacionDerecha(c);
        return temporal;
    }
    
    //Metodo para insertar AVL
    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subAr){
        NodoArbolAVL nuevoPadre=subAr;
        if(nuevo.categoria.getNomCategoria().compareTo(subAr.categoria.getNomCategoria()) < 0){
            if(subAr.hijoIzquierdo==null){
                subAr.hijoIzquierdo=nuevo;
            }else{
                subAr.hijoIzquierdo=insertarAVL(nuevo,subAr.hijoIzquierdo);
                if((obtenerFE(subAr.hijoIzquierdo)-obtenerFE(subAr.hijoDerecho))==2){
                    if(nuevo.categoria.getNomCategoria().compareTo(subAr.hijoIzquierdo.categoria.getNomCategoria()) < 0){//.dato<subAr.hijoIzquierdo.dato){
                        nuevoPadre=rotacionIzquierda(subAr);
                    }else{
                        nuevoPadre=rotacionDobleIzquierda(subAr);
                    }
                }
            }
        }else if(nuevo.categoria.getNomCategoria().compareTo(subAr.categoria.getNomCategoria()) >  0){
            if(subAr.hijoDerecho==null){
                subAr.hijoDerecho=nuevo;
            }else{
                subAr.hijoDerecho=insertarAVL(nuevo, subAr.hijoDerecho);
                if((obtenerFE(subAr.hijoDerecho)-obtenerFE(subAr.hijoIzquierdo)==2)){
                    if(nuevo.categoria.getNomCategoria().compareTo(subAr.hijoDerecho.categoria.getNomCategoria()) > 0){//dato>subAr.hijoDerecho.dato){
                        nuevoPadre=rotacionDerecha(subAr);
                    }else{
                        nuevoPadre=rotacionDobleDerecha(subAr);
                    }
                }
            }
        }else{
            System.out.println("Nodo Duplicado");
            JOptionPane.showMessageDialog(null, "Categoria existente", "ATENCIÓN", 0);
        }
        //Actualizando la altura
        if((subAr.hijoIzquierdo==null) && (subAr.hijoDerecho!=null)){
           subAr.fe=subAr.hijoDerecho.fe+1;
        }else if((subAr.hijoDerecho==null)&&(subAr.hijoIzquierdo!=null)){
            subAr.fe=subAr.hijoIzquierdo.fe+1;
        }else{
            subAr.fe=Math.max(obtenerFE(subAr.hijoIzquierdo), obtenerFE(subAr.hijoDerecho)+1);
        }
        return nuevoPadre;
    }
    //Metodo para insertar
    public void insertar(Categoria c){
        NodoArbolAVL nuevo=new NodoArbolAVL(c);
        if(raiz==null){
            raiz=nuevo;
        }else{
            raiz=insertarAVL(nuevo, raiz);
        }
    }
    //Recorridos
    //Metodo para recorrer el Arbol InOrden
    public void inOrden(NodoArbolAVL r){
        if(r!=null){
            inOrden(r.hijoIzquierdo);
            System.out.print(r.categoria.getNomCategoria()+", ");
            inOrden(r.hijoDerecho);
        }
    }
    //Metodo para recorrer el Arbol PreOrden
    public void preOrden(NodoArbolAVL r){
        if(r!=null){
            System.out.print(r.categoria.getNomCategoria()+", ");
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }
    //Metodo para recorrer el Arbol PostOrden
    public void postOrden(NodoArbolAVL r){
        if(r!=null){
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            System.out.print(r.categoria.getNomCategoria()+", ");
        }
    }
}

/*
public NodoArbolAVL buscar(Categoria d, NodoArbolAVL r){
        if(raiz==null){
            return null;
        }else if(r.categoria==d){
            return r;
        }else if(r.dato<d){
            return buscar(d, r.hijoDerecho);
        }else{
            return buscar(d, r.hijoIzquierdo);
        }
    }
*/