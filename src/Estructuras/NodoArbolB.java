package Estructuras;
import Objetos.Libro;
import java.util.Arrays;
import java.util.Comparator;

public class NodoArbolB {
    private Libro[] clavesLibros;//CLAVES
    private NodoArbolB[] hijos;//HIJOS
    
    public int cantLibros;
    public int cantHijos;
    private Comparator<Libro> comparatorKeys = (Libro arg0, Libro arg1)
            -> arg0.getISBN() - arg1.getISBN();
    private Comparator<NodoArbolB> comparator = (NodoArbolB arg0, NodoArbolB arg1)
            -> arg0.getKey(0).getISBN() - arg1.getKey(0).getISBN();
    protected NodoArbolB parent = null;
    
    
    public NodoArbolB(NodoArbolB parent, int MaxCantLibros, int MaxCantHijos) {
        this.parent = parent;
        this.clavesLibros = new Libro[MaxCantLibros + 1];
        this.cantLibros = 0;
        this.hijos = new NodoArbolB[MaxCantHijos + 1];
        this.cantHijos = 0;
    }
    
     public Libro getKey(int index) {
        return clavesLibros[index];
    }

    public int indexOf(Integer value) {//int
        for (int i = 0; i < cantLibros; i++) {
            if (clavesLibros[i].getISBN().equals(value)) {//EQUALS
                return i;
            }
        }
        return -1;
    }

    public void addKey(Libro book) {
        clavesLibros[cantLibros++] = book;
        Arrays.sort(clavesLibros, 0, cantLibros, comparatorKeys);
    }
    
    public Libro removeKey(Integer isbn) {
        System.out.println("a");
        Libro removed = null;
        boolean found = false;
        if (cantLibros == 0) {
            System.out.println("b");
            return null;
        }
        for (int i = 0; i < cantLibros; i++) {
            System.out.println("c"+i);
            if (clavesLibros[i].getISBN().equals(isbn)) {//EQUALS
                found = true;
                removed = clavesLibros[i];
            } else if (found) {
                // shift the rest of the keys down
                clavesLibros[i - 1] = clavesLibros[i];
            }
        }
        if (found) {
            System.out.println("d");
            cantLibros--;
            clavesLibros[cantLibros] = null;
        }
        return removed;
    }

    public Libro removeKey(int index) {
        if (index >= cantLibros) {
            return null;
        }
        Libro value = clavesLibros[index];
        for (int i = index + 1; i < cantLibros; i++) {
            // shift the rest of the keys down
            clavesLibros[i - 1] = clavesLibros[i];
        }
        cantLibros--;
        clavesLibros[cantLibros] = null;
        return value;
    }
    
    public int numberOfKeys() {
        return cantLibros;
    }

    public NodoArbolB getChild(int index) {
        if (index >= cantHijos) {
            return null;
        }
        return hijos[index];
    }

    public int indexOf(NodoArbolB child) {
        for (int i = 0; i < cantHijos; i++) {
            if (hijos[i].equals(child)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean addChild(NodoArbolB child) {
        child.parent = this;
        hijos[cantHijos++] = child;
        Arrays.sort(hijos, 0, cantHijos, comparator);
        return true;
    }

    public boolean removeChild(NodoArbolB child) {
        boolean found = false;
        if (cantHijos == 0) {
            return found;
        }
        for (int i = 0; i < cantHijos; i++) {
            if (hijos[i].equals(child)) {
                found = true;
            } else if (found) {
                // shift the rest of the keys down
                hijos[i - 1] = hijos[i];
            }
        }
        if (found) {
            cantHijos--;
            hijos[cantHijos] = null;
        }
        return found;
    }
    
    public NodoArbolB removeChild(int index) {
        if (index >= cantHijos) {
            return null;
        }
        NodoArbolB value = hijos[index];
        hijos[index] = null;
        for (int i = index + 1; i < cantHijos; i++) {
            // shift the rest of the keys down
            hijos[i - 1] = hijos[i];
        }
        cantHijos--;
        hijos[cantHijos] = null;
        return value;
    }

    public int numberOfChildren() {
        return cantHijos;
    }

    public String getString() {
        StringBuilder builder = new StringBuilder();

        builder.append("keys=[");
        for (int i = 0; i < numberOfKeys(); i++) {
            Libro value = getKey(i);
            builder.append(value);
            if (i < numberOfKeys() - 1) {
                builder.append(", ");
            }
        }
        builder.append("]\n");

        if (parent != null) {
            builder.append("parent=[");
            for (int i = 0; i < parent.numberOfKeys(); i++) {
                Libro value = parent.getKey(i);
                builder.append(value);
                if (i < parent.numberOfKeys() - 1) {
                    builder.append(", ");
                }
            }
            builder.append("]\n");
        }

        if (hijos != null) {
            builder.append("keySize=").append(numberOfKeys()).append(" children=").append(numberOfChildren()).append("\n");
        }

        return builder.toString();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private int MaxCantLibros;//Max número de hijos
    private int numClavesActual;//Número actual de claves en el nodo
    private boolean leaf;//Boleano que indica si es hoja 
    //public NodoArbolB(){}
    public NodoArbolB(int M, boolean leaf){
        this.MaxCantLibros=M;
        this.leaf=leaf;
        this.clavesLibros = new Libro[M-1];
        this.hijos = new NodoArbolB[M]; 
        this.numClavesActual=0;
    }
    public Libro getLibro(int pos) {return clavesLibros[pos];}
    public void setLibro(int pos, Libro libro) {
        this.clavesLibros[pos] = libro;
    }
    public NodoArbolB getHijo(int pos) {return hijos[pos];}
    public void setHijo(int pos, NodoArbolB hijo) {
        this.hijos[pos] = hijo;
    }

    public Libro[] getClavesLibros() {return clavesLibros;}
    public void setClavesLibros(Libro[] clavesLibros) {
        this.clavesLibros = clavesLibros;
    }
    public NodoArbolB[] getHijos() {return hijos;}
    public void setHijos(NodoArbolB[] hijos) {
        this.hijos = hijos;
    }
    public int cantLibros(){
        int cantLibros=0;
        for(int i=0; i<MaxCantLibros-1;i++){
            if(getLibro(i) != null){
               cantLibros++;
            }
        }
        return cantLibros;
    }
    public boolean hayEspacio(){
        if(cantLibros()<MaxCantLibros-2){
            return true;
        }
        return false;
    }
}
