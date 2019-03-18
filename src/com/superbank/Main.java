package com.superbank;

public class Main {

    public static void main(String[] args) {


        System.out.println("Starting up application...");

        Bank bank = new Bank();

        Client dalton = new Client("Waylon Dalton", "351 Surrey Circle Brooklyn NY 11209");
        bank.addClient(dalton);
        bank.addAccount(new Checking(dalton, 1356.00));
        bank.addAccount(new Saving(dalton, 599.00));

        Client henders = new Client("Justine Henders", "9858 Glen Eagles Ave. NY 11237");
        bank.addClient(henders);
        bank.addAccount(new Checking(henders, 156.00));
        bank.addAccount(new Saving(henders, 3599.00));

        Client lang = new Client("Abdullah Lang", "9927 Woodside Lane NY 11213");
        bank.addClient(lang);
        bank.addAccount(new Checking(lang, 1156.00));

        Client cruzing = new Client("Marcus Cruzing", "71 Depot Lane Brooklyn NY 11212");
        bank.addClient(cruzing);
        bank.addAccount(new Saving(cruzing, 99.00));

        Client cobbing = new Client("Thalia Cobbing", "7233 NE. Summer St. NY 11235");
        bank.addClient(cobbing);
        bank.addAccount(new Checking(cobbing, 2016.00));
        bank.addAccount(new Saving(cobbing, 35099.00));

        Client little = new Client("Mathias Little", "87 Deerfield Ave. S. Valley NY 10977");
        bank.addClient(little);
        bank.addAccount(new Checking(little, 3599.00));

        Client randolph = new Client("Eddie Randolph", "718 East Howard Rd. NY 10977");
        bank.addClient(randolph);
        bank.addAccount(new Checking(randolph, 7146.00));
        bank.addAccount(new Saving(randolph, 9449.00));

        Client walker = new Client("Angela Walker", "9768 Fieldstone Rd. Bronx, NY 10456");
        bank.addClient(walker);
        bank.addAccount(new Checking(walker, 156.00));
        bank.addAccount(new Saving(walker, 3599.00));

        Client shelton = new Client("Lia Shelton", "226 High Noon Ave. Bronx, NY 10463");
        bank.addClient(shelton);
        bank.addAccount(new Checking(shelton, 31356.00));
        bank.addAccount(new Saving(shelton, 353399.00));

        Client hartman = new Client("Hadassah Hartman", "642 Windfall Drive New York NY 11370");
        bank.addClient(hartman);
        bank.addAccount(new Checking(hartman, 21256.00));
        bank.addAccount(new Saving(hartman, 359922.00));

        Client shafer = new Client("Joanna Shaffer", "99 Heritage St. New York, NY 10040");
        bank.addClient(shafer);
        bank.addAccount(new Checking(shafer, 16.00));

        Client sheppard = new Client("Jonathon Sheppard", "7 Cactus Ave. New York, NY 12550");
        bank.addClient(sheppard);
        bank.addAccount(new Checking(sheppard, 56.00));
        bank.addAccount(new Saving(sheppard, 99.00));


        bank.printAllCustomers();

    }
}
