package com.mysqlpractice.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    // constants
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mysqlconnection";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    // attributes
    private static MySQLConnection instance;
    private static Connection connection;

    // constructor
    private MySQLConnection() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Base de datos conectada");
        }catch (ClassNotFoundException e){
            System.out.println("Class not Found");
        }
    }

    public void closeConnection() throws SQLException{
        if(connection != null){
            connection.close();
            System.out.println("Database disconnected");
        }
    }

    // methods
    public static MySQLConnection getInstance() throws SQLException{
        if(instance == null){
            instance = new MySQLConnection();
        } else if (instance.getConnection().isClosed()){
            instance = new MySQLConnection();
        }
        return instance;
    }

    public Connection getConnection(){
        return this.connection;
    }
}
