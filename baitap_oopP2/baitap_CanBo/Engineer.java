package baitap_CanBo;

public class Engineer extends Officer {
	private String branch;

	public String inputBranch() {
		System.out.println("Input branch: ");
		return this.branch = getScanner().nextLine();
	}

	@Override
	public void inputOfficer() {
		super.inputOfficer();
		inputBranch();
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		System.out.format("%-15s %-15s %-5s %-5s %-10s %-5s%n", "Officer", "Full Name", "Age", "Gender", "Address",
				"Branch");
		return String.format("%-15s %-15s %-5s %-5s %-10s %-5s%n", "Engineer", getFullName(), getAge(), getGender(),
				getAddress(), getBranch());
	}

}
