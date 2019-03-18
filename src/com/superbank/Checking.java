package com.superbank;

public class Checking extends Account {

    private String type = "Checking";


    public Checking (Client client) {
        super(client);
    }

    public Checking (Client client, double balance) {
        super(client, balance);
    }


    public String getType () {
        return this.type;
    }

    public double getInterest () {
        return 0.01;
    }

}
