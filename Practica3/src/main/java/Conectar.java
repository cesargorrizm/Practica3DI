/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damA
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damA
 */
public class Conectar {
    public  static  final  String URL = "jdbc:mysql://servidorifc.iesch.org:3306/cine_di";
    public static  final String USER = "pasAlumno";
    public static final String PASS = "Admin1234";
    
    
    public Connection getConnection(){
        Connection cn= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
}
