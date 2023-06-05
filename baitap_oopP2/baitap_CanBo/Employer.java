package baitap_CanBo;

public class Employer extends Officer {
	private String job;

	public String inputJob() {
		System.out.println("Input job: ");
		return this.job = getScanner().nextLine();
	}

	@Override
	public void inputOfficer() {
		super.inputOfficer();
		inputJob();
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		System.out.format("%-15s %-15s %-5s %-5s %-10s %-5s%n", "Officer", "Full Name", "Age", "Gender", "Address",
				"Job");
		return String.format("%-15s %-15s %-5s %-5s %-10s %-5s%n", "Employer", getFullName(), getAge(), getGender(),
				getAddress(), getJob());
	}

}
