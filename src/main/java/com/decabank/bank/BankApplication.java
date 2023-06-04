package com.decabank.bank;

import com.decabank.bank.model.*;
import com.decabank.bank.services.Implementation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		Customer customer = new Customer("Wajiu","ETP",24,3000L,2000L,true,100,200L);
		Cashier cashier = new Cashier("Omolola","Edo",22,true,true);
		CustomerServiceImp customerServiceImp =new CustomerServiceImp();
		customerServiceImp.customerTransaction(customer,cashier);
		customerServiceImp.customerWithdrawer(customer,cashier);


		CashierServiceImp cashierServiceImp = new CashierServiceImp();

		cashierServiceImp.creditCustomer(cashier,customer,8986509845l);
		cashierServiceImp.debitCustomer(customer,cashier,500);

		Manager manager1= new Manager("Wajiu","ETP",24,false);
		ManagerServiceImp managerServiceImp = new ManagerServiceImp();
		managerServiceImp.hireStaff(manager1);

		Marketer marketer = new Marketer("Mr Zurum", "Lagos", 35);
		MarketerServiceImp marketerServiceImp = new MarketerServiceImp();
		marketerServiceImp.openAccountForCustomer(marketer,customer);
		System.out.println(marketerServiceImp.openAccountForCustomer(marketer, customer));


		Applicants applicants = new Applicants("Samuel Adeyeye", "0908734653", "Lagos ","Bsc in computer science ", 11,3);
		Applicants applicants1 = new Applicants("Jideofo Adeogun", "09093454644","Ondo","HND",12,3);
		Applicants applicants2 = new Applicants("Bolajide Kemi", "0804566376327","Delta","Bsc",15,1);

		ApplicantServiceImp applicantServiceImp = new ApplicantServiceImp();
		applicantServiceImp.addApplicants(applicants,manager1);
		applicantServiceImp.addApplicants(applicants1, manager1);
		applicantServiceImp.addApplicants(applicants2, manager1);


		String hired = applicantServiceImp.hireApplicants(applicants, manager1);
		String hired1 = applicantServiceImp.hireApplicants(applicants1, manager1);
		String hired2 = applicantServiceImp.hireApplicants(applicants2, manager1);

		System.out.println(hired);
		System.out.println(hired1);
		System.out.println(hired2);


		Transaction transaction = new Transaction("1234",2000);
		TransactionServiceImp transactionServiceImp = new TransactionServiceImp();
		String transferMoney = transactionServiceImp.transferMoney(customer, transaction);
		System.out.println(transferMoney);

		String buyAirtime = transactionServiceImp.buyAirtimes(customer,"09039156872", 500);
		System.out.println(buyAirtime);
	}

}
