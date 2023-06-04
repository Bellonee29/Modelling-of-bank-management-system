package com.decabank.bank.services.Implementation;

import com.decabank.bank.model.Customer;
import com.decabank.bank.model.Transaction;
import com.decabank.bank.services.TransactionService;

import java.util.Arrays;
import java.util.Objects;

public class TransactionServiceImp implements TransactionService {
    @Override
    public String transferMoney(Customer customer, Transaction transaction) {
        if (customer.getAccountBalance() > transaction.getAmountToTransfer() &&
                Objects.equals(transaction.getTransferPin(), transaction.getTransferPin())){
            return ("you transfer " + transaction.getAmountToTransfer() + " to " + customer.getName() + "\nTransaction was successful");
        }
        return ("please check your transfer pin or " + "Your Account balance is not sufficient");
    }

    @Override
    public String buyAirtimes(Customer customer, String  phoneNumber,Integer amount) {
        if (customer.isBuyAirtime() && customer.getAccountBalance() > amount) {
            return (amount + " airtime purchased was successful to " + phoneNumber);
        }
        return "Your account is insufficient or check the phone number";
    }
}
