package baitap_ThiDH;

import java.util.Scanner;

public class Candidate {
	protected int iD;
	protected String fullName;
	protected String address;
	protected String priority;

	public int inputId() {
		while (true) {
			try {
				System.out.println("Input ID: ");
				this.iD = Integer.parseInt(getScanner().nextLine());
				if (iD < 1)
					throw new NumberFormatException();
				return iD;
			} catch (NumberFormatException e) {
				System.out.println("Invalid ! try again");
			}
		}

	}

	public String inputName() {
		System.out.println("Input name: ");
		return this.fullName = getScanner().nextLine();
	}
	
	public String inputAddress() {
		System.out.println("Input address: ");
		return this.address = getScanner().nextLine();
	}
	
	public String inputPriority() {
		System.out.println("Input priority: ");
		return this.priority = getScanner().nextLine();
	}
	
	public void inputCandidate() {
		inputName();
		inputAddress();
		inputPriority();
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

	public Scanner getScanner() {
		Scanner SCANNER = new Scanner(System.in);
		return SCANNER;
	}
}
