package com.decabank.bank.model;

public class Cashier extends BaseClass{

    private Boolean debitCustomer;
    private Boolean credit;

    public Cashier(String name, String address, Integer age,Boolean debitCustomer,Boolean credit) {
        super(name, address, age);
        this.debitCustomer = debitCustomer;
        this.credit = credit;
    }

    public Boolean isDebitCustomer() {
        return debitCustomer;
    }

    public void setDebitCustomer(Boolean debitCustomer) {
        this.debitCustomer = debitCustomer;
    }

    public Boolean isCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "depositStatus=" + debitCustomer +
                ", credit=" + credit +
                '}';
    }
}
