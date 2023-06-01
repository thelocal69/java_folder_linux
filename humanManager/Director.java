package humanManager;

public class Director extends Company {
	private double share;
	
	public Director() {
		
	}

	public Director(int id, String name, String mobile, int numberOfWork, int salaryPerDay, double share) {
		super(id, name, mobile, numberOfWork, salaryPerDay);
		this.share = share;
	}

	@Override
	public double formulaSalary() {
		double salary;
		salary = this.numberOfWork * this.salaryPerDay;
		return salary;
	}

	@Override
	public void input() {
		super.input();
		System.out.println("Input number of share: ");
		this.share = Double.parseDouble(getScanner().nextLine());
		setShare(share);
	}

	public double getShare() {
		return share;
	}

	public void setShare(double share) {
		this.share = share;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + " Director Name: " + getName() + " Mobile phone: " + getMobile() + " number of work: "
				+ getNumberOfWork() + " Salary: " + getDongFormat().format(formulaSalary()) + ""
				+ getCurrency().getDisplayName() + "number of share " + getShare() + "%";
	}

}
