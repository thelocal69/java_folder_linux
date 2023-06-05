package baitap_ThiDH;


public class Block_A extends Candidate {

	
	
	@Override
	public void inputCandidate() {
		super.inputCandidate();
	}

	public String getMath() {
		return "Mathemastic";
	}

	public String getPhysic() {
		return "Physical";
	}

	public String getChemical() {
		return "Chemical";
	}

	@Override
	public String toString() {
		System.out.format("%-15s %-10s %-15s %-10s %-10s %-15s %-15s %-15s%n", "Exam block", "ID", "Full name", "Address",
				"Priority", "Subject 1", "Subject 2", "Subject 3");
		return String.format("%-15s %-10d %-15s %-10s %-10s %-15s %-15s %-15s%n", "Block A", getiD(), getFullName(),
				getAddress(), getPriority(), getMath(), getPhysic(), getChemical());
	}
	
}
