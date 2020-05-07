package Estructuras;
import java.util.List;
import java.util.LinkedList;
import Objetos.Usuario;

public class TablaHash {
    //private List<Usuario>[] usuarios;
    private LinkedList[] usuarios;
    private int n;
    private int m;
    private double factor;
    
    public TablaHash(){}
    
    public TablaHash(int cantidad){
        this.usuarios = new LinkedList[cantidad];
        this.n=0;
        this.m=cantidad;
        this.factor=0;
    }
    
    public void buscar(long x){
        
    }
    
    public void insertar(long x, Usuario k){
        int posicion = funcionDispersion(x);
        usuarios[posicion].addLast(k);
    }
    
    public void eliminar(long x){
        
    }
    
    public int funcionDispersion(long x){
        return (int)x%m;
    }
}
