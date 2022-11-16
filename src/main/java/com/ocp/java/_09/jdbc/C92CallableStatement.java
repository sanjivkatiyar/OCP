package com.ocp.java._09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C92CallableStatement {

    private static Connection con;

    public static C92CallableStatement bank = new C92CallableStatement();

    public C92CallableStatement() {
        try {
            con = DriverManager.getConnection("jdbc:postgres://localhost:5433/postgres", "postgres", "postgres");
            System.out.println("DB connection OK");
        } catch (SQLException e) {
            System.out.println("Exception!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        bank.noParam();
        bank.inParam();
        bank.outParam();
        bank.inOutParam();
    }

    public void noParam(){

    }

    public void inParam(){

    }

    public void outParam(){

    }

    public void inOutParam(){

    }
}
