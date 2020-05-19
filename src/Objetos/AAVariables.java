package Objetos;

import UI.UsacLibrary;
import Estructuras.*;
import Objetos.*;
import Archivos.BTree;
import java.io.File;
import javax.swing.JOptionPane;

public class AAVariables {

    private final String direcJar=System.getProperty("user.dir") + "\\DocsReportes\\";
    public static TablaHash miTablaUsuarios = new TablaHash(45);
    public static Usuario miUsuarioLogueado;
    public static ArbolAVL miArbolAVLCategorias = new ArbolAVL();
    public static ArbolB miArbolBActual=null;
    public static String tituloArbolB="";

    public AAVariables() {
        Usuario defaultUser = new Usuario(123, "Admin", "Encargado", "AdmonEmpresas", "123");
        miTablaUsuarios.insertar(defaultUser);
        UsacLibrary miPantalla = new UsacLibrary();
        miPantalla.setVisible(true);
        miPantalla.setTitle("USAC LIBRARY");
        miPantalla.setResizable(false);
        miPantalla.setLocationRelativeTo(null);
        creaciónArchivos();
    }

    private void creaciónArchivos(){
        try{
            File directorioBC = new File("BlockChain");
            directorioBC.mkdir();
            File directorioRep = new File("DocsReportes");
            directorioRep.mkdir();
            File adot = new File(direcJar + "ArbolAVL.dot");
            adot.createNewFile();
            File apng = new File(direcJar + "ArbolAVL.png");
            apng.createNewFile();
            File bdot = new File(direcJar + "ArbolB.dot");
            bdot.createNewFile();
            File bpng = new File(direcJar + "ArbolB.png");
            bpng.createNewFile();
            File cdot = new File(direcJar + "Blockchain.dot");
            cdot.createNewFile();
            File cpng = new File(direcJar + "Blockchain.png");
            cpng.createNewFile();
            File ddot = new File(direcJar + "InOrden.dot");
            ddot.createNewFile();
            File dpng = new File(direcJar + "InOrden.png");
            dpng.createNewFile();
            File edot = new File(direcJar + "PreOrden.dot");
            edot.createNewFile();
            File epng = new File(direcJar + "PreOrden.png");
            epng.createNewFile();
            File fdot = new File(direcJar + "PostOrden.dot");
            fdot.createNewFile();
            File fpng = new File(direcJar + "PostOrden.png");
            fpng.createNewFile();

            File gpng = new File(direcJar + "ListaNodos.png");
            gpng.createNewFile();
            File gdot = new File(direcJar + "ListaNodos.dot");
            gdot.createNewFile();
            File hpng = new File(direcJar + "TablaDispersion.png");
            hpng.createNewFile();
            File hdot = new File(direcJar + "TablaDispersion.dot");
            hdot.createNewFile();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR. Especificación: " + e.getMessage(), "ATENCIÓN", 1);
        }
    }
}
