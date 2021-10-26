package dev.neurox.ca.bank;

import dev.neurox.ca.bank.model.Account;
import dev.neurox.ca.bank.model.Client;

import java.util.ArrayList;
import java.util.List;

public class BankHelper {

    public static boolean isUsernameValid(String username, List<Client> clients) {
        if (username != null && !username.equals("")) {
            for (Client client : clients) {
                if (username.equals(client.getLoginCredentials().getUsername())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.getAmount() < amount) {
            System.out.println("NSF in from account to transfer money");
            return false;
        }
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
        return true;
    }

    public static Client findClientByUsername(String username, ArrayList<Client> clients){
        for (Client client : clients) {
            if (client.getLoginCredentials().getUsername().equals(username)) {
                return client;
            }
        }
        return null;
    }


}
