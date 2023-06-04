package com.decabank.bank.model;

public class Transaction {
    private String transferPin;
    private Integer amountToTransfer;

    public Transaction(String transferPin, Integer amountToTransfer) {
        this.transferPin = transferPin;
        this.amountToTransfer = amountToTransfer;
    }

    public String getTransferPin() {
        return transferPin;
    }

    public void setTransferPin(String transferPin) {
        this.transferPin = transferPin;
    }

    public Integer getAmountToTransfer() {
        return amountToTransfer;
    }

    public void setAmountToTransfer(Integer amountToTransfer) {
        this.amountToTransfer = amountToTransfer;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "transferPin='" + transferPin + '\'' +
                ", amountToTransfer=" + amountToTransfer +
                '}';
    }
}
