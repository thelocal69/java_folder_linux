package baitap_ThiDH;

import java.util.Scanner;

public class AdmissionsManager{
	
	// ui
	public void showMenu() {
		System.out.println();
		System.out.println("\t\t\tApplication");
		System.out.println("1. Add candidate");
		System.out.println("2. Find candidate by ID");
		System.out.println("3. Show candidate");
		System.out.println("0. close program");
	}

	public void subMenu() {
		System.out.println("1. Block A");
		System.out.println("2. Block B");
		System.out.println("3. Block C");
		System.out.println("0. back");
	}

	public void uIManager() {
		Service service = new Service();
		int choose;
		int input;
		while (true) {
			showMenu();
			choose = getScanner().nextInt();
			switch (choose) {

			case 1:
				service.addCandidate();
				break;

			case 2:
				input = input();
				service.findCandidateByID(input);
				break;

			case 3:
				service.showCandidate();
				break;

			case 0:
				System.out.println("\t\t\tProgram is closed !");
				return;

			default:
				System.out.println("Invalid ! try again");
				break;
			}
		}

	}

	public Scanner getScanner() {
		Scanner SCANNER = new Scanner(System.in);
		return SCANNER;
	}

	private int input() {
		System.out.println("Input ID candidate: ");
		return getScanner().nextInt();
	}

}
