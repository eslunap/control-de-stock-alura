package com.alura.jdbc.pruebas;

import com.alura.jdbc.CreaConexion;

import java.sql.Connection;
import java.sql.SQLException;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
        Connection con = new CreaConexion().recuperaConexion();

        System.out.println("Cerrando la conexión");

        con.close();
    }

}
