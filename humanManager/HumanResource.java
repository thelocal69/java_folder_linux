package humanManager;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class HumanResource {
	private int m_nID;
	private String m_strName;
	private String m_strMobile;
	protected int m_nNumberOfWork;
	protected double m_dSalaryMonth;

	public double formulaSalary() {
		return m_dSalaryMonth = 0;
	}
	

	public int getId() {
		return m_nID;
	}

	public void setId(int id) {
		this.m_nID = id;
	}

	public String getName() {
		return m_strName;
	}

	public void setName(String name) {
		this.m_strName = name;
	}

	public String getMobile() {
		return m_strMobile;
	}

	public void setMobile(String mobile) {
		this.m_strMobile = mobile;
	}

	public int getNumberOfWork() {
		return m_nNumberOfWork;
	}

	public void setNumberOfWork(int numberOfWork) {
		this.m_nNumberOfWork = numberOfWork;
	}


	public double getM_dSalaryMonth() {
		return m_dSalaryMonth;
	}


	public void setM_dSalaryMonth(double m_dSalaryMonth) {
		this.m_dSalaryMonth = m_dSalaryMonth;
	}


	public Locale getLocale() {
		Locale us = new Locale("en", "US");
		return us;
	}

	public Currency getCurrency() {
		Currency usa = Currency.getInstance(getLocale());
		return usa;
	}

	public NumberFormat getDollarFormat() {
		NumberFormat dollar = NumberFormat.getCurrencyInstance(getLocale());
		return dollar;
	}

	public Scanner getScanner() {
		Scanner SCANNER = new Scanner(System.in);
		return SCANNER;
	}
	

	public void input() {
		System.out.println("Input ID: ");
		this.m_nID = Integer.parseInt(getScanner().nextLine());
		System.out.println("Input Name: ");
		this.m_strName = getScanner().nextLine();
		System.out.println("Input Phone: ");
		this.m_strMobile = getScanner().nextLine();
		System.out.println("Input Number day of work: ");
		this.m_nNumberOfWork = Integer.parseInt(getScanner().nextLine());
	}

}
