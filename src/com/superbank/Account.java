package com.superbank;

public class Account {

    private int accountNumber;
    private static int counter = 0;
    private double balance = 0;
    private String type = "Generic";
    private double interest = 0.00;
    private Client client;


    public Account(Client client) {
        counter++;
        this.accountNumber = counter;
        this.client = client;
    }

    public Account(Client client, double balance) {
        this.client = client;
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

    public Client getClient () {
        return this.client;
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
