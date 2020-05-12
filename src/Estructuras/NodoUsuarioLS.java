package Estructuras;
import Objetos.Usuario;

public class NodoUsuarioLS {//NODO PARA LISTA SIMPLE
    private Usuario usuario;
    private NodoUsuarioLS siguiente;
    
    //public NodoUsuarioLS(){this.siguiente=null;}
    
    public NodoUsuarioLS(Usuario usuario) {
        this.usuario = usuario;
        this.siguiente= null;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public void setCliente(Usuario usuario){
        this.usuario=usuario;
    }
    
    public NodoUsuarioLS getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(NodoUsuarioLS siguiente){
        this.siguiente=siguiente;
    }
}
