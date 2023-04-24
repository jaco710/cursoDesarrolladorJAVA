package com.clase013;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public void Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.getConnection("jdbc:mysql://localhost/wrproductos", "root", "1234");

            System.out.println("Conexion Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexion!");
            e.printStackTrace();
        }
    }
}
