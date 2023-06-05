package baitap_ThiDH;

public class Block_B extends Candidate{
	
	
	
	@Override
	public void inputCandidate() {
		super.inputCandidate();
	}

	public String getMath() {
		return "Mathemastic";
	}

	public String getChemical() {
		return "Chemical";
	}
	
	public String getBio() {
		return "Biology";
	}

	@Override
	public String toString() {
		System.out.format("%-15s %-10s %-15s %-10s %-10s %-15s %-15s %-15s%n", "Exam block", "ID", "Full name", "Address",
				"Priority", "Subject 1", "Subject 2", "Subject 3");
		return String.format("%-15s %-10d %-15s %-10s %-10s %-15s %-15s %-15s%n", "Block B", getiD(), getFullName(),
				getAddress(), getPriority(), getMath(), getChemical() ,getBio());
	}
}
