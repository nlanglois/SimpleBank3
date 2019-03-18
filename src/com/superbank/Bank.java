package com.superbank;

import java.util.List;
import java.util.stream.Collectors;

public class Bank {

    private ClientCollection clients = new ClientCollection();
    private AccountCollection accounts = new AccountCollection();


    public void addClient (Client client) {
        this.clients.add(client);
    }

    public void removeClient (Client client) {
        this.clients.remove(client);
    }

    public void addAccount (Account account) {
        this.accounts.add(account);
    }

    public void removeAccount (Account account) {
        this.accounts.remove(account);
    }


    public void credit (Account account, double amount) {
        this.accounts.getAccount(account).credit(amount);
    }

    public void debit (Account account, double amount) {
        this.accounts.getOneById(account.getAccountNumber()-1).debit(amount);
    }


    public void printAllCustomers () {
        for (int c = 0; c < clients.all().size(); c++) {
            Client client = clients.getOneById(c);
            System.out.println(client.getInfo());

//            List<Account> clientAccounts = accounts.all().stream()
//                    .filter(account -> account.getClient().getClientId() == client.getClientId())
//                    .collect(Collectors.toList());


            for (Account account : client.getAccounts(accounts)) {
                System.out.println(account.getInfo());
            }



//            List<Account> clientAccounts = client.getAccounts(accounts);
//            for (int a = 0; a < clientAccounts.size(); a++) {
//                Account account = clientAccounts.get(a);
//                account.getInfo();
//            }


            System.out.println();
        }
    }

}
