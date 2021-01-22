package SMA_Twitter;

import Clase.tweet;
import DAT.LeerArchivo;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Jose_Romero
 */
public class Agente_Recopilador extends Agent {

    //método setup
    @Override
    public void setup() {
        System.out.println("Agente Recopilador "+ getAID().getName() + " Iniciado");
        addBehaviour(new OneShotBehaviour() {
        @Override
        public void action(){
            String path = "DataSet/smileannotationsfinal.csv";
            LeerArchivo leer = new LeerArchivo(path);
            ArrayList<tweet> lista;
            
            leer.abrirArchivo();
            lista = leer.leerRegistros();
            leer.cerrarArchivo();
            int tamaño = 0;
            int incremeto = 0;
            
            for (int i = 0; i < lista.size(); i++) {
                tamaño ++;
            }
            System.out.println(tamaño);
            String cadena[] = new String[lista.size()];
            /*for (tweet obj : lista) {
                cadena = new String[lista.size()];
                cadena[incremeto] = lista.get(incremeto).getMensaje();
                incremeto++;
            }*/
            
            for (int i = 0; i < 10; i++) {
            System.out.println(lista.get(i).getMensaje());
        }
            
            for (int i = 0; i < 10; i++) {
                cadena[i] = lista.get(i).getMensaje();
            }
            
            for (int i = 0; i < 10; i++) {
                System.out.println("mensaje "+cadena[i]);
            }
            ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
            msg.setContent(Arrays.toString(cadena));
            msg.addReceiver(new AID("agenteAnalizador", AID.ISLOCALNAME));
            send(msg);
        }
    });
    }
    
    @Override
    protected void takeDown(){
        System.out.println("Agente Recopilador " + getAID().getName() + " terminado.");
    }
    
//    public void LeerArchivo(String path){
//        addBehaviour(new OneShotBehaviour() {
//        @Override
//        public void action(){
//            LeerArchivo leer = new LeerArchivo(path);
//            ArrayList<tweet> lista;
//            
//            leer.abrirArchivo();
//            lista = leer.leerRegistros();
//            leer.cerrarArchivo();
//            int tamaño = 0;
//            int incremeto = 0;
//            
//            for (int i = 0; i < lista.size(); i++) {
//                tamaño ++;
//            }
//            System.out.println(tamaño);
//            String cadena[] = new String[tamaño];
//            /*for (tweet obj : lista) {
//                cadena = new String[lista.size()];
//                cadena[incremeto] = lista.get(incremeto).getMensaje();
//                incremeto++;
//            }*/
//            
//            for (int i = 0; i < lista.size(); i++) {
//                cadena = new String[lista.size()];
//                cadena[i] = lista.get(i).getMensaje();
//            }
//            
//            for (int i = 0; i < cadena.length; i++) {
//                System.out.println(cadena[i]);
//            }
//            ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
//            msg.setContent(Arrays.toString(cadena));
//            msg.addReceiver(new AID("agenteAnalizador", AID.ISLOCALNAME));
//            send(msg);
//        }
//    });
//    }
}
