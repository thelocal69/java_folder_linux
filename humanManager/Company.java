package humanManager;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Company {
	private String companyName;
	private int taxCode;
	private double renevueMonth;
	private int id;
	private String name;
	private String mobile;
	protected int numberOfWork;
	protected int salaryPerDay;

	public Company() {
	}
	
	

	public Company(String companyName, int taxCode, double renevueMonth) {
		this.companyName = companyName;
		this.taxCode = taxCode;
		this.renevueMonth = renevueMonth;
	}


	public Company(int id, String name, String mobile, int numberOfWork, int salaryPerDay) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.numberOfWork = numberOfWork;
		this.salaryPerDay = salaryPerDay;
	}

	public double formulaSalary() {
		return 0;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(int taxCode) {
		this.taxCode = taxCode;
	}

	public double getRenevueMonth() {
		return renevueMonth;
	}

	public void setRenevueMonth(double renevueMonth) {
		this.renevueMonth = renevueMonth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getNumberOfWork() {
		return numberOfWork;
	}

	public void setNumberOfWork(int numberOfWork) {
		this.numberOfWork = numberOfWork;
	}

	public int getSalaryPerDay() {
		return salaryPerDay;
	}

	public void setSalaryPerDay(int salaryPerDay) {
		this.salaryPerDay = salaryPerDay;
	}

	public Locale getLocale() {
		Locale vn = new Locale("vi", "VN");
		return vn;
	}

	public Currency getCurrency() {
		Currency vnd = Currency.getInstance(getLocale());
		return vnd;
	}

	public NumberFormat getDongFormat() {
		NumberFormat dong = NumberFormat.getCurrencyInstance(getLocale());
		return dong;
	}

	public Scanner getScanner() {
		Scanner SCANNER = new Scanner(System.in);
		return SCANNER;
	}
	
	public void inpputCompany() {
		System.out.println("Input company Name: ");
		this.companyName = getScanner().nextLine();
		System.out.println("Input tax code number: ");
		this.taxCode = Integer.parseInt(getScanner().nextLine());
		System.out.println("input renuve Month: ");
		this.renevueMonth = Double.parseDouble(getScanner().nextLine());
		
		setCompanyName(companyName);
		setTaxCode(taxCode);
		setRenevueMonth(renevueMonth);
	}

	public void input() {
		System.out.println("Input ID: ");
		this.id = Integer.parseInt(getScanner().nextLine());
		System.out.println("Input Name: ");
		this.name = getScanner().nextLine();
		System.out.println("Input Phone: ");
		this.mobile = getScanner().nextLine();
		System.out.println("Input Number day of work: ");
		this.numberOfWork = Integer.parseInt(getScanner().nextLine());
		System.out.println("Input Salary per day: ");
		this.salaryPerDay = Integer.parseInt(getScanner().nextLine());
		setId(id);
		setName(name);
		setMobile(mobile);
		setNumberOfWork(numberOfWork);
		setSalaryPerDay(salaryPerDay);
	}

}
