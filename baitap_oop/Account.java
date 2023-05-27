package baitap_oop;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Account {
	private long accountNumber;
	private String accountName;
	private double balance;

	private Scanner SCANNER;
	private Locale vn;
	private Currency dong;
	private NumberFormat dongFormat;

	public Scanner getSCANNER() {
		SCANNER = new Scanner(System.in);
		return SCANNER;
	}

	public Locale getVn() {
		vn = new Locale("vi", "VN");
		return vn;
	}

	public Currency getDong() {
		dong = Currency.getInstance(getVn());
		return dong;
	}

	public NumberFormat getDongFormat() {
		dongFormat = NumberFormat.getCurrencyInstance(getVn());
		return dongFormat;
	}

	public Account() {
	}

	public Account(long accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = 50;
	}

	public Account(long accountNumber, String accountName, double balance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}

	public double moneyRecharge() {
		double recharge;
		System.out.println("Input number of money: ");
		recharge = Double.parseDouble(getSCANNER().nextLine());
		if (recharge < 100)
			System.out.println(
					"Money is invalid ! recharge money is greater than or equal: " + getDongFormat().format(100));
		else {
			this.balance = balance + recharge;
			System.out.println("Success ! " + "you recharge " + getDongFormat().format(recharge) + " balance is: "
					+ getDongFormat().format(this.balance));
		}
		return recharge;
	}

	public double moneyWithdraw() {
		double withdraw;
		double fee = 500.0;
		System.out.println("Input number of money: ");
		withdraw = Double.parseDouble(getSCANNER().nextLine());
		if (withdraw > (this.balance - fee) || withdraw < 50000.0)
			System.out.println("Invalid ! account balance not enough to money withdrawal !");
		else {
			this.balance = balance - (withdraw + fee);
			System.out.println("Success ! balance is :" + getDongFormat().format(this.balance)
					+ " and money withdraw is: " + getDongFormat().format(withdraw));
		}
		return withdraw;
	}

	public double moneyTransfer() {
		double transfer;
		long orderAccount;
		System.out.println("Input account number you want send: ");
		orderAccount = Long.parseLong(getSCANNER().nextLine());
		System.out.println("Input number of money: ");
		transfer = Double.parseDouble(getSCANNER().nextLine());
		if (transfer > this.balance || transfer < 100)
			System.out.println("Invalid ! account balance not enough to money transfer !");
		else
			this.balance = balance - transfer;
			System.out.println("Success ! balance is :" + getDongFormat().format(this.balance)
					+ " and money transfer is: " + getDongFormat().format(transfer));
		return transfer;
	}

	public double accountExpired() {
		double interestRate = 0.035;
		this.balance = balance + (balance * interestRate);
		System.out.println("You just got " + getDongFormat().format(this.balance) + " 1 month due !");
		return this.balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
//		"Account ABCBank [ "+ "Account Number: " + accountNumber + ", Account Name: "
//				+ accountName + ", Balane: " + getDong().getDisplayName()+" "+ getDongFormat().format(getBalance()) + " ]";
		return String.format("Account Number: %-15d Account Name: %-15s Balance: %-5s %-5s", accountNumber, accountName,
				getDongFormat().format(getBalance()), getDong().getDisplayName());
	}

}
