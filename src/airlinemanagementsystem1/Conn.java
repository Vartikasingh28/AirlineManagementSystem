package airlinemanagementsystem1;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "vartika2710@#$");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

