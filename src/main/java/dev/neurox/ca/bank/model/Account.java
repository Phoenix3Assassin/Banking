package dev.neurox.ca.bank.model;

public class Account {

    AccountType accountType;
    double amount;

    public Account(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void withdraw(double amount) {
        if(amount < this.amount)
            this.amount -= amount;
        else {
            System.out.println("Not Sufficient Funds");
        }
    }

    public void deposit(double amount) {
        if(amount > 0)
            this.amount += amount;
        else
            System.out.println("Can't deposit negative funds");
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountType=" + accountType +
                ", amount=" + amount +
                '}';
    }
}
