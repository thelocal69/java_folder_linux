package humanManager;

public class Employer extends Company {

	private Manager manager;
	
	public Employer() {}

	public Employer(int id, String name, String mobile, int numberOfWork, int salaryPerDay) {
		super(id, name, mobile, numberOfWork, salaryPerDay);
		this.manager = null;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public double formulaSalary() {
		double salary;
		salary = this.salaryPerDay * this.numberOfWork;
		return salary;
	}
	
	@Override
	public void input() {
		super.input();
	}

	@Override
	public String toString() {
		return "ID: " + getId() + " Director Name: " + getName() + " Mobile phone: " + getMobile() + " number of work: "
				+ getNumberOfWork() + " Salary: " + getDongFormat().format(formulaSalary()) + ""
				+ getCurrency().getDisplayName();
	}

}
