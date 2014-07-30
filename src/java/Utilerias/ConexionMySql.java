/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilerias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class ConexionMySql {

    private static String ipAddress;
    private static String dbName;
    private static String user;
    private static String password;
    private static String service;
    private static ResourceBundle propiedadesBd;

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("No se Cargo el Driver");
            e.printStackTrace();
        }
        if (propiedadesBd == null) {
            propiedadesBd = ResourceBundle.getBundle("Mysql");
            ipAddress = propiedadesBd.getString("ipAddress");
            dbName = propiedadesBd.getString("dbName");
            user = propiedadesBd.getString("user");
            password = propiedadesBd.getString("password");
            service = propiedadesBd.getString("service");
        }
        System.out.println("Conexion Exitosa");
        return DriverManager.getConnection("jdbc:mysql://" + ipAddress + ":" + service + "/" + dbName, user, password);
    }
    public static void main(String[] args) {
        try {
            ConexionMySql.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
