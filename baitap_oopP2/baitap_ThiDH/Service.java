package baitap_ThiDH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service implements Feature_Admissions{
	private List<Candidate> listCandidates;
	
	public Service() {
		listCandidates = new ArrayList<>();
	}

	//add
	@Override
	public void addCandidate() {
		Candidate candidate = candidateType();
		do {
			candidate.inputId();
		} while (isExist(candidate.getiD()));
		candidate.inputCandidate();
		listCandidates.add(candidate);
		System.out.println("Add candidate success !");
	}

	//find
	@Override
	public void findCandidateByID(int id) {
		for (Candidate candidate : listCandidates) {
			if (candidate.getiD() == id) {
				System.out.println(candidate.toString());
				return;
			}
		}
		System.out.println("Not found !");
	}

	//show
	@Override
	public void showCandidate() {
		for (Candidate candidate : listCandidates) {
			System.out.println(candidate.toString());
		}
	}
	
	//candidate type
	public Candidate candidateType() {
		int choose;
		showSubMenu();
		choose = getScanner().nextInt();
		switch (choose) {
		
		case 1:
			return new Block_A();

		case 2:
			return new Block_B();

		case 3:
			return new Block_C();

		default:
			return new Candidate();
		}
	}
	
	//cannot duplicate id
	public boolean isExist(int id) {
		boolean isSuccess = false;
		for (Candidate candidate : listCandidates) {
			if (candidate.getiD() == id) {
				isSuccess = true;
				System.out.println("This ID is existed ! try another one");
			}
		}
		return isSuccess;
	}
	
	public void showSubMenu() {
		System.out.println("1. Add block A");
		System.out.println("2. Add block B");
		System.out.println("3. Add block C");
		System.out.println("Please choose !");
	}
	
	public Scanner getScanner() {
		Scanner SCANNER = new Scanner(System.in);
		return SCANNER;
	}
}
