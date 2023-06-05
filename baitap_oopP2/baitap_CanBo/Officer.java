package baitap_CanBo;

import java.util.Scanner;

public class Officer {
	protected String fullName;
	protected int age;
	protected String gender;
	protected String address;

	public String inputName() {
		System.out.println("Input full name: ");
		return this.fullName = getScanner().nextLine();
	}

	public int inputAge() {
		while (true) {
			try {
				System.out.println("Input age: ");
				this.age = Integer.parseInt(getScanner().nextLine());
				if (age < 18 || age > 71)
					throw new NumberFormatException();
				return age;
			} catch (NumberFormatException e) {
				System.out.println("Invalid ! try again");
			}
		}
	}

	public String inputGender() {
		System.out.println("Input gender: ");
		return this.gender = getScanner().nextLine();
	}

	public String inputAddress() {
		System.out.println("Input address: ");
		return this.address = getScanner().nextLine();
	}

	public void inputOfficer() {
		inputName();
		inputAge();
		inputGender();
		inputAddress();
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Scanner getScanner() {
		Scanner SCANNER = new Scanner(System.in);
		return SCANNER;
	}
}
