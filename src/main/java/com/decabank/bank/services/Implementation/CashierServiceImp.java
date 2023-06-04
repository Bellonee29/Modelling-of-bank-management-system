package com.decabank.bank.services.Implementation;

import com.decabank.bank.model.Cashier;
import com.decabank.bank.model.Customer;
import com.decabank.bank.services.CashierService;

public class CashierServiceImp implements CashierService {
    @Override
    public String debitCustomer(Customer customer, Cashier cashier, Long amount) {
        if (cashier.isDebitCustomer()) {
            Long debitAccount = customer.getAccountBalance() - amount;
            customer.setAccountBalance(debitAccount);

            System.out.println("___________________________________________________________________________________________________");
            return (amount + " was deducted from your balance as maintenance charges" + " your balance is now: " + debitAccount);
        } else {
            System.out.println("___________________________________________________________________________________________________");
            return ("Transaction denied!!!");

        }

    }

    @Override
    public String debitCustomer(Customer customer, Cashier cashier, Integer amount) {
        return null;
    }


    @Override
    public String creditCustomer(Cashier cashier, Customer customer, Long accountNumber) {
        if (cashier.isCredit()){
            Long newAccountBalance = customer.getAccountBalance() + customer.getDeposit();
            customer.setAccountBalance(newAccountBalance);

            //customer.setAccountBalance(customer.getAccountBalance() + customer.getDeposit());
            System.out.println("___________________________________________________________________________________________________");
            System.out.println(customer.getName() + " your account number " + accountNumber + " as been credited with " + customer.getDeposit() + " your new balance is : "+ newAccountBalance);
            System.out.println("___________________________________________________________________________________________________");
        }else {
            System.out.println("___________________________________________________________________________________________________");
            System.out.println(customer.getName() + " no amount input");
            System.out.println("___________________________________________________________________________________________________");
        }
        return null;
    }

    public CashierServiceImp() {
    }

}
