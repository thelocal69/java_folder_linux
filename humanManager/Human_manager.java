package humanManager;

import java.util.Scanner;

public class Human_manager{
	private String m_strCompanyName;
	private int m_nTaxCode;
	private double m_dRenuaveMonth;
	
	public void inputCompany() {
		System.out.println("\t\t\tHuman Manager");
		System.out.println("Input company name: ");
		this.m_strCompanyName = getScanner().nextLine();
		System.out.println("Input company tax code number: ");
		this.m_nTaxCode = Integer.parseInt(getScanner().nextLine());
		System.out.println("Input renuave month of company: ");
		this.m_dRenuaveMonth = Double.parseDouble(getScanner().nextLine());
	}
	

	public void menu() {
		Service service = new Service();
		int choose;
		int id;
		inputCompany();
		while (true) {
			showMenu();
			choose = getScanner().nextInt();
			switch (choose) {

			case 1:
				service.addMember();
				break;

			case 2:
				System.out.println("Input ID Member: ");
				id = getScanner().nextInt();
				service.deleteMemberById(id);
				break;

			case 3:
				service.showAllMem();
				break;

			case 0:
				System.out.println("\t\t\tProgram is closed !");
				return;

			default:
				System.out.println("Invalid!");
				break;
			}
		}

	}

	public void showMenu() {
		System.out.println("\t\t\tWellcome to company "+ this.m_strCompanyName);
		System.out.println("2. Add member company");
		System.out.println("3. Delete member in company");
		System.out.println("4. Show all member");
		System.out.println("0. exit");
	}
	
	
	public String getM_strCompanyName() {
		return m_strCompanyName;
	}


	public void setM_strCompanyName(String m_strCompanyName) {
		this.m_strCompanyName = m_strCompanyName;
	}


	public int getM_nTaxCode() {
		return m_nTaxCode;
	}


	public void setM_nTaxCode(int m_nTaxCode) {
		this.m_nTaxCode = m_nTaxCode;
	}


	public double getM_dRenuaveMonth() {
		return m_dRenuaveMonth;
	}


	public void setM_dRenuaveMonth(double m_dRenuaveMonth) {
		this.m_dRenuaveMonth = m_dRenuaveMonth;
	}


	public Scanner getScanner() {
		Scanner SCANNER = new Scanner(System.in);
		return SCANNER;
	}
}