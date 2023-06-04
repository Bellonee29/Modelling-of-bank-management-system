package com.decabank.bank.services;

import com.decabank.bank.model.Cashier;
import com.decabank.bank.model.Customer;
import com.decabank.bank.model.Transaction;

public interface CustomerService {
    Long customerTransaction( Customer customer, Cashier cashier);
    Long customerWithdrawer(Customer customer, Cashier cashier);

}
