package Estructuras;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Estructuras.NodoUsuarioLS;
import Objetos.Usuario;

public class ListaUsuarios {

    private NodoUsuarioLS cabeza, cola;
    private int tamanio;

    public ListaUsuarios() {
        this.cabeza = null;
        this.cola = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return getCabeza() == null;
    }

    public void insertarUltimo(Usuario user) {
        NodoUsuarioLS nuevoNodo = new NodoUsuarioLS(user);
        if (estaVacia()) {
            this.setCabeza(nuevoNodo);//En la clase "NodoCliente" ya coloqué que el siguiente=null, entonces ya no es necesario especificarlo acá
            this.setCola(nuevoNodo);
        } else {
            cola.setSiguiente(nuevoNodo);
            cola=nuevoNodo;
        }
        this.setTamanio(this.getTamanio() + 1);//Esta afuera, por que en ambos casos va a aumentar
    }

   

    /*public boolean puedeAcceder(String user, String password) {
        NodoCliente aux = getCabeza();
        while (aux != null) {
            if (aux.getCliente().getUser().equals(user) && aux.getCliente().getPassword().equals(password)) {//||

                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }*/

    /*public Cliente obtenerCliente(String user, String password) {
        NodoCliente aux = getCabeza();
        while (aux != null) {
            if (aux.getCliente().getUser().equals(user) && aux.getCliente().getPassword().equals(password)) {//||
                cliente = aux.getCliente();
                return cliente;
            }
            aux = aux.getSiguiente();
        }
        return cliente;
    }*/


    
    
    public NodoUsuarioLS getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoUsuarioLS cabeza) {
        this.cabeza = cabeza;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public NodoUsuarioLS getCola() {
        return cola;
    }

    public void setCola(NodoUsuarioLS cola) {
        this.cola = cola;
    }

}
