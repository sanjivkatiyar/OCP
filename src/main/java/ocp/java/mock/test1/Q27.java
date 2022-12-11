package ocp.java.mock.test1;

import java.sql.*;

public class Q27 {

    public static void main(String[] args) throws SQLException {

        //Statement stmt = null;
        Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
        //try (stmt =c.createStatement();){
            try(Statement stmt = c.createStatement()){
            ResultSet rs = stmt.executeQuery("select * from STUDENT");
            while (rs.next()) {
                System.out.println(rs.getString(0));
            }
        } catch(SQLException e){
            System.out.println("Exception ");
        }
    }
}
/*
Observe that the declaration of try-with-resources statement is wrong.
The type of the resource must be specified in the try itself.
i.e. it should be: try(Statement stmt = c.createStatement())
The try-with-resource was enhanced in Java 9
and it now allows you to use a variable declared before the try statement
in the try-with-resource block as long as it is final or effectively final.
For example, the following is valid since Java 9:
Statement stmt = c.createStatement();
try(stmt){ ... }
However, try(stmt = c.createStatement();) is still invalid.
 */