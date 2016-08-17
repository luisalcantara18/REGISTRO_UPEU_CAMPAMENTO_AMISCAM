/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.alumnoDao;
import dto.alumnoDto;
import java.sql.Connection;
import util.Conexion;

/**
 *
 * @author vpalacios1
 */
public class test {
    private static final alumnoDao ds=new alumnoDao();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conex();
        //guardar();
        //modificar();
        //eliminar();
        //listar();
    }
    public static void conex(){
        
        Connection cx=Conexion.getConexion();
        if(cx!=null)
        {
            System.out.println("si");
        }
        else{
            System.out.println("no");
        }
    }
}