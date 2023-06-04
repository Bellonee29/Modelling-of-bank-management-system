package com.decabank.bank.services;

import com.decabank.bank.model.Customer;
import com.decabank.bank.model.Marketer;

public interface MarketerService {
    String openAccountForCustomer(Marketer marketer, Customer customer);
}
