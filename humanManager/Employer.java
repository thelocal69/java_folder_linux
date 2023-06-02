package humanManager;

import java.util.Scanner;

public class Employer extends HumanResource {
	private final double SALARY_PER_DAY = 100;
	private final String POSITION = "member";
	private String m_strManagerName;

	public String getPOSITION() {
		return POSITION;
	}

	public String getManagerName() {
		return m_strManagerName;
	}

	public void setManagerName(String manager) {
		this.m_strManagerName = manager;
	}

	public void inputManagerName() {
		System.out.println("Input Manager Name: ");
		this.m_strManagerName = getScanner().nextLine();
	}

	@Override
	public double formulaSalary() {
		m_dSalaryMonth = this.SALARY_PER_DAY * m_nNumberOfWork;
		return m_dSalaryMonth;
	}

	@Override
	public void input() {
		super.input();
		inputManagerName();
	}

	@Override
	public String toString() {
		return "ID: " + getId() + " Position: " + getPOSITION() + " Full name: " + getName() + " Mobile phone: "
				+ getMobile() + " number of work: " + getNumberOfWork() + " Salary: "
				+ getDollarFormat().format(formulaSalary()) + " " + getCurrency().getDisplayName() + " Manager Name: "
				+ getManagerName();
	}

	@Override
	public Scanner getScanner() {
		return super.getScanner();
	}

}
