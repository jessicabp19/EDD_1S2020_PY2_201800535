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
        }else if(r.getCategoria().getNomCategoria().equalsIgnoreCase(d)){
            return r;
        }else if(r.getCategoria().getNomCategoria().compareTo(d) < 0){
            return buscar(d, r.getHijoDerecho());
        }else{
            return buscar(d, r.getHijoIzquierdo());
        }
    }
    //Obtener el Factor de Equilibrio
    public int obtenerFE(NodoArbolAVL x){
        if(x==null){
            return -1;
        }else{
            return x.getFe();
        }
    }
    
    //Rotacion Simple Izquierda
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL c){
        NodoArbolAVL auxiliar=c.getHijoIzquierdo();
        c.setHijoIzquierdo(auxiliar.getHijoDerecho());
        auxiliar.setHijoDerecho(c);
        c.setFe(Math.max(obtenerFE(c.getHijoIzquierdo()), obtenerFE(c.getHijoDerecho())) + 1);
        auxiliar.setFe(Math.max(obtenerFE(auxiliar.getHijoIzquierdo()), obtenerFE(auxiliar.getHijoDerecho())) + 1);
        return auxiliar;
    }
    //Rotacion Simple Derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL c){
        NodoArbolAVL auxiliar=c.getHijoDerecho();
        c.setHijoDerecho(auxiliar.getHijoIzquierdo());
        auxiliar.setHijoIzquierdo(c);
        c.setFe(Math.max(obtenerFE(c.getHijoIzquierdo()), obtenerFE(c.getHijoDerecho())) + 1);
        auxiliar.setFe(Math.max(obtenerFE(auxiliar.getHijoIzquierdo()), obtenerFE(auxiliar.getHijoDerecho())) + 1);
        return auxiliar;
    }
    //Rotacion Doble a la Izquierda
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL c){
        NodoArbolAVL temporal;
        c.setHijoIzquierdo(rotacionDerecha(c.getHijoIzquierdo()));
        temporal=rotacionIzquierda(c);
        return temporal;
    }
    //Rotacion Doble a la Derecha
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL c){
        NodoArbolAVL temporal;
        c.setHijoDerecho(rotacionIzquierda(c.getHijoDerecho()));
        temporal=rotacionDerecha(c);
        return temporal;
    }
    
    //Metodo para insertar AVL
    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subAr){
        NodoArbolAVL nuevoPadre=subAr;
        if(nuevo.getCategoria().getNomCategoria().compareTo(subAr.getCategoria().getNomCategoria()) < 0){
            if(subAr.getHijoIzquierdo()==null){
                subAr.setHijoIzquierdo(nuevo);
            }else{
                subAr.setHijoIzquierdo(insertarAVL(nuevo, subAr.getHijoIzquierdo()));
                if((obtenerFE(subAr.getHijoIzquierdo())-obtenerFE(subAr.getHijoDerecho()))==2){
                    if(nuevo.getCategoria().getNomCategoria().compareTo(subAr.getHijoIzquierdo().getCategoria().getNomCategoria()) < 0){//.dato<subAr.hijoIzquierdo.dato){
                        nuevoPadre=rotacionIzquierda(subAr);
                    }else{
                        nuevoPadre=rotacionDobleIzquierda(subAr);
                    }
                }
            }
        }else if(nuevo.getCategoria().getNomCategoria().compareTo(subAr.getCategoria().getNomCategoria()) >  0){
            if(subAr.getHijoDerecho()==null){
                subAr.setHijoDerecho(nuevo);
            }else{
                subAr.setHijoDerecho(insertarAVL(nuevo, subAr.getHijoDerecho()));
                if((obtenerFE(subAr.getHijoDerecho())-obtenerFE(subAr.getHijoIzquierdo())==2)){
                    if(nuevo.getCategoria().getNomCategoria().compareTo(subAr.getHijoDerecho().getCategoria().getNomCategoria()) > 0){//dato>subAr.hijoDerecho.dato){
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
        if((subAr.getHijoIzquierdo()==null) && (subAr.getHijoDerecho()!=null)){
           subAr.setFe(subAr.getHijoDerecho().getFe() + 1);
        }else if((subAr.getHijoDerecho()==null)&&(subAr.getHijoIzquierdo()!=null)){
            subAr.setFe(subAr.getHijoIzquierdo().getFe() + 1);
        }else{
            subAr.setFe(Math.max(obtenerFE(subAr.getHijoIzquierdo()), obtenerFE(subAr.getHijoDerecho()) + 1));
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
            inOrden(r.getHijoIzquierdo());
            System.out.print(r.getCategoria().getNomCategoria()+", ");
            inOrden(r.getHijoDerecho());
        }
    }
    //Metodo para recorrer el Arbol PreOrden
    public void preOrden(NodoArbolAVL r){
        if(r!=null){
            System.out.print(r.getCategoria().getNomCategoria()+", ");
            preOrden(r.getHijoIzquierdo());
            preOrden(r.getHijoDerecho());
        }
    }
    //Metodo para recorrer el Arbol PostOrden
    public void postOrden(NodoArbolAVL r){
        if(r!=null){
            postOrden(r.getHijoIzquierdo());
            postOrden(r.getHijoDerecho());
            System.out.print(r.getCategoria().getNomCategoria()+", ");
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