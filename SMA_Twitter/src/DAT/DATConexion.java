package DAT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author T O S H I B A
 */
public class DATConexion {
    //Coneccion con la base de datos
    public static Connection con;
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/?user=DataSet"; //jdbc:mysql://127.0.0.1:3306/?user=DataSet o jdbc:mysql://localhost:3306/DataSet
            Class.forName(driver);
            return DriverManager.getConnection(url,"DataSet","");
    };
    
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException{
        con = getConnection();
        return con;
    }
    
    public void CerrarConexion() throws SQLException{
       con.close();
    }
}
