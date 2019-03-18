package com.superbank;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int clientId;
    private static int counter;
    private String name;
    private String address;


    public Client (String name, String address) {
        this.name = name;
        this.address = address;

        counter++;
        this.clientId = counter;
    }



    public int getClientId () {
        return this.clientId;
    }

    public String getAddress () {
        return this.address;
    }

    public String getName () {
        return this.name;
    }

    public String getInfo () {
        return getClientId() + ": " + getName() + " (" + getAddress() + ")";
    }

    public List<Account> getAccounts (AccountCollection accounts) {
        List<Account> clientAccounts = new ArrayList<>();

        for (Account account : accounts.all()) {
            if (account.getClient().clientId == this.getClientId()) {
                clientAccounts.add(account);
            }
        }

//        Another way:
//        List<Account> clientAccounts = accounts.all().stream()
//                .filter(account -> account.getClient().getClientId() == client.getClientId())
//                .collect(Collectors.toList());

        return clientAccounts;
    }


    public Account getAccount (int id, AccountCollection accounts) {
        return this.getAccounts(accounts).get(id);
    }


}
