package com.shyam.designpattern.abstractfactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.shyam.designpattern.abstractfactory.AbstractFactory;
import com.shyam.designpattern.abstractfactory.Bank;
import com.shyam.designpattern.abstractfactory.BankFactory;
import com.shyam.designpattern.abstractfactory.FactoryCreator;
import com.shyam.designpattern.abstractfactory.Loan;

public class MainProgram {

	public static void main(String args[]) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the name of the bank where you want to take loan amount: ");
			String bankName = br.readLine();

			System.out.print("\nEnter the type of loan you want to avail e.g. home, business or education loan: ");
			String loanType = br.readLine();

			AbstractFactory bankFactory = FactoryCreator.getFactory("BANK");
			Bank bank = bankFactory.getBank(bankName);

			System.out.println("Enter the interest rate for " + bank.getBankName() + "bank: ");

			double rate = Double.parseDouble(br.readLine());
			System.out.println("Enter the loan amount you want to take: ");

			double loanamount = Double.parseDouble(br.readLine());
			System.out.println("Enter the number of years to pay the entire loan amount: ");
			int years = Integer.parseInt(br.readLine());

			System.out.println("You are taking loan from bank: " + bankName);

			AbstractFactory abstractFactory = FactoryCreator.getFactory("LOAN");

			Loan loan = abstractFactory.getLoan(loanType);
			loan.getInterestRate(rate);
			loan.calculateLoanPayment(loanamount, years);

		} catch (IOException ex) {

		}

	}

}
