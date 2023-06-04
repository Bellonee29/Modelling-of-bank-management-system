package com.decabank.bank.services.Implementation;

import com.decabank.bank.model.Cashier;
import com.decabank.bank.model.Customer;
import com.decabank.bank.services.CustomerService;

public class CustomerServiceImp implements CustomerService {
    Long creditCustomer;
    @Override
    public Long customerTransaction( Customer customer, Cashier cashier) {
        if (cashier.isCredit()){
            creditCustomer = customer.getDeposit() + customer.getAccountBalance();
            System.out.println("___________________________________________________________________________________________________");
            System.out.println("Credit alert ");
            System.out.println(customer.getName() + " your deposit of "+ customer.getDeposit() + " was successful" + " your balance is now: " + creditCustomer);
            System.out.println("___________________________________________________________________________________________________");
        }
        return 0L;
    }

    @Override
    public Long customerWithdrawer(Customer customer, Cashier cashier) {
        Long withdrawBalance = creditCustomer - customer.getWithdrawer();
        customer.setAccountBalance(withdrawBalance);
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("Service charges");
        System.out.println("You have been debit " + customer.getWithdrawer() + " your balance is : "+ withdrawBalance);
        System.out.println("___________________________________________________________________________________________________");
        return null;
    }
}
