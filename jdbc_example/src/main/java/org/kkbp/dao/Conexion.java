package org.kkbp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // private static final String URL = "jdbc:sqlserver://LAPTOPDEKENDRIC\\MSSQLSERVER:1433;database=pruebadescripts;encrypt=false;trustServerCertificate=true;";
    private static final String URL = "jdbc:sqlserver://LAPTOPDEKENDRIC\\MSSQLSERVER:1433;databaseName=pruebadescripts;instance=MSSQLSERVER;encrypt=false;trustServerCertificate=true;integratedSecurity=true;";

    public static Connection conexion = null;

    public static Connection obtenerConexion() {

        try {
            // Cargar el controlador JDBC de SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Obtener la conexión a la base de datos
            conexion = DriverManager.getConnection(URL);
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el controlador JDBC de SQL Server: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return conexion;
    }

    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
