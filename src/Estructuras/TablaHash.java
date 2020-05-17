package Estructuras;

import Objetos.Usuario;
import javax.swing.JOptionPane;

public class TablaHash {

    private ListaUsuarios[] listaUsuarios;
    private int n;
    private int m;
    private double factor;

    public TablaHash() {
    }

    public TablaHash(int cantidad) {
        this.listaUsuarios = new ListaUsuarios[cantidad];
        this.n = 0;
        this.m = cantidad;
        this.factor = 0;
        inicializandoListas();
    }

    public void inicializandoListas() {
        for (int i = 0; i < m; i++) {
            listaUsuarios[i] = new ListaUsuarios();
        }
    }

    public void insertar(Usuario user) {
        int posicion = funcionDispersion(user.getCarnet());
        if (posicion >= 0 && posicion < m) {
            listaUsuarios[posicion].insertarUltimo(user);
            setN(getN() + 1);
        } else {
            JOptionPane.showMessageDialog(null, "Atención, el carnet porporcionado no es valido", "ATENCIÓN", 0);
        }
    }

    public Usuario obtenerUsuario(long x) {
        NodoUsuarioLS aux = buscarNodo(x);
        return aux.getUsuario();
    }
    
    public NodoUsuarioLS buscarNodo(long x) {
        int posicion = funcionDispersion(x);
        NodoUsuarioLS aux = listaUsuarios[posicion].getCabeza();
        while (aux != null) {
            if (aux.getUsuario().getCarnet() == x){//.equals(user) && aux.getCliente().getPassword().equals(password)) {//||
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public void eliminar(long x) {
        int posicion = funcionDispersion(x);
//        NodoUsuarioLS aux = listaUsuarios[posicion].getCabeza();
//        while (aux != null) {
//            if (aux.getUsuario().getCarnet() == x){//.equals(user) && aux.getCliente().getPassword().equals(password)) {//||
//                //return aux;
//            }
//            aux = aux.getSiguiente();
//        }
        
         listaUsuarios[posicion].eliminar(x);
         setN(getN() - 1);
        
        //int posicion = funcionDispersion(user.getCarnet());
//        if (posicion >= 0 && posicion < m) {
//            listaUsuarios[posicion].insertarUltimo(user);
//            setN(getN() + 1);
//        } else {
//            JOptionPane.showMessageDialog(null, "Atención, el carnet porporcionado no es valido", "ATENCIÓN", 0);
//        }
    }
    
    public boolean carnetRegistrado(long carnet) {
        int posicion = funcionDispersion(carnet);
        NodoUsuarioLS aux = listaUsuarios[posicion].getCabeza();
        while (aux != null) {
            if (aux.getUsuario().getCarnet() == carnet){//.equals(user) && aux.getCliente().getPassword().equals(password)) {//||
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    
    public boolean puedeAcceder(long carnet, String password) {
        int posicion = funcionDispersion(carnet);
        NodoUsuarioLS aux = listaUsuarios[posicion].getCabeza();
        while (aux != null) {
            if (aux.getUsuario().getCarnet() == carnet && aux.getUsuario().getPassword().equals(password)){
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public int funcionDispersion(long x) {
        return (int) x % getM();
    }

    public ListaUsuarios getUsuarios(int pos) {
        return listaUsuarios[pos];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

}
