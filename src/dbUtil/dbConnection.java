
package dbUtil;

/**
 *
 * @author Olebogeng Letlhoyo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    public Connection connection;
    public Connection getConnection()
    {
        
        String dbName ="studentwallet";
        String userName2 ="root";
        String password2 = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName2,password2);
        }catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        
        return connection;
    }
    
}
