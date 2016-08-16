/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.usuarioDao;
import dto.usuarioDto;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import util.Conexion;

/**
 *
 * @author vpalacios1
 */
public class test {
    private static usuarioDao aO = new usuarioDao();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       eliminar();
    }
    public static void conex(){
        Connection cx = Conexion.getConexion();
        if(cx!=null){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
        
    }
    public static void validar(){
        
        if(aO.validarUser("dreyna", "123")){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void listar(){
        List<usuarioDto> lista = new ArrayList<>();
        lista = aO.readAll();
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).getUser());
        }
    }
    public static void guardar(){
        usuarioDto dTO = new usuarioDto("hola", "123");
        int op = aO.create(dTO);
        if(op>0){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void modificar(){
        usuarioDto dTO = new usuarioDto("Cesar 123", "karen");
        dTO.setIduser(2);
        int op = aO.update(dTO);
        if(op>0){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void eliminar(){
        int x = 5;

        int op = aO.delete(x);
        if(op>0){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
}
