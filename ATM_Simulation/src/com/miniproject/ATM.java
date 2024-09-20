package com.miniproject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ATM {
    private AccountManager amgr;

    public ATM() {
        amgr = new AccountManager();
    }

    public static boolean verifyPin(Account acc, int enteredPin) {
        return acc.getPin() == enteredPin;
    }

    public void changePin(Account acc) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your New Pin: ");
        int newPin = sc.nextInt();
        acc.setPin(newPin);
        amgr.update(acc);
        System.out.println("PIN successfully changed.");
    }

    private void withdraw(Account acc) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money do you want to withdraw? ");
        double amount = sc.nextDouble();
        if (amgr.withdraw(acc, amount)) {
            System.out.println("Please collect " + amount + " from the cash section.");
        } else {
            System.out.println("Not enough balance!");
        }
    }

    public void deposit(Account acc) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money do you want to deposit? ");
        double amount = sc.nextDouble();
        if (amgr.deposit(acc, amount)) {
            System.out.println("Deposit successful!");
        }
    }

    public int selectOption() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (true) {
            System.out.println("Choose an Option: ");
            System.out.println("1. Change PIN ");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            option = sc.nextInt();
            if (option == 1 || option == 2 || option == 3) {
                break;
            }
            System.out.println("Invalid option. Please try again.");
        }
        return option;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM,\n1. Search by ID,\n2. Search by Name,\n0. Exit");
            int searchOption = sc.nextInt();
            if (searchOption == 0) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            }

            try {
                Account acc = null;

                if (searchOption == 1) {
                    System.out.println("Enter Account Number: ");
                    int accountNumber = sc.nextInt();
                    acc = atm.amgr.getAccount(accountNumber);
                } else if (searchOption == 2) {
                    System.out.println("Enter Name: ");
                    String name = sc.next();
                    List<Account> accounts = atm.amgr.searchByName(name);
                    for (Account a : accounts) {
                        System.out.println(a);
                        System.out.println("If this is your account, type 'Y' or else 'N' to see more results ");
                        String choice = sc.next();
                        if (choice.equalsIgnoreCase("Y")) {
                            acc = a;
                            break;
                        }
                    }
                }

                if (acc == null) {
                    System.out.println("Account not found. Please try again.");
                    continue;
                }

                System.out.println("Your account details are: ");
                System.out.println(acc);

                int option = atm.selectOption();
                System.out.println("Enter your PIN: ");
                int numPinAttempts = 0;
                boolean pinVerified = false;

                while (numPinAttempts < 3) {
                    int enteredPin = sc.nextInt();
                    if (!verifyPin(acc, enteredPin)) {
                        numPinAttempts++;
                        if (numPinAttempts < 3) {
                            System.out.println("Incorrect PIN. Please try again (" + (3 - numPinAttempts) + " attempts remaining): ");
                        }
                    } else {
                        pinVerified = true;
                        break;
                    }
                }

                if (!pinVerified) {
                    System.out.println("Too many incorrect PIN attempts. Transaction cancelled.");
                    continue;
                }

                switch (option) {
                    case 1:
                        atm.changePin(acc);
                        break;
                    case 2:
                        atm.withdraw(acc);
                        break;
                    case 3:
                        atm.deposit(acc);
                        break;
                }

                System.out.println("Your account details after modification are: ");
                System.out.println(acc);

            } catch (AccountDoesNotExist e) {
                System.out.println("No account with that number or name exists.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println();
            }
        }
    }
}
