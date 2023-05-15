package com.mysqlpractice;

import com.mysqlpractice.db.MySQLConnection;

import java.sql.Connection;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try{
            MySQLConnection dbInstance = MySQLConnection.getInstance();
            Connection dbConnection = dbInstance.getConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}