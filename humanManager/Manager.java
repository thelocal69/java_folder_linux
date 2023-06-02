package humanManager;

public class Manager extends HumanResource {
	private final double SALARY_PER_DAY = 200;
	private final String POSITION = "manager";
	private int m_nNumberOfMember;

	@Override
	public double formulaSalary() {
		m_dSalaryMonth = this.SALARY_PER_DAY * m_nNumberOfWork + (100000 * this.m_nNumberOfMember);
		return m_dSalaryMonth;
	}

	@Override
	public void input() {
		super.input();
	}

	public String getPOSITION() {
		return POSITION;
	}

	public int getNumberOfMember() {
		return m_nNumberOfMember;
	}

	public void setNumberOfMember(int numberOfEmployer) {
		this.m_nNumberOfMember = numberOfEmployer;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + " Position: " + getPOSITION() + " Full name: " + getName() + " Mobile phone: "
				+ getMobile() + " number of work: " + getNumberOfWork() + " Salary: "
				+ getDollarFormat().format(formulaSalary()) + " " + getCurrency().getDisplayName()
				+ " number of employer " + getNumberOfMember() + " member";
	}

}
