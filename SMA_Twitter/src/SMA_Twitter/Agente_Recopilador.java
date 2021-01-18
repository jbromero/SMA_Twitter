package SMA_Twitter;

import Clase.tweet;
import DAT.LeerArchivo;
import jade.core.Agent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Jose_Romero
 */
public class Agente_Recopilador extends Agent{
    
    String path = "DataSet/smileannotationsfinal.csv";
    LeerArchivo leer = new LeerArchivo(path);
    ArrayList<tweet> lista;
    
    public void setup(){
        
        leer.abrirArchivo();
        lista = leer.leerRegistros();
        leer.cerrarArchivo();
        for (int i = 0; i < 2; i++) {
            System.out.println(lista.get(i));
        }
        
        //doDelete();
    }
    
    /*protected void takeDown(){
        System.out.println("Adios...");
    }*/
}
