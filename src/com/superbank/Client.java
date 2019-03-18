package com.superbank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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

//        List<Account> clientAccounts = accounts.all().stream()
//                .filter(account -> account.getClient().getClientId() == client.getClientId())
//                .collect(Collectors.toList());

//        Iterator<Account> a = accounts.iterator();
//        while (a.hasNext()) {
////            System.out.println(a.next());
//            if (a.next().getClientId() == this.getClientId()) {
//                clientAccounts.add(clients.getOneById(a.next().getClientId()));
//            }
//        }

//        accounts.forEach((a) -> {
//            System.out.println(a);
//        });

//
//        for (int a = 0; a < accounts.all().size(); a++) {
//            Account account = accounts.getOneById(a);
//            if (account.getClientId() == this.getClientId()) {
//                clientAccounts.add(account);
//            }
//        }
        return clientAccounts;
    }


}
