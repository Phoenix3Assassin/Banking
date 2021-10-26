package dev.neurox.ca.bank;

import dev.neurox.ca.bank.model.Account;
import dev.neurox.ca.bank.model.AccountType;
import dev.neurox.ca.bank.model.Client;
import dev.neurox.ca.bank.model.LoginCredentials;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void main(String[] args) {
        testAccount();
        testHelper();
    }

    public static void testHelper() {
        List<Client> clients = new ArrayList<>();
        System.out.println(BankHelper.isUsernameValid("wasim", clients));
        clients.add(new Client("wasim", "Nasser",
                new LoginCredentials("wasim", "123")));
        System.out.println(BankHelper.isUsernameValid("wasim", clients));
        System.out.println(BankHelper.isUsernameValid("phoenix", clients));
    }


    public static void testAccount() {
        Account account = new Account(AccountType.CHECKING);
        System.out.println(account);
        account.withdraw(100.2);
        account.deposit(-1.2);
        System.out.println(account);
        account.deposit(100.30);
        System.out.println(account);
        account.withdraw(.30);
        System.out.println(account);
    }
}
