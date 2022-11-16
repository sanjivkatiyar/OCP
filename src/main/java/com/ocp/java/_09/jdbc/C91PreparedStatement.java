package com.ocp.java._09.jdbc;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class C91PreparedStatement {

    private static Connection con;

    public static C91PreparedStatement bank = new C91PreparedStatement();

    public C91PreparedStatement() {
        try {
            con = DriverManager.getConnection("jdbc:postgres://localhost:5433/postgres", "postgres", "postgres");
            System.out.println("DB connection OK");
        } catch (SQLException e) {
            System.out.println("Exception!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(bank.retrieveOne());
        bank.retrieveAll().forEach(System.out::println);
        bank.deleteOne();
        bank.deleteAll();
        bank.add();
        bank.update();
    }

    public BankAccount retrieveOne(){

        String sql = "select * from app.bank where branch_code = ? and account_number = ?";
        BankAccount bankAccount = null;

        try(PreparedStatement ps = con.prepareStatement(sql)){

            ps.setString(1, "ICICI665");
            ps.setString(2, "6536353736722");

            ResultSet rs = ps.executeQuery();

            if(!rs.next()){
                return bankAccount;
            }

            bankAccount = new BankAccount(
                    rs.getString("branch_code"),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getDouble(5));

        } catch (SQLException e) {
            System.out.println("Exception in retrieveOne()");
            e.printStackTrace();
        }
        return bankAccount;
    }

    public ArrayList<BankAccount> retrieveAll(){
        String sql = "select * from app.bank";
        ArrayList<BankAccount> accounts = new ArrayList<>();

        try(PreparedStatement ps = con.prepareStatement(sql)){

            boolean isResultSet = ps.execute();

            if(isResultSet){

                ResultSet rs = ps.getResultSet();

                while (rs.next()){

                    BankAccount account = new BankAccount(
                            rs.getString("branch_code"),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getDouble(5));
                    accounts.add(account);
                }
            }
        } catch (SQLException e) {
            System.out.println("Exception in retrieveAll()");
            e.printStackTrace();
        }
        return accounts;
    }

    public void deleteOne(){
        String sql = "delete from app.bank where branch_code = ? and account_number = ?";

        try(PreparedStatement ps = con.prepareStatement(sql)){

            ps.setString(1, "ICICI665");
            ps.setString(2, "6536353736722");

            int nRows = ps.executeUpdate();

            if(nRows == 1){
                System.out.println("Delete OK");
            } else{
                System.out.println("Delete failed");
            }

        } catch (SQLException e) {
            System.out.println("Exception in deleteOne()");
            e.printStackTrace();
        }
    }

    public void deleteAll(){

        String sql = "delete from app.bank";

        try(PreparedStatement ps = con.prepareStatement(sql)){

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception in deleteAll()");
            e.printStackTrace();
        }

    }

    public void add(){
        String sql = "insert into bank_account (branch_code, account_number, cust_name, cust_address, balance" +
                " values(?,?,?,?,?))";

        try(PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, "ICICI665");
            ps.setString(2, "6536353736722");
            ps.setString(3, "Sanjiv");
            ps.setString(4, "Scottsdale");
            ps.setDouble(5, 5000);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception in add()");
            e.printStackTrace();
        }

    }

    public void update(){
        String sql = "update bank_account set cust_name =?, cust_address =?, balance =?" +
                " where branch_code =?, account_number =?";

        try(PreparedStatement ps = con.prepareStatement(sql)){

            ps.setString(1, "Sanjiv");
            ps.setString(2, "Scottsdale");
            ps.setDouble(3, 5000);
            ps.setString(4, "ICICI665");
            ps.setString(5, "6536353736722");
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception in update()");
            e.printStackTrace();
        }
    }
}
