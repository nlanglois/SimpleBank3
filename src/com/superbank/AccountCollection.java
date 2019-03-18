package com.superbank;

import java.util.ArrayList;
import java.util.List;

public class AccountCollection {

    private List<Account> accounts = new ArrayList<Account>();


    public void add (Account account) {
        this.accounts.add(account);
    }

    public void remove (Account account) {
        this.accounts.remove(account);
    }

    public Account getOneById (int id) {
        return this.accounts.get(id);
    }

    public List all () {
        return this.accounts;
    }

}
