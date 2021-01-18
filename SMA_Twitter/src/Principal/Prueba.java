/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clase.tweet;
import SMA_Twitter.Agente_Recopilador;
import SMA_Twitter.anAgent;

/**
 *
 * @author T O S H I B A
 */
public class Prueba {
    public static void main(String[] args) {
        Agente_Recopilador rec_agent = new Agente_Recopilador();
        anAgent anAg = new anAgent();
        //tweet tw = new tweet();
        //System.out.println(tw.getMensaje());
        
        anAg.happy();
        rec_agent.setup(); //retorna tweet(tweet, mensaje)
        
    }
}
