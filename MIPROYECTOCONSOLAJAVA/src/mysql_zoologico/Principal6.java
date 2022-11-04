package mysql_zoologico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal6 {

    public static void main(String[] args) {
        String url1 = "jdbc:mysql://localhost:3306/zoologico";      //protocolo-ip-puerto-bd
        String url2 = "jdbc:mysql://localhost:3306/tiendarabanal";  //protocolo-ip-puerto-bd

        String usuario = "root";
        String clave = "12345678";

        try {
            Connection conexion1 = DriverManager.getConnection(url1, usuario, clave);
            Connection conexion2 = DriverManager.getConnection(url2, usuario, clave);

            if (conexion1 != null && conexion2 != null) {
                //1. MOSTRAR TODAS LAS TABLAS DE LA BASE DE DATOS ZOOLOGICO
                String query = "SHOW TABLES";
                try {
                     PreparedStatement ps = conexion1.prepareStatement(query);
                     ResultSet rs = ps.executeQuery();
                     while(rs.next()) {
                         //String tabla = rs.getString(1);
                         String tabla = rs.getString("Tables_in_zoologico");
                         System.out.println(tabla);
                     }
                }catch(Exception e) {
                
                }
                
                System.out.println("OK: CONEXION " + conexion1.getCatalog() + "  " + conexion2.getCatalog());

                conexion1.close();
                conexion2.close();

            } else {
                System.out.println("ERROR: CONEXION");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
}
