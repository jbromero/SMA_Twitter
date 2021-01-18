/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import Clase.tweet;
import DAT.DATRecopilador;
import SMA_Twitter.Agente_Recopilador;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author T O S H I B A
 */
public class BLRecopilador {
    DATRecopilador ObjDatRec = new DATRecopilador();
    
    public int AgregarFraseDB(tweet ObjFrase) throws SQLException, ClassNotFoundException{
        int intRetorno =0;
        //Descompone lo que viene en el ArrayList de Cleintes par apoderlos procesar uno a uno.
            intRetorno = ObjDatRec.AgregarFrases(ObjFrase);
        return intRetorno;
    }
}
