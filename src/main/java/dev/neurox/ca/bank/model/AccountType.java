package dev.neurox.ca.bank.model;

public enum AccountType {

    CHECKING("ch"),
    SAVINGS("sa")
    ;

    String code;

    AccountType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
