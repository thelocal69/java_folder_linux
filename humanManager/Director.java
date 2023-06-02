package humanManager;

public class Director extends HumanResource {
	private final double SALARY_PER_DAY = 300;
	private final String POSITION = "director";
	private double m_dShare;

	@Override
	public double formulaSalary() {
		m_dSalaryMonth = m_nNumberOfWork * this.SALARY_PER_DAY;
		return m_dSalaryMonth;
	}

	@Override
	public void input() {
		super.input();
		System.out.println("Input number of share: ");
		this.m_dShare = Double.parseDouble(getScanner().nextLine());
	}

	public String getPOSITION() {
		return POSITION;
	}

	public double getShare() {
		return m_dShare;
	}

	public void setShare(double share) {
		this.m_dShare = share;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + " Position: " + getPOSITION() + " Full name: " + getName() + " Mobile phone: "
				+ getMobile() + " number of work: " + getNumberOfWork() + " Salary: "
				+ getDollarFormat().format(formulaSalary()) + " " + getCurrency().getDisplayName() + " number of share "
				+ getShare() + "%";
	}

}
