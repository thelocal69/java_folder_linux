package humanManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Human_manager implements Feature_HumanManger {
	private List<Company> listEmCompanies;

	public Human_manager() {
		this.listEmCompanies = new ArrayList<>();
	}

	@Override
	public void addMember() {
		System.out.println("Director: ");
		addDirector();
		System.out.println("Manager: ");
		addManger();
		System.out.println("Employer: ");
		addEmployer();
	}
	
	public void addDirector() {
		Company director = new Director();
		director.input();
		listEmCompanies.add(director);
	}
	
	public void addManger() {
		Company manager = new Manager();
		manager.input();
		listEmCompanies.add(manager);
	}
	
	public void addEmployer() {
		Company employer = new Employer();
		employer.input();
		listEmCompanies.add(employer);
	}

	@Override
	public void deleteMemberById(int id) {
		for (Company company : listEmCompanies) {
			if (company.getId() == id)
				listEmCompanies.remove(company);
			System.out.println("Delete Succes !");
			return;
		}
		System.out.println("Not found !");
//		Company company = null;
//		int size = listEmCompanies.size();
//		for (int i = 0; i < size; i++) {
//			if (listEmCompanies.get(i).getId() == id)
//				company = listEmCompanies.get(i);
//			break;
//		}
//		if(company != null) {
//			listEmCompanies.remove(company);
//			System.out.println("Delete is success !");
//		}else {
//			System.out.println("Not found !");
//		}
	}

	@Override
	public void showAllMem() {
		for (Company company : listEmCompanies) {
			System.out.println(company.toString());
		}
	}

	public void menu() {
		Company company = new Company();
		int choose;
		int id;
		while (true) {
			showMenu();
			choose = getScanner().nextInt();
			switch (choose) {

			case 1:
				company.inpputCompany();
				break;

			case 2:
				addMember();
				break;

			case 3:
				id = getScanner().nextInt();
				deleteMemberById(id);
				break;

			case 4:
				showAllMem();
				break;

			case 0:
				return;

			default:
				System.out.println("In");
				break;
			}
		}

	}

	public void showMenu() {
		System.out.println("1. Input Information company");
		System.out.println("2. Add member company");
		System.out.println("3. Delete member in company");
		System.out.println("4. Show all member");
		System.out.println("0. exit");
	}

	public Scanner getScanner() {
		Scanner SCANNER = new Scanner(System.in);
		return SCANNER;
	}
}