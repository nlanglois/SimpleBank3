package com.superbank;

public class Saving extends Account {

    private String type = "Savings";


    public Saving (Client client) {
        super(client);
    }

    public Saving (Client client, double balance) {
        super(client, balance);
    }


    public String getType () {
        return this.type;
    }

    public double getInterest () {
        return 0.04;
    }

}
