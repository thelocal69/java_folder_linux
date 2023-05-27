package baitap_ThiDH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdmissionsManager implements Feature_Admissions {
	private List<Candidate> listCandidates;

	public AdmissionsManager() {
		listCandidates = new ArrayList<>();
	}

	// add
	public void addBlockA() {
		int id = inputID();
		String name = inputName();
		String address = inputAddress();
		String priority = inputPriority();

		Candidate candidate = new Block_A(id, name, address, priority);
		listCandidates.add(candidate);
	}
	
	public void addBlockB() {
		int id = inputID();
		String name = inputName();
		String address = inputAddress();
		String priority = inputPriority();

		Candidate candidate = new Block_B(id, name, address, priority);
		listCandidates.add(candidate);
	}
	
	public void addBlockC() {
		int id = inputID();
		String name = inputName();
		String address = inputAddress();
		String priority = inputPriority();

		Candidate candidate = new Block_C(id, name, address, priority);
		listCandidates.add(candidate);
	}

	// find
	@Override
	public void findCandidateByID(int id) {
		Candidate candidate = null;
		int size = listCandidates.size();
		for (int i = 0; i < size; i++) {
			if (listCandidates.get(i).getiD() == id) {
				candidate = listCandidates.get(i);
				break;
			}
		}
		if (candidate != null)
			System.out.println(candidate.toString());
		else
			System.out.println("Not found ! try again");
	}

	// show
	@Override
	public void showCandidate() {
		for (Candidate candidate : listCandidates) {
			System.out.println(candidate.toString());
		}
	}

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
		int choose;
		int input;
		while (true) {
			showMenu();
			choose = getScanner().nextInt();
			switch (choose) {

			case 1:
				int type;
				subMenu();
				type = getScanner().nextInt();
				switch (type) {
				
				case 1:
					addBlockA();
					break;

				case 2:
					addBlockB();
					break;

				case 3:
					addBlockC();
					break;

				case 0:
					break;

				default:
					System.out.println("Invalid ! try again");
					break;
				}
				break;

			case 2:
				input = input();
				findCandidateByID(input);
				break;

			case 3:
				showCandidate();
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

	private String inputPriority() {
		System.out.println("Input Priority: ");
		return getScanner().nextLine();
	}

	private String inputAddress() {
		System.out.println("Input address: ");
		return getScanner().nextLine();
	}

	private String inputName() {
		System.out.println("Input full name: ");
		return getScanner().nextLine();
	}

	private int inputID() {
		System.out.println("Input ID Number: ");
		while (true) {
			try {
				int id = Integer.parseInt(getScanner().nextLine());
				if (id <= 0)
					throw new NumberFormatException();
				return id;
			} catch (NumberFormatException e) {
				System.out.println("Invalid ! try again");
			}
		}
	}

	public Scanner getScanner() {
		return new Scanner(System.in);
	}

	public int input() {
		System.out.println("Input ID candidate: ");
		return getScanner().nextInt();
	}

}
