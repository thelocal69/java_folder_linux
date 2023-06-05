package baitap_CanBo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service implements Feature_OfficerManager {
	private List<Officer> listOfficers;

	public Service() {
		listOfficers = new ArrayList<>();
	}

	// show
	@Override
	public void showOfficer() {
		for (Officer officer : listOfficers) {
			System.out.println(officer.toString());
		}
	}

	// find
	@Override
	public void findOfficerByNameRelative(String nameOfficer) {
		for (Officer officer : listOfficers) {
			if (officer.getFullName().contains(nameOfficer)) {
				System.out.println(officer.toString());
				return;
			}
		}
		System.out.println("Not found !");
	}

	@Override
	public void findOfficerByNameAbsolute(String nameOfficer) {
		for (Officer officer : listOfficers) {
			if (officer.getFullName().equals(nameOfficer)) {
				System.out.println(officer.toString());
				return;
			}
		}
		System.out.println("Not found !");
	}
	// end find

	// delete
	@Override
	public void deleteOfficerByNameAndAge(String nameOfficer, int age) {
		for (Officer officer : listOfficers) {
			if (officer.getFullName().equals(nameOfficer) && officer.getAge() == age) {
				listOfficers.remove(officer);
				System.out.println("Delete officer success !");
				return;
			}
		}
		System.out.println("Not found !");
	}

	// add
	@Override
	public void addOfficer() {
		Officer officer = officerType();
		officer.inputOfficer();
		listOfficers.add(officer);
		System.out.println("Add officer success !");
	}

	// type officer
	public Officer officerType() {
		showSubMenu();
		int choose = getScanner().nextInt();
		switch (choose) {
		case 1:
			return new Engineer();

		case 2:
			return new Worker();

		case 3:
			return new Employer();

		default:
			return new Officer();
		}
	}

	public void showSubMenu() {
		System.out.println("1. Add Engineer");
		System.out.println("2. Add Worker");
		System.out.println("3. Add Employer");
		System.out.println("Please choose");
	}

	private Scanner getScanner() {
		Scanner SCANNER = new Scanner(System.in);
		return SCANNER;
	}

}
