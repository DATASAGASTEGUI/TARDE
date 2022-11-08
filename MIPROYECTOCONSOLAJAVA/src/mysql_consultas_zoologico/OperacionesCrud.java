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
            conexion = DriverManager.getConnection(url, usuario, clave);
        } catch (Exception e) {
            System.out.println("ERROR: CONEXION");
            conexion = null;
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void animalesNacidosAnio() {
        if (conexion != null) {
            int anio = Metodos.validarEntradaEntero("\nIngrese año nacimiento animal? ");
            String query = "SELECT * FROM Animal WHERE YEAR(nacimiento) = ?";
            try {
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setInt(1, anio);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "IDANIMAL", "NACIMIENTO", "PAIS", "CONTINENTE", "SEXO", "IDZOO", "IDESPECIE");
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "--------", "----------", "----", "----------", "----", "-----", "---------");
                while (rs.next()) {
                    String idAnimal = rs.getString(1);
                    Date nacimiento = rs.getDate(2);
                    String paisOrigen = rs.getString(3);
                    String continente = rs.getString(4);
                    String sexo = rs.getString(5);
                    String idZoo = rs.getString(6);
                    String idEspecie = rs.getString(7);
                    System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", idAnimal, nacimiento, paisOrigen, continente, sexo, idZoo, idEspecie);
                }
            } catch (Exception e) {
                System.out.println("ERROR: QUERY");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    public void animalesNacidosMes() {
        if (conexion != null) {
            int mes = Metodos.validarEntradaEntero("\nIngrese mes nacimiento animal? ");
            String query = "SELECT * FROM Animal WHERE MONTH(nacimiento) = ?";
            try {
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setInt(1, mes);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "IDANIMAL", "NACIMIENTO", "PAIS", "CONTINENTE", "SEXO", "IDZOO", "IDESPECIE");
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "--------", "----------", "----", "----------", "----", "-----", "---------");
                while (rs.next()) {
                    String idAnimal = rs.getString(1);
                    Date nacimiento = rs.getDate(2);
                    String paisOrigen = rs.getString(3);
                    String continente = rs.getString(4);
                    String sexo = rs.getString(5);
                    String idZoo = rs.getString(6);
                    String idEspecie = rs.getString(7);
                    System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", idAnimal, nacimiento, paisOrigen, continente, sexo, idZoo, idEspecie);
                }
            } catch (Exception e) {
                System.out.println("ERROR: QUERY");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    //MES = mes
    public void animalesNacidosAnio_Mes(String opcion) { //anio,mes,noanio
        PreparedStatement ps = null;
        if (conexion != null) {
            String query1 = "SELECT * FROM Animal WHERE YEAR(nacimiento) = ?";
            String query2 = "SELECT * FROM Animal WHERE MONTH(nacimiento) = ?";
            try {

                switch (opcion) {
                    case "anio":   break;
                    case "mes":    break;
                    case "nonio":  break;
                }

                if (opcion.equalsIgnoreCase("anio")) {
                    int anio1 = Metodos.validarEntradaEntero("\nIngrese año nacimiento animal? ");
                    ps = conexion.prepareStatement(query1);
                    ps.setInt(1, anio1);
                } else {
                    int mes1 = Metodos.validarEntradaEntero("\nIngrese mes nacimiento animal? ");
                    ps = conexion.prepareStatement(query2);
                    ps.setInt(1, mes1);
                }

                ResultSet rs = ps.executeQuery();
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "IDANIMAL", "NACIMIENTO", "PAIS", "CONTINENTE", "SEXO", "IDZOO", "IDESPECIE");
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "--------", "----------", "----", "----------", "----", "-----", "---------");
                while (rs.next()) {
                    String idAnimal = rs.getString(1);
                    Date nacimiento = rs.getDate(2);
                    String paisOrigen = rs.getString(3);
                    String continente = rs.getString(4);
                    String sexo = rs.getString(5);
                    String idZoo = rs.getString(6);
                    String idEspecie = rs.getString(7);
                    System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", idAnimal, nacimiento, paisOrigen, continente, sexo, idZoo, idEspecie);
                }
            } catch (Exception e) {
                System.out.println("ERROR: QUERY");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

}
