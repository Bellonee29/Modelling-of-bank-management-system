package com.decabank.bank.model;

public class Account {
    private Long amount;
    private String accountType;

    public Account(Long amount, String accountType) {
        this.amount = amount;
        this.accountType = accountType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
