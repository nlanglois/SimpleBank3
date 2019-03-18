package com.superbank;

import java.util.ArrayList;
import java.util.List;

public class ClientCollection {

    private List<Client> clients = new ArrayList<>();


    public void add (Client client) {
        this.clients.add(client);
    }

    public void remove (Client client) {
        this.clients.remove(client);
    }

    public List all () {
        return this.clients;
    }

    public Client getOneById (int id) {
        return this.clients.get(id);
    }
}
