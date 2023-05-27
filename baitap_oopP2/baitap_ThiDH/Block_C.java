package baitap_ThiDH;

public class Block_C extends Candidate{

	public Block_C(int iD, String fullName, String address, String priority) {
		super(iD, fullName, address, priority);
	}
	
	public String getLite() {
		return "Literature";
	}

	public String getHisto() {
		return "History";
	}

	public String getGeo() {
		return "Geographic";
	}

	@Override
	public String toString() {
		System.out.format("%-15s %-10s %-15s %-10s %-10s %-15s %-15s %-15s%n", "Exam block", "ID", "Full name", "Address",
				"Priority", "Subject 1", "Subject 2", "Subject 3");
		return String.format("%-15s %-10d %-15s %-10s %-10s %-15s %-15s %-15s%n", "Block C", getiD(), getFullName(),
				getAddress(), getPriority(), getLite(), getHisto(), getGeo());
	}
}
