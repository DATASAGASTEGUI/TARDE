package mysql_zoologico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class OperacionesCrud {
    
    private Connection conexion;

    public OperacionesCrud(String db) {
        String url = "jdbc:mysql://localhost:3306/" + db;//protocolo-IP-PUERTO-BD
        String usuario = "root";
        String clave = "12345678";
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
        }catch(Exception e) {
            
        }
    }
    
    public List<String> getListaIdZoo() {
        List<String> idzoo_al = new ArrayList<>();
        String query = "SELECT idZoo FROM Zoologico";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
              String idZoo = rs.getString("idZoo");
              idzoo_al.add(idZoo);
            }
         }catch(Exception e) {
            idzoo_al = null;
        }
        return idzoo_al;
    }
}
