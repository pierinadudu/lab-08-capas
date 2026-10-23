package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=BDLab08;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";

    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(URL);
            System.out.println("¡Conexión exitosa a la base de datos!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return con;
    }
}
