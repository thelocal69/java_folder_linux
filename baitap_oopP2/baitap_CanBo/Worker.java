package baitap_CanBo;

public class Worker extends Officer {
	private int level;

	public Worker(String fullName, int age, String gender, String address, int level) {
		super(fullName, age, gender, address);
		this.level = level;
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
		return String.format("%-15s %-15s %-5s %-5s %-10s %-5d%n","Worker" ,getFullName(), getAge(), getGender(), getAddress(),
				level);
	}

}
