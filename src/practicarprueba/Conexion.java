/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarprueba;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sebs
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/per";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";

    private static Connection conexion = null;

    public static Connection getConexion() {
        if (conexion == null) {
            try {
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
                System.out.println("Conexión exitosa a la base de datos.");
            } catch (Exception e) {
                System.err.println("Error: No se encontró el driver JDBC.");
                e.printStackTrace();
            }
        }
        return conexion;
    }
}
