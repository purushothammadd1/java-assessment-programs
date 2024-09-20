package com.miniproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountManager {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "root";
    private static final String PASS = "4724";

    private static final String CREATE_ACCOUNT = "INSERT INTO account (name, pin, balance) VALUES (?, ?, ?)";
    private static final String SEARCH_BY_ID = "SELECT * FROM account WHERE account_number = ?";
    private static final String UPDATE_ACCOUNT = "UPDATE account SET name = ?, pin = ?, balance = ? WHERE account_number = ?";
    private static final String SEARCH_BY_NAME = "SELECT * FROM account WHERE name = ?";

    private Connection openConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public Account createAccount(Account acc) throws SQLException {
        try (Connection cnx = openConnection();
             PreparedStatement pstmt = cnx.prepareStatement(CREATE_ACCOUNT, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.clearParameters();
            pstmt.setString(1, acc.getName());
            pstmt.setInt(2, acc.getPin());
            pstmt.setDouble(3, acc.getBalance());
            pstmt.executeUpdate();
            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                if (rs.next()) {
                    acc.setAccountNumber(rs.getInt(1));
                }
            }
        }
        return acc;
    }

    public Account getAccount(int accountNumber) throws SQLException, AccountDoesNotExist {
        Account acc = null;
        try (Connection cnx = openConnection();
             PreparedStatement pstmt = cnx.prepareStatement(SEARCH_BY_ID)) {
            pstmt.clearParameters();
            pstmt.setInt(1, accountNumber);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    acc = new Account(rs.getInt("account_number"), rs.getString("name"), rs.getInt("pin"), rs.getDouble("balance"));
                } else {
                    throw new AccountDoesNotExist("No Account with that ID");
                }
            }
        }
        return acc;
    }

    public List<Account> searchByName(String name) throws SQLException {
        List<Account> accounts = new ArrayList<>();
        try (Connection cnx = openConnection();
             PreparedStatement pstmt = cnx.prepareStatement(SEARCH_BY_NAME)) {
            pstmt.clearParameters();
            pstmt.setString(1, name);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    accounts.add(new Account(rs.getInt("account_number"), rs.getString("name"), rs.getInt("pin"), rs.getDouble("balance")));
                }
            }
        }
        return accounts;
    }

    public boolean update(Account acc) throws SQLException {
        try (Connection cnx = openConnection();
             PreparedStatement pstmt = cnx.prepareStatement(UPDATE_ACCOUNT)) {
            pstmt.clearParameters();
            pstmt.setString(1, acc.getName());
            pstmt.setInt(2, acc.getPin());
            pstmt.setDouble(3, acc.getBalance());
            pstmt.setInt(4, acc.getAccountNumber());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean withdraw(Account acc, double amount) throws SQLException {
        if (acc.getBalance() < amount) {
            return false;
        }
        acc.setBalance(acc.getBalance() - amount);
        return update(acc);
    }

    public boolean deposit(Account acc, double amount) throws SQLException {
        acc.setBalance(acc.getBalance() + amount);
        return update(acc);
    }
}
