package BL;

import DAT.DATConexion;
import java.sql.SQLException;

/**
 * @author T O S H I B A
 */
public class BLConexion {
    DATConexion ManejadorConexion = new DATConexion();
    public void CerrarConexion() throws SQLException{
        ManejadorConexion.CerrarConexion();
    }
}
