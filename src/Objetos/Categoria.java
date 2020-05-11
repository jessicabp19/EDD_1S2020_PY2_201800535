package Objetos;
import Estructuras.ArbolB;
public class Categoria {
    private String nomCategoria;
    private ArbolB arbolb;
    private long carnetCreador;
    
    public Categoria(String nombre, ArbolB arbol, long carnet){
        this.nomCategoria=nombre;
        this.arbolb=arbol;
        this.carnetCreador=carnet;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public ArbolB getArbolb() {
        return arbolb;
    }

    public void setArbolb(ArbolB arbolb) {
        this.arbolb = arbolb;
    }

    public long getCarnetCreador() {
        return carnetCreador;
    }

    public void setCarnetCreador(long carnetCreador) {
        this.carnetCreador = carnetCreador;
    }

}
