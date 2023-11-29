package com.example.qlchamcong.database;

import com.example.qlchamcong.Config;

import java.sql.Connection;

public class DatabaseConnectorFactory {
    private static DatabaseConnectorFactory factory;
    private static Connection instance;

    private DatabaseConnectorFactory() {
        System.out.println("Khoi tao factory");
        if (Config.type == DatabaseType.MYSQL) {
            instance = MySQLConnector.getConnection();
        }
    }

    public static Connection getInstance() {
        if (factory == null) {
            factory = new DatabaseConnectorFactory();
        }
        if (instance == null) {
            if (Config.type == DatabaseType.MYSQL) {
                instance = MySQLConnector.getConnection();
            }
        }
        return instance;
    }
}
