package DAT;

import Clase.tweet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author T O S H I B A
 */
public class LeerArchivo {
    String path;

     //Constructores
    public LeerArchivo(){}
    public LeerArchivo(String path) {
        this.path=path;
    }
    
    private Scanner entrada;

    public boolean abrirArchivo() {
        try {
            entrada = new Scanner(new File(path));
            return true;
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo", "Warning",
        JOptionPane.WARNING_MESSAGE);
            return false;
        } // fin de catch
    } // fin del m�todo abrirArchivo

      // lee registro del archivo
    public ArrayList<tweet> leerRegistros() {

        //ArrayList<String> lista = new ArrayList<String>();
        
        ArrayList<tweet> listaObj = new ArrayList<tweet>();
        
        try // lee registros del archivo, usando el objeto Scanner
        {

            while (entrada.hasNext()) {
                //System.out.println(entrada.nextLine());
                String cadena = entrada.nextLine();
                //System.out.println("El mensaje es: "+cadena);
                
                ArrayList<String> lista = new ArrayList<String>(Arrays.asList(cadena.split(",")));
                
                String param1 = lista.get(0);
                String param2 = lista.get(1);
                tweet e = new tweet(param1, param2);
                listaObj.add(e);
//                for (int i =0; i< listaObj.size(); i++) {
//                    System.out.println(lista.get(i));
//            };
            } // fin de while
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return listaObj;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    }
}
