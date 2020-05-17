package Estructuras;
/**
 * Se utilizara en la lista simple para los recorridos del arbol AVL
 * @author JESSICA
 */
public class NodoLS {
    private String nombre;
    private NodoLS siguiente;
    
    public NodoLS(String nombre) {
        this.nombre = nombre;
        this.siguiente= null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoLS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLS siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
