package baitap_ThiDH;

public abstract class Candidate {
	protected int iD;
	protected String fullName;
	protected String address;
	protected String priority;

	public Candidate(int iD, String fullName, String address, String priority) {
		this.iD = iD;
		this.fullName = fullName;
		this.address = address;
		this.priority = priority;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

}
