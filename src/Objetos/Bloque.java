/*
 * Estos son los objetos que tendrán los nodos de la lista doblemente enlazada 
 * que almacenara a los bloques de sincronización
 */
package Objetos;
import java.util.Date;

public class Bloque {
    int INDEX;
    Date TIMESTAMP;
    Data DATA;
    int NONCE;
    String PREVIOUSHASH;
    String hash;
    
    public Bloque(){
        
    }
}
