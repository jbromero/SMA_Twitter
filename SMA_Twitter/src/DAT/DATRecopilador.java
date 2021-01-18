/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT;

import Clase.tweet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author T O S H I B A
 */
public class DATRecopilador {
    DATConexion c = new DATConexion();
    
    public int AgregarFrases(tweet ObjFrase) throws ClassNotFoundException, SQLException{
        int intRetorno=0;
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "INSERT INTO test.datasetsmile (codigo, mensaje)  VALUES ( " 
                +"'" +ObjFrase.getTweet()+"'"  + "," 
                +"'" + ObjFrase.getMensaje() + ")" ;
        intRetorno = st.executeUpdate(Sentencia);
        return intRetorno;
    }
}
