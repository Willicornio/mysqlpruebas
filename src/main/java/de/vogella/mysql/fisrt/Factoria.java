package de.vogella.mysql.fisrt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;





public class Factoria extends Session   {




    public static Session getSession() {
        Session s = new Session();
        return s;
    }


}

