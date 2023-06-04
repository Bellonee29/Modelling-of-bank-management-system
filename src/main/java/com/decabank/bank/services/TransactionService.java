package com.decabank.bank.services;

import com.decabank.bank.model.Customer;
import com.decabank.bank.model.Transaction;

public interface TransactionService {
    String transferMoney(Customer customer, Transaction transaction);
    String buyAirtimes(Customer customer, String phoneNumber,Integer amount);
}
