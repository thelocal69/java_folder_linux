package baitap_CanBo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfficerManager implements Feature_OfficerManager {
	private List<Officer> listOfficers;

	public OfficerManager() {
		this.listOfficers = new ArrayList<>();
	}

	// add
	public void addWorker() {
		String name = inputName();
		int age = inputAge();
		String gender = inputGender();
		String address = inputAddress();
		int level = inputLevel();

		Officer officer = new Worker(name, age, gender, address, level);
		listOfficers.add(officer);
	}

	public void addEngineer() {
		String name = inputName();
		int age = inputAge();
		String gender = inputGender();
		String address = inputAddress();
		String branch = inputBranch();

		Officer officer = new Engineer(name, age, gender, address, branch);
		listOfficers.add(officer);
	}

	public void addEmployer() {
		String name = inputName();
		int age = inputAge();
		String gender = inputGender();
		String address = inputAddress();
		String job = inputJob();

		Officer officer = new Employer(name, age, gender, address, job);
		listOfficers.add(officer);
	}

	// find
	@Override
	public void findOfficerByName(String nameOfficer) {
		Officer worker = null;
		int size = listOfficers.size();
		for (int i = 0; i < size; i++) {
			if (listOfficers.get(i).getFullName().contains(nameOfficer)) {
				worker = listOfficers.get(i);
				break;
			}
		}
		if (worker != null) {
			System.out.println(worker.toString());
		} else {
			System.out.println("Not found !");
		}
	}

	// show
	@Override
	public void showOfficer() {
		for (Officer officers : listOfficers) {
			System.out.println(officers.toString());
		}
	}

	// showMenu
	public void showMenu() {
		System.out.println("\t\t\tApplication");
		System.out.println("1. Add Officer");
		System.out.println("2. Find Officer by name");
		System.out.println("3. Show list officer");
		System.out.println("0. Close program");
	}

	// showSubMenu
	public void subMenu() {
		System.out.println("1.Worker");
		System.out.println("2.Engineer");
		System.out.println("3.Employer");
		System.out.println("0. Back");
	}

	// UI
	public void uIManger() {
		int choose;
		String input = "";
		while (true) {
			showMenu();
			choose = getScanner().nextInt();
			switch (choose) {

			case 1:
				subMenu();
				int type;
				type = getScanner().nextInt();
				switch (type) {

				case 1:
					addWorker();
					break;

				case 2:
					addEngineer();
					break;

				case 3:
					addEmployer();
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
				findOfficerByName(input);
				break;

			case 3:
				showOfficer();
				break;

			case 0:
				System.out.println("\t\t\tProgram is closed");
				return;

			default:
				System.out.println("Invalid ! try again");
				break;
			}
		}
	}

	private String inputJob() {
		System.out.println("Input job: ");
		return getScanner().nextLine();
	}

	private int inputAge() {
		System.out.println("Input age: ");
		while (true) {
			try {
				int age = Integer.parseInt(getScanner().nextLine());
				if (age <= 0 || age > 99)
					throw new NumberFormatException();
				return age;
			} catch (NumberFormatException e) {
				System.out.println("Invalid ! try again");
			}

		}
	}

	private String inputBranch() {
		System.out.println("Input branch: ");
		return getScanner().nextLine();
	}

	private int inputLevel() {
		System.out.println("Input level Worker: ");
		while (true) {
			try {
				int level = Integer.parseInt(getScanner().nextLine());
				if (level <= 0 || level > 10)
					throw new NumberFormatException();
				return level;
			} catch (NumberFormatException e) {
				System.out.println("Invalid ! try again");
			}

		}
	}

	private String inputAddress() {
		System.out.println("Input Address: ");
		return getScanner().nextLine();
	}

	private String inputGender() {
		System.out.println("Input gender: ");
		return getScanner().nextLine();
	}

	private String inputName() {
		System.out.println("Input full name");
		return getScanner().nextLine();
	}

	public Scanner getScanner() {
		return setScanner(new Scanner(System.in));
	}

	public Scanner setScanner(Scanner sCAANNER) {
		return sCAANNER;
	}

	public String input() {
		System.out.println("Input name: ");
		return getScanner().nextLine();
	}

}
