package Estructuras;

import Objetos.*;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArbolB {
    
    private int maxHijos;
    private int maxClaves;
    private int minHijos;
    private int minClaves;
    private NodoArbolB raiz = null;//Sin null
    private int tamanio;
    private boolean existe = false;
    
    public ArbolB(int orden) {
        this.maxHijos = orden;
        this.maxClaves = orden - 1;
        this.minHijos = (orden - 1) / 2;
        this.minClaves = (orden - 1) / 2;

        this.raiz = null;
        this.tamanio = 0;
    }

    public boolean add(Libro book) {//Integer isbn, String title, String author, String editorial, int year, int edition, Categoria category, String language, Usuario user
        //Libro book = new Libro(isbn, title, author, editorial, year, edition, category, language, user);
        if (raiz == null) {
            raiz = new NodoArbolB(null, maxClaves, maxHijos);
            raiz.addKey(book);
        } else {
            NodoArbolB node = raiz;
            while (node != null) {
                if (node.numberOfChildren() == 0) {
                    node.addKey(book);
                    if (node.numberOfKeys() <= maxClaves) {
                        break;
                    }
                    // Se necesita dividir
                    split(node);
                    break;
                }
                // Navegando

                // Lesser or equal
                Libro lesser = node.getKey(0);
                if (book.getISBN().compareTo(lesser.getISBN()) <= 0) {
                    node = node.getChild(0);
                    continue;
                }

                // Greater
                int numberOfKeys = node.numberOfKeys();
                int last = numberOfKeys - 1;
                Libro greater = node.getKey(last);
                if (book.getISBN().compareTo(greater.getISBN()) > 0) {
                    node = node.getChild(numberOfKeys);
                    continue;
                }

                // Search internal nodes
                for (int i = 1; i < node.numberOfKeys(); i++) {
                    Libro prev = node.getKey(i - 1);
                    Libro next = node.getKey(i);
                    if (book.getISBN().compareTo(prev.getISBN()) > 0 && book.getISBN().compareTo(next.getISBN()) <= 0) {
                        node = node.getChild(i);
                        break;
                    }
                }
            }
        }
        tamanio++;
        return true;
    }
    
    private void split(NodoArbolB nodeToSplit) {
        NodoArbolB node = nodeToSplit;
        int numberOfKeys = node.numberOfKeys();
        int medianIndex = numberOfKeys / 2;
        Libro medianValue = node.getKey(medianIndex);

        NodoArbolB left = new NodoArbolB(null, maxClaves, maxHijos);
        for (int i = 0; i < medianIndex; i++) {
            left.addKey(node.getKey(i));
        }
        if (node.numberOfChildren() > 0) {
            for (int j = 0; j <= medianIndex; j++) {
                NodoArbolB c = node.getChild(j);
                left.addChild(c);
            }
        }

        NodoArbolB right = new NodoArbolB(null, maxClaves, maxHijos);
        for (int i = medianIndex + 1; i < numberOfKeys; i++) {
            right.addKey(node.getKey(i));
        }
        if (node.numberOfChildren() > 0) {
            for (int j = medianIndex + 1; j < node.numberOfChildren(); j++) {
                NodoArbolB c = node.getChild(j);
                right.addChild(c);
            }
        }

        if (node.parent == null) {
            // new raiz, height of tree is increased
            NodoArbolB newRoot = new NodoArbolB(null, maxClaves, maxHijos);
            newRoot.addKey(medianValue);
            node.parent = newRoot;
            raiz = newRoot;
            node = raiz;
            node.addChild(left);
            node.addChild(right);
        } else {
            // Move the median value up to the parent
            NodoArbolB parent = node.parent;
            parent.addKey(medianValue);
            parent.removeChild(node);
            parent.addChild(left);
            parent.addChild(right);

            if (parent.numberOfKeys() > maxClaves) {
                split(parent);
            }
        }
    }
    
    public NodoArbolB getRoot(){
        return raiz;
    }
    
    public Libro eliminar(Integer value) {
        System.out.println("value "+value);
        NodoArbolB node = this.getNodo(value);
        System.out.println("node "+node.cantLibros);
        Libro removed = eliminar(value, node);
        
        return removed;
    }

    private Libro eliminar(Integer value, NodoArbolB node) {
        System.out.println("1");
        if (node == null) {
            return null;
        }
        System.out.println("2");
        int index = node.indexOf(value);
        System.out.println("3");
        Libro removed = node.removeKey(value);
        System.out.println("4");
        if (node.numberOfChildren() == 0) {
            System.out.println("5");
            // leaf node
            if (node.parent != null && node.numberOfKeys() < minClaves) {
                System.out.println("51");
                this.combined(node);
            } else if (node.parent == null && node.numberOfKeys() == 0) {
                // Removing raiz node with no keys or children
                System.out.println("52");
                raiz = null;
            }
        } else {
            System.out.println("6");
            // internal node
            NodoArbolB lesser = node.getChild(index);
            NodoArbolB greatest = this.getGreatestNode(lesser);
            Libro replaceValue = this.removeGreatestValue(greatest);
            node.addKey(replaceValue);
            if (greatest.parent != null && greatest.numberOfKeys() < minClaves) {
                this.combined(greatest);
            }
            if (greatest.numberOfChildren() > maxHijos) {
                this.split(greatest);
            }
        }
        tamanio--;
        return removed;
    }
    
    private Libro removeGreatestValue(NodoArbolB node) {
        Libro value = null;
        if (node.numberOfKeys() > 0) {
            value = node.removeKey(node.numberOfKeys() - 1);
        }
        return value;
    }

    public void clear() {
        raiz = null;
        tamanio = 0;
    }

    public boolean contains(Integer value) {
        NodoArbolB node = getNodo(value);
        return (node != null);
    }

    public NodoArbolB getNodo(Integer value) {
        NodoArbolB node = raiz;
        while (node != null) {
            Libro lesser = node.getKey(0);
            if (value.compareTo(lesser.getISBN()) < 0) {
                if (node.numberOfChildren() > 0) {
                    node = node.getChild(0);
                } else {
                    node = null;
                }
                continue;
            }

            int numberOfKeys = node.numberOfKeys();
            int last = numberOfKeys - 1;
            Libro greater = node.getKey(last);
            if (value.compareTo(greater.getISBN()) > 0) {
                if (node.numberOfChildren() > numberOfKeys) {
                    node = node.getChild(numberOfKeys);
                } else {
                    node = null;
                }
                continue;
            }

            for (int i = 0; i < numberOfKeys; i++) {
                Libro currentValue = node.getKey(i);
                if (currentValue.getISBN().compareTo(value) == 0) {
                    return node;
                }

                int next = i + 1;
                if (next <= last) {
                    Libro nextValue = node.getKey(next);
                    if (currentValue.getISBN().compareTo(value) < 0 && nextValue.getISBN().compareTo(value) > 0) {
                        if (next < node.numberOfChildren()) {
                            node = node.getChild(next);
                            break;
                        }
                        return null;
                    }
                }
            }
        }
        return null;
    }

    private NodoArbolB getGreatestNode(NodoArbolB nodeToGet) {
        NodoArbolB node = nodeToGet;
        while (node.numberOfChildren() > 0) {
            node = node.getChild(node.numberOfChildren() - 1);
        }
        return node;
    }


    private boolean combined(NodoArbolB node) {
        NodoArbolB parent = node.parent;
        int index = parent.indexOf(node);
        int indexOfLeftNeighbor = index - 1;
        int indexOfRightNeighbor = index + 1;

        NodoArbolB rightNeighbor = null;
        int rightNeighborSize = -minHijos;
        if (indexOfRightNeighbor < parent.numberOfChildren()) {
            rightNeighbor = parent.getChild(indexOfRightNeighbor);
            rightNeighborSize = rightNeighbor.numberOfKeys();
        }

        // Try to borrow neighbor
        if (rightNeighbor != null && rightNeighborSize > minClaves) {
            // Try to borrow from right neighbor
            Libro removeValue = rightNeighbor.getKey(0);
            int prev = getIndexOfPreviousValue(parent, removeValue);
            Libro parentValue = parent.removeKey(prev);
            Libro neighborValue = rightNeighbor.removeKey(0);
            node.addKey(parentValue);
            parent.addKey(neighborValue);
            if (rightNeighbor.numberOfChildren() > 0) {
                node.addChild(rightNeighbor.removeChild(0));
            }
        } else {
            NodoArbolB leftNeighbor = null;
            int leftNeighborSize = -minHijos;
            if (indexOfLeftNeighbor >= 0) {
                leftNeighbor = parent.getChild(indexOfLeftNeighbor);
                leftNeighborSize = leftNeighbor.numberOfKeys();
            }

            if (leftNeighbor != null && leftNeighborSize > minClaves) {
                // Try to borrow from left neighbor
                Libro removeValue = leftNeighbor.getKey(leftNeighbor.numberOfKeys() - 1);
                int prev = getIndexOfNextValue(parent, removeValue);
                Libro parentValue = parent.removeKey(prev);
                Libro neighborValue = leftNeighbor.removeKey(leftNeighbor.numberOfKeys() - 1);
                node.addKey(parentValue);
                parent.addKey(neighborValue);
                if (leftNeighbor.numberOfChildren() > 0) {
                    node.addChild(leftNeighbor.removeChild(leftNeighbor.numberOfChildren() - 1));
                }
            } else if (rightNeighbor != null && parent.numberOfKeys() > 0) {
                // Can't borrow from neighbors, try to combined with right neighbor
                Libro removeValue = rightNeighbor.getKey(0);
                int prev = getIndexOfPreviousValue(parent, removeValue);
                Libro parentValue = parent.removeKey(prev);
                parent.removeChild(rightNeighbor);
                node.addKey(parentValue);
                for (int i = 0; i < rightNeighbor.cantLibros; i++) {//KeysSize
                    Libro v = rightNeighbor.getKey(i);
                    node.addKey(v);
                }
                for (int i = 0; i < rightNeighbor.cantHijos; i++) {//childrenSize
                    NodoArbolB c = rightNeighbor.getChild(i);
                    node.addChild(c);
                }

                if (parent.parent != null && parent.numberOfKeys() < minClaves) {
                    // removing key made parent too small, combined up tree
                    this.combined(parent);
                } else if (parent.numberOfKeys() == 0) {
                    // parent no longer has keys, make this node the new raiz
                    // which decreases the height of the tree
                    node.parent = null;
                    raiz = node;
                }
            } else if (leftNeighbor != null && parent.numberOfKeys() > 0) {
                // Can't borrow from neighbors, try to combined with left neighbor
                Libro removeValue = leftNeighbor.getKey(leftNeighbor.numberOfKeys() - 1);
                int prev = getIndexOfNextValue(parent, removeValue);
                Libro parentValue = parent.removeKey(prev);
                parent.removeChild(leftNeighbor);
                node.addKey(parentValue);
                for (int i = 0; i < leftNeighbor.cantLibros; i++) {//keySize
                    Libro v = leftNeighbor.getKey(i);
                    node.addKey(v);
                }
                for (int i = 0; i < leftNeighbor.cantHijos; i++) {//childrenSize
                    NodoArbolB c = leftNeighbor.getChild(i);
                    node.addChild(c);
                }

                if (parent.parent != null && parent.numberOfKeys() < minClaves) {
                    // removing key made parent too small, combined up tree
                    this.combined(parent);
                } else if (parent.numberOfKeys() == 0) {
                    // parent no longer has keys, make this node the new raiz
                    // which decreases the height of the tree
                    node.parent = null;
                    raiz = node;
                }
            }
        }
        return true;
    }

    private int getIndexOfPreviousValue(NodoArbolB node, Libro value) {
        for (int i = 1; i < node.numberOfKeys(); i++) {
            Libro t = node.getKey(i);
            if (t.getISBN().compareTo(value.getISBN()) >= 0) {
                return i - 1;
            }
        }
        return node.numberOfKeys() - 1;
    }

    private int getIndexOfNextValue(NodoArbolB node, Libro value) {
        for (int i = 0; i < node.numberOfKeys(); i++) {
            Libro t = node.getKey(i);
            if (t.getISBN().compareTo(value.getISBN()) >= 0) {
                return i;
            }
        }
        return node.numberOfKeys() - 1;
    }

    public int size() {
        return tamanio;
    }

    public boolean validate() {
        if (raiz == null) {
            return true;
        }
        return validateNode(raiz);
    }

    private boolean validateNode(NodoArbolB node) {
        int keySize = node.numberOfKeys();
        if (keySize > 1) {
            // Make sure the keys are sorted
            for (int i = 1; i < keySize; i++) {
                Libro p = node.getKey(i - 1);
                Libro n = node.getKey(i);
                if (p.getISBN().compareTo(n.getISBN()) > 0) {
                    return false;
                }
            }
        }
        int childrenSize = node.numberOfChildren();
        if (node.parent == null) {
            // raiz
            if (keySize > maxClaves) {
                // check max key tamanio. raiz does not have a min key tamanio
                return false;
            } else if (childrenSize == 0) {
                // if raiz, no children, and keys are valid
                return true;
            } else if (childrenSize < 2) {
                // raiz should have zero or at least two children
                return false;
            } else if (childrenSize > maxHijos) {
                return false;
            }
        } else {
            // non-raiz
            if (keySize < minClaves) {
                return false;
            } else if (keySize > maxClaves) {
                return false;
            } else if (childrenSize == 0) {
                return true;
            } else if (keySize != (childrenSize - 1)) {
                // If there are chilren, there should be one more child then
                // keys
                return false;
            } else if (childrenSize < minHijos) {
                return false;
            } else if (childrenSize > maxHijos) {
                return false;
            }
        }

        NodoArbolB first = node.getChild(0);
        // The first child's last key should be less than the node's first key
        if (first.getKey(first.numberOfKeys() - 1).getISBN().compareTo(node.getKey(0).getISBN()) > 0) {
            return false;
        }

        NodoArbolB last = node.getChild(node.numberOfChildren() - 1);
        // The last child's first key should be greater than the node's last key
        if (last.getKey(0).getISBN().compareTo(node.getKey(node.numberOfKeys() - 1).getISBN()) < 0) {
            return false;
        }

        // Check that each node's first and last key holds it's invariance
        for (int i = 1; i < node.numberOfKeys(); i++) {
            Libro p = node.getKey(i - 1);
            Libro n = node.getKey(i);
            NodoArbolB c = node.getChild(i);
            if (p.getISBN().compareTo(c.getKey(0).getISBN()) > 0) {
                return false;
            }
            if (n.getISBN().compareTo(c.getKey(c.numberOfKeys() - 1).getISBN()) < 0) {
                return false;
            }
        }

        for (int i = 0; i < node.cantHijos; i++) {//childrenSize
            NodoArbolB c = node.getChild(i);
            boolean valid = this.validateNode(c);
            if (!valid) {
                return false;
            }
        }

        return true;
    }
    
    //RECORRER POR NIVELES 
    public void recorridoNiveles() {
        amplitud(raiz);
    }
    public void amplitud(NodoArbolB a) { //INICIAMOS CON RAIZ DEL ARBOL
        LinkedList cola;
        NodoArbolB aux;

        if (a != null) { //SI LA RAIZ ES DIFERENTE DE NULL...
            cola = new LinkedList();
            cola.addFirst(a);

            while (cola.peek() != null) { //MIENTRAS HAYAN LIBROS EN LA COLA...
                aux = (NodoArbolB) cola.removeLast();//Obtenemos el ultimo
                recorrerImprimir(aux);//Recorremos sus claves y las imprimimos

                for (int i = 0; i < maxHijos; i++) {//CICLO PARA AGREGAR HIJOS
                    if (aux.getHijo(i) != null) {
                        cola.addFirst(aux.getHijo(i));
                    }
                }                
            }            
        }
    }
    public void recorrerImprimir(NodoArbolB arbol) {
        for (int i = 0; i < maxClaves; i++) {
            if (arbol.getLibro(i) != null) {
                System.out.print(arbol.getLibro(i).getISBN() + ", ");
            }
        }
    }
    
    public void obtenerLibros() {
        recorridoAnchura(raiz);
    }
    public void recorridoAnchura(NodoArbolB a) { //INICIAMOS CON RAIZ DEL ARBOL
        LinkedList cola;
        NodoArbolB aux;

        if (a != null) { //SI LA RAIZ ES DIFERENTE DE NULL...
            cola = new LinkedList();
            cola.addFirst(a);

            while (cola.peek() != null) { //MIENTRAS HAYAN LIBROS EN LA COLA...
                aux = (NodoArbolB) cola.removeLast();//Obtenemos el ultimo
                recorrerAgregar(aux);//Recorremos sus claves y las imprimimos

                for (int i = 0; i < maxHijos; i++) {//CICLO PARA AGREGAR HIJOS
                    if (aux.getHijo(i) != null) {
                        cola.addFirst(aux.getHijo(i));
                    }
                }                
            }            
        }
    }
    public void recorrerAgregar(NodoArbolB arbol) {
        for (int i = 0; i < maxClaves; i++) {
            if (arbol.getLibro(i) != null) {
                System.out.print(arbol.getLibro(i).getISBN() + ", ");
            }
        }
    }
    
    public void mostrarTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int cuantos = tabla.getRowCount();
        for (int i = 0; i < cuantos; i++) {
            modelo.removeRow(0);
        }
        tabla.setModel(modelo);
        
        LinkedList cola;
        NodoArbolB aux;

        if (raiz != null) { //SI LA RAIZ ES DIFERENTE DE NULL...
            cola = new LinkedList();
            cola.addFirst(raiz);

            while (cola.peek() != null) { //MIENTRAS HAYAN LIBROS EN LA COLA...
                aux = (NodoArbolB) cola.removeLast();//Obtenemos el ultimo
                for (int i = 0; i < maxClaves; i++) {
                    if (aux.getLibro(i) != null) {
                        //System.out.print(aux.getLibro(i).getISBN() + ", ");
                        Object[] datos = new Object[2];
                        datos[0] = "" + aux.getLibro(i).getISBN();
                        datos[1] = "" + aux.getLibro(i).getTitulo();
                        modelo.addRow(datos);
                    }
                }
                for (int i = 0; i < maxHijos; i++) {//CICLO PARA AGREGAR HIJOS
                    if (aux.getHijo(i) != null) {
                        cola.addFirst(aux.getHijo(i));
                    }
                }                
            }            
        }
        tabla.setModel(modelo);
    }
    
    public DefaultTableModel obtenerLibros(JTable tabla, String cadena, long carnet) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
//        int cuantos = tabla.getRowCount();
//        for (int i = 0; i < cuantos; i++) {
//            modelo.removeRow(0);
//        }
//        tabla.setModel(modelo);
        
        LinkedList cola;
        NodoArbolB aux;

        if (raiz != null) { //SI LA RAIZ ES DIFERENTE DE NULL...
            cola = new LinkedList();
            cola.addFirst(raiz);

            while (cola.peek() != null) { //MIENTRAS HAYAN LIBROS EN LA COLA...
                aux = (NodoArbolB) cola.removeLast();//Obtenemos el ultimo
                for (int i = 0; i < maxClaves; i++) {
                    if ((aux.getLibro(i) != null) && (aux.getLibro(i).getTitulo().contains(cadena))
                            && (carnet==aux.getLibro(i).getCarneUsuario())) {
                        System.out.print(aux.getLibro(i).getTitulo() + "\n");
                        Object[] datos = new Object[5];
                        datos[0] = "" + aux.getLibro(i).getISBN();
                        datos[1] = aux.getLibro(i).getTitulo();
                        datos[2] = aux.getLibro(i).getAutor();
                        datos[3] = aux.getLibro(i).getEdicion();
                        datos[4] = aux.getLibro(i).getCategoria();
                        modelo.addRow(datos);
                    }
                }
                for (int i = 0; i < maxHijos; i++) {//CICLO PARA AGREGAR HIJOS
                    if (aux.getHijo(i) != null) {
                        cola.addFirst(aux.getHijo(i));
                    }
                }                
            }            
        }
        //tabla.setModel(modelo);
        return modelo;
    }
    

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

}
