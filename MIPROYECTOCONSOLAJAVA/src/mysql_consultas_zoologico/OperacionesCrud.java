package mysql_consultas_zoologico;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import libreria.Metodos;

public class OperacionesCrud {
    
    private Connection conexion;

    public OperacionesCrud() {
        String url = "jdbc:mysql://127.0.0.1:3306/zoologico"; //Protocolo-Ip-Puerto-DB
        String usuario = "root";
        String clave = "12345678";
        try {
             conexion = DriverManager.getConnection(url,usuario,clave);
        }catch(Exception e) {
            System.out.println("ERROR: CONEXION");
            conexion = null;
        }
    }

    public Connection getConexion() {
        return conexion;
    }
    
    public void animalesNacidosAnio() {
        if(conexion != null) {
           int anio =  Metodos.validarEntradaEntero("\nIngrese año nacimiento animal? ");
           String query = "SELECT * FROM Animal WHERE YEAR(nacimiento) = ?";
           try {
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setInt(1, anio);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    String idAnimal = rs.getString(1);
                    Date nacimiento = rs.getDate(2);
                    System.out.printf("%14s  %12s\n", idAnimal,nacimiento);
                }
           }catch(Exception e) {
               System.out.println("ERROR: QUERY");
           }
        }else {
            System.out.println("ERROR: CONEXION");
        }
    }





    
    
    
    
}
