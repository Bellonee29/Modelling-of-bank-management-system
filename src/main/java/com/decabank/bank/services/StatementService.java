package com.decabank.bank.services;

import com.decabank.bank.model.Cashier;
import com.decabank.bank.model.Customer;

public interface StatementService {
    String miniStatement(Customer customer, Cashier cashier);
}
