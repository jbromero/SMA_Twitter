package SMA_Twitter;

import Clase.tweet;
import DAT.LeerArchivo;
import jade.core.Agent;
import java.sql.Array;
import java.util.ArrayList;

/**
 * @author Jose_Romero
 */
public class Agente_Recopilador extends Agent {

    String path = "DataSet/smileannotationsfinal.csv";
    LeerArchivo leer = new LeerArchivo(path);
    ArrayList<tweet> lista;
    Array arr [] = {};
    //método setup
    public void setup() {
        leer.abrirArchivo();
        lista = leer.leerRegistros();
        leer.cerrarArchivo();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getMensaje());
        }
    }
}
