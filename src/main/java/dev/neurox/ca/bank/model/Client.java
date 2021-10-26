package dev.neurox.ca.bank.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String firstName;
    String lastName;
    List<Account> accountList;
    LoginCredentials loginCredentials;

    public Client(String firstName, String lastName, LoginCredentials loginCredentials) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.loginCredentials = loginCredentials;
        this.accountList = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public LoginCredentials getLoginCredentials() {
        return loginCredentials;
    }
}
