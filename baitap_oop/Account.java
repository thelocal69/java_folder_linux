package baitap_oop;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Account {
	private final float interestRate = 0.035f;
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

	public double rechargeMoney(double add) {
		return getBalance() + add;
	}

	public double withdraw(double withdraw) {
		return this.balance - (withdraw + 500.0);
	}

	public double sendM(double sendM) {
		return this.balance - (sendM);
	}

	public double expired() {
		return this.balance + (this.balance * this.interestRate);
	}

	public void rechargeMoneyA() {
		System.out.println("Input number of money: ");
		double addMoney = Double.parseDouble(getSCANNER().nextLine());
		if (rechargeMoney(addMoney) < 100)
			System.out.println(
					"Money is invalid ! recharge money is greater than or equal: " + getDongFormat().format(100));
		else
			System.out.println("Success ! balance is: " + getDongFormat().format(rechargeMoney(addMoney)));
	}

	public void withdrawal() {
		System.out.println("Input number of money: ");
		double withdraw = Double.parseDouble(getSCANNER().nextLine());
		if (withdraw > this.balance || withdraw < 50000.0)
			System.out.println("Invalid ! account balance not enough to withdrawal !");
		else
			System.out.println("Balance is :" + getDongFormat().format(withdraw(withdraw)) + " number cash withdraw is "
					+ getDongFormat().format(withdraw));

	}

	public void sendMoney() {
		System.out.println("Input account number you want send: ");
		String accountOrder = getSCANNER().nextLine();
		System.out.println("Input number of money: ");
		double sendMoney = Double.parseDouble(getSCANNER().nextLine());
		if (sendMoney > this.balance || sendMoney < 100)
			System.out.println("Invalid ! account balance not enough to send !");
		else
			System.out.println("Balance is :" + getDongFormat().format(sendM(sendMoney)) + " number cash send is "
					+ getDongFormat().format(sendMoney));
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

	public float getInterestRate() {
		return interestRate;
	}

	@Override
	public String toString() {
//		"Account ABCBank [ "+ "Account Number: " + accountNumber + ", Account Name: "
//				+ accountName + ", Balane: " + getDong().getDisplayName()+" "+ getDongFormat().format(getBalance()) + " ]";
		return String.format("Account Number: %-15s Account Name: %-15s Balance: %-5s %-5s", accountNumber,
				accountName, getDongFormat().format(getBalance()), getDong().getDisplayName());
	}

}
