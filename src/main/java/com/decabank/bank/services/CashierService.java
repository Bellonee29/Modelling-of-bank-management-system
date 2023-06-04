package com.decabank.bank.services;

import com.decabank.bank.model.Cashier;
import com.decabank.bank.model.Customer;

public interface CashierService {
    String debitCustomer(Customer customer, Cashier cashier,Long amount);

    String debitCustomer(Customer customer, Cashier cashier, Integer amount);

    String creditCustomer(Cashier cashier, Customer customer, Long accountNumber);

}
