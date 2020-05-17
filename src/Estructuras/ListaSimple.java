package Estructuras;
//LISTA UTILIZADA PARA ALMACENAR LOS NOMBRES DE LAS CATEGORIAS 
//Y MOSTRARLO EN LOS RECORRIDOS

public class ListaSimple {

    private NodoLS cabeza, cola;
    private int tamanio;

    public ListaSimple() {
        this.cabeza = null;
        this.cola = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return getCabeza() == null;
    }

    public void insertarUltimo(String s) {
        NodoLS nuevoNodo = new NodoLS(s);
        if (estaVacia()) {
            this.setCabeza(nuevoNodo);//En la clase "NodoCliente" ya coloqué que el siguiente=null, entonces ya no es necesario especificarlo acá
            this.setCola(nuevoNodo);
        } else {
            cola.setSiguiente(nuevoNodo);
            cola=nuevoNodo;
        }
        this.setTamanio(this.getTamanio() + 1);//Esta afuera, por que en ambos casos va a aumentar
    }
    
    public NodoLS getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoLS cabeza) {
        this.cabeza = cabeza;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public NodoLS getCola() {
        return cola;
    }

    public void setCola(NodoLS cola) {
        this.cola = cola;
    }

}
