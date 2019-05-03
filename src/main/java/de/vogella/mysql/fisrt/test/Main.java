
package de.vogella.mysql.fisrt.test;
import de.vogella.mysql.fisrt.MySQLAcces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



import de.vogella.mysql.fisrt.MySQLAcces;

public class Main {
    public static void main(String[] args) throws Exception {
        MySQLAcces dao = new MySQLAcces();
        dao.readDataBase();
    }

}

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

/*public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/feedback?" +
                            "user=root&password=dsa2019");

            // Do something with the Connection

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}*/