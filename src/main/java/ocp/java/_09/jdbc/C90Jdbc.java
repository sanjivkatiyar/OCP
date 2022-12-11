package ocp.java._09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C90Jdbc {

    private static Connection con;
    public static C90Jdbc bank = new C90Jdbc();

    public C90Jdbc() {
        try {
            con = DriverManager.getConnection("jdbc:postgres://localhost:5433/postgres", "postgres", "postgres");
            System.out.println("DB connection OK");
        } catch (SQLException e) {
            System.out.println("Exception!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
