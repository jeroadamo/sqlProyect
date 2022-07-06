package com.solvd.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {

    private Connection connection;
    {
        {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/Jerónimo_Adamo", "root", "devintern");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public Connection getConnection() {
        return connection;
    }
}
