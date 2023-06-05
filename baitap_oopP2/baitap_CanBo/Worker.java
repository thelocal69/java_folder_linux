package baitap_CanBo;

public class Worker extends Officer {
	private int level;

	public int inputLevel() {
		while (true) {
			try {
				System.out.println("Input level: ");
				this.level = Integer.parseInt(getScanner().nextLine());
				if (level <= 0 || level > 10)
					throw new NumberFormatException();
				return level;
			} catch (NumberFormatException e) {
				System.out.println("Invalid ! try again");
			}
		}
	}

	@Override
	public void inputOfficer() {
		super.inputOfficer();
		inputLevel();
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		System.out.format("%-15s %-15s %-5s %-5s %-10s %-5s%n", "Officer", "Full Name", "Age", "Gender", "Address",
				"Level");
		return String.format("%-15s %-15s %-5s %-5s %-10s %-5d%n", "Worker", getFullName(), getAge(), getGender(),
				getAddress(), getLevel());
	}

}
