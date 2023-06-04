package com.decabank.bank.model;

public class Customer extends BaseClass{
    private Long deposit;
    private Long accountBalance;
    private Boolean buyAirtime;
    private Long withdrawer;
    private Integer buyAirtimeAmount;

    public Customer(String name, String address, Integer age, Long deposit, Long accountBalance, Boolean buyAirtime, Integer buyAirtimeAmount,Long withdrawer) {
        super(name, address, age);
        this.deposit = deposit;
        this.accountBalance = accountBalance;
        this.buyAirtime = buyAirtime;
        this.buyAirtimeAmount = buyAirtimeAmount;
        this.withdrawer = withdrawer;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean isBuyAirtime() {
        return buyAirtime;
    }

    public void setBuyAirtime(boolean buyAirtime) {
        this.buyAirtime = buyAirtime;
    }

    public long getWithdrawer() {
        return withdrawer;
    }

    public void setWithdrawer(long withdrawer) {
        this.withdrawer = withdrawer;
    }

    public int getBuyAirtimeAmount() {
        return buyAirtimeAmount;
    }

    public void setBuyAirtimeAmount(int buyAirtimeAmount) {
        this.buyAirtimeAmount = buyAirtimeAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "deposit=" + deposit +
                ", accountBalance=" + accountBalance +
                ", buyAirtime=" + buyAirtime +
                ", withdrawer=" + withdrawer +
                ", buyAirtimeAmount=" + buyAirtimeAmount +
                '}';
    }
}
