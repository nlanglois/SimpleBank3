package com.superbank;

public class Account {

    private int accountNumber;
    private static int counter = 0;
    private double balance = 0;
    private String type = "Generic";
    private double interest = 0.00;
    private int clientId;


    public Account(Client client) {
        counter++;
        this.accountNumber = counter;
        this.clientId = client.getClientId();
    }

    public Account(Client client, double balance) {
        this.clientId = client.getClientId();
        this.balance = balance;

        counter++;
        this.accountNumber = counter;
    }


    public double getBalance () {
        return this.balance;
    }

    public int getAccountNumber () {
        return this.accountNumber;
    }

    public String getType () {
        return this.type;
    }

    public double getInterest () {
        return this.interest;
    }

    public int getClientId () {
        return this.clientId;
    }


    public void credit (double amount) {
        this.balance += amount;
    }

    public void debit (double amount) {
        if (amount < this.getBalance()) {
            this.balance -= amount;
        }
    }

    public String getInfo () {
        return "\t#" + this.getAccountNumber() + " (" + this.getType() + ") " + "Balance: $" + this.getBalance() + " [" + this.getInterest() + " interest rate]";
    }


}
