package humanManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service implements Feature_HumanManger {
	List<HumanResource> m_listHumanResources;

	public Service() {
		this.m_listHumanResources = new ArrayList<>();
	}

	@Override
	public void addMember() {
		int i = 0;
		int choose;
		subMenu();
			choose = getScanner().nextInt();
			switch (choose) {
			
			case 1:
				HumanResource director = new Director();
				m_listHumanResources.add(director);
				director.input();
				break;

			case 2:
				HumanResource manager = new Manager();
				m_listHumanResources.add(manager);
				manager.input();
				break;

			case 3:
				HumanResource employer = new Employer();
				m_listHumanResources.add(employer);
				employer.input();
				break;

			default:
				System.out.println("Invalid!");
				break;
			}
	}

	@Override
	public void deleteMemberById(int id) {
		for (HumanResource humanResource : m_listHumanResources) {
			if(humanResource.getId() == id) {
				m_listHumanResources.remove(humanResource);
				System.out.println("Delete success !");
				return;
			}
				
		}
		System.out.println("Not found !");
	}

	@Override
	public void showAllMem() {
		for (HumanResource humanResource : m_listHumanResources) {
			System.out.println(humanResource.toString());
		}
	}
	
	public void subMenu() {
		System.out.println("\t\t\tPosition in company");
		System.out.println("1. Director");
		System.out.println("2. Manager");
		System.out.println("3. Employer");
		System.out.println("Please choose !");
	}
	
	public Scanner getScanner() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}
}
