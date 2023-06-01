package humanManager;

public class Manager extends Company {
	private int numberOfEmployer;
	
	public Manager() {}

	public Manager(int id, String name, String mobile, int numberOfWork, int salaryPerDay) {
		super(id, name, mobile, numberOfWork, salaryPerDay);
		this.numberOfEmployer = 0;
	}

	@Override
	public double formulaSalary() {
		double salary;
		salary = this.salaryPerDay * this.numberOfWork + (100000 * this.numberOfEmployer);
		return salary;
	}

	@Override
	public void input() {
		super.input();
	}

	public int getNumberOfEmployer() {
		return numberOfEmployer;
	}

	public void setNumberOfEmployer(int numberOfEmployer) {
		this.numberOfEmployer = numberOfEmployer;
	}
	
	@Override
	public String toString() {
		return "ID: " + getId() + " Manager Name: " + getName() + " Mobile phone: " + getMobile() + " number of work: "
				+ getNumberOfWork() + " Salary: " + getDongFormat().format(formulaSalary()) + ""
				+ getCurrency().getDisplayName() + "number of employer " + getNumberOfEmployer() + "EmP";
	}

}
