package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recuperaConexion() throws SQLException {
      return    DriverManager.getConnection(
                "jdbc:mysql://:3306/contro_de_stock?useSSL=false&Timezone=true&serverTimezone=UTC",
                "root",
                "root");
    }
}
