package com.decabank.bank.services.Implementation;

import com.decabank.bank.model.Customer;
import com.decabank.bank.model.Marketer;
import com.decabank.bank.services.MarketerService;

public class MarketerServiceImp implements MarketerService {
    @Override
    public String openAccountForCustomer(Marketer marketer, Customer customer) {
        //
        if (customer.getAge() > 18){
            // for marketer to generate account number for customer registers
            Long customerAccountNumber = (long)Math.floor(Math.random()*9_000_000_000L) + 1_000_000_000L;

            return  ("Hello, " + customer.getName() + " You Decabank account Number is: " + customerAccountNumber + "\n");
        }else {
            return ("Hi," + customer.getName() + "Fill out the necessary for and you account will be open\nThanks for banking with us!!");
        }
    }
}
