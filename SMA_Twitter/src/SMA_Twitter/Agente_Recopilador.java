package SMA_Twitter;

import BL.BLRecopilador;
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
    BLRecopilador objBLRecopilador = new BLRecopilador();
    ArrayList<tweet> lista;
    String obj;
    String[] arr;
    String aux1;
    String aux2;
    
        
    tweet data = new tweet();
    
    public void setup(){
        
        leer.abrirArchivo();
        lista = leer.leerRegistros();
        leer.cerrarArchivo();
        for (int i = 0; i < 2; i++) {
            System.out.println(lista.get(i));
        }
        
        /*System.out.println(lista.get(0));
        obj = lista.get(0);
        arr = obj.split(",");
        aux1 = arr[0];
        aux2 = arr[1];
        System.out.printf("ID: %s - Mensaje: %s",aux1,aux2);        
        
        try {
                tweet objData = new tweet(0,aux1, aux2);
                objBLRecopilador.AgregarFraseDB(objData);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Agente_Recopilador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Agente_Recopilador.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        //Scanner datos = new Scanner(System.in);
        /*int numero1 = 0;
        int numero2 = 0;*/
        /*ArrayList<String> Feliz = new ArrayList<String>();
        
        System.out.print("Cantidad de pablabras a buscar: ");
        int tamaño = datos.nextInt();
        for (int i = 0; i <= tamaño; i++) {
            System.out.println("Palabra:");
            Feliz.add(datos.nextLine());
        }
        
        for (int i = 0; i <= tamaño; i++) {
            System.out.println(Feliz.get(i));
        }*/
        
        /*System.out.print("Ingrese el trabajo a realizar (suma, resta, multiplicacion, divicion): ");
        String trabajo = datos.nextLine();
        System.out.print("Operacion: "+trabajo+"\n");
        System.out.print("Ingrese el primer numero: ");
        numero1 = datos.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numero2 = datos.nextInt();
        
        //doDelete();*/
    }
    
    /*protected void takeDown(){
        System.out.println("Adios...");
    }*/
}
