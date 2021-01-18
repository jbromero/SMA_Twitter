/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SMA_Twitter;

import Clase.tweet;
import DAT.LeerArchivo;
import jade.core.Agent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LENOVO
 */
public class anAgent extends Agent {
    
    public void happy(){
        
        String[] cadenas = new String[3]; // creating array
        cadenas[0] = "happy ";
        cadenas[1] = "she's happy";
        cadenas[2] = "hungry";
        
        Pattern pat_happy = Pattern.compile(".*happy.*");
        Matcher mat;
        String cad;
        int happy = 0;
        
        for(int i=0; i<cadenas.length; i++){
            cad = (cadenas[i]);
            mat = pat_happy.matcher(cad);
            if (mat.matches()) {
                happy = happy+1;
            }
        }
        
        System.out.println("De "+cadenas.length+" tuits analizados, "+happy+" mencionan la palabra feliz");
        
    }
    
}
