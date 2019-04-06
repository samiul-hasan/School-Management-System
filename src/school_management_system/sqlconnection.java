/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author MD.SAMIUL HASAN
 */
public class sqlconnection {
    Connection conn = null;
    public static Connection dbConnector(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:SMS.sqlite");
            JOptionPane.showMessageDialog(null, "Database Connected");
            return conn;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection error! "+e);
            return null;
        }
    }
    
}
    

