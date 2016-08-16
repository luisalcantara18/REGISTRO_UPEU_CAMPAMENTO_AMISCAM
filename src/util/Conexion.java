/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Conexion {
    private static final String Driver="com.mysql.jdbc.Driver";
    private static final String Url="jdbc:mysql://localhost:3306/bd_examenfinal";
    private static final String Usuario="root";
    private static final String Clave="12345678";
    private static Connection cx=null;
    public static Connection getConexion()
    {
        try {
            Class.forName(Driver);
            if(cx==null)
            {
                cx=DriverManager.getConnection(Url,Usuario,Clave);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }return cx;
    }public static void Cerrar(){
        if(cx!=null)
        {
            cx=null;
        }
    }     
}
