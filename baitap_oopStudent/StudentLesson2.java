package baitap_oopStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentLesson2 {
	private String name;
	private String id;
	private double math;
	private double physic;
	private double chemical;
	private double avarage;

	// ko co DAO
	private List<StudentLesson2> listStudent;

	public StudentLesson2() {
		listStudent = new ArrayList<>();
	}

	public StudentLesson2(String name, String id, double math, double physic, double chemical, double avarage) {
		this.name = name;
		this.id = id;
		this.math = math;
		this.physic = physic;
		this.chemical = chemical;
		this.avarage = avarage;
	}

	public Scanner getScanner() {
		return setSCANNER(new Scanner(System.in));
	}

	public double avarage() {
		this.avarage = (this.math + this.physic + this.chemical) / 3;
		return avarage;
	}

	public String classification() {
		if (avarage() >= 9)
			return "Exelent";
		else if (avarage() >= 8)
			return "Great";
		else if (avarage() >= 7)
			return "Good";
		else if (avarage() >= 5)
			return "Average";
		else
			return "Bad";
	}

	//add student
	public void add() {
		String name = inputName();
		String id = inputId();
		double math = inputMath();
		double physic = inputPhysic();
		double chemical = inputChemical();
		double avarage = avarage();

		StudentLesson2 studentLesson2 = new StudentLesson2(name, id, math, physic, chemical, avarage);
		listStudent.add(studentLesson2);
		System.out.println("Student is added !");
	}

	//show
	public void showAverage() {
		double max = this.avarage;
		String name = this.name;
		int size = listStudent.size();
		for (int i = 0; i < size; i++) {
			if (max < listStudent.get(i).avarage) {
				max = listStudent.get(i).avarage;
				name = listStudent.get(i).name;
			}
		}
		System.out.printf("Student %s have GPA greater is : %.1f", name, max);
	}

	public void showListStudentBad() {
		System.out.format("%-20s %-15s %-10s %-10s %-10s %-10s %-15s%n", "Full Name", "ID", "Math", "Physics",
				"Chemical", "GPA", "Classification");
		listStudent.stream().filter(s -> s.avarage < 5).forEach(s -> System.out.println(s.toString()));
	}
	
	public void showStudent() {
		System.out.format("%-20s %-15s %-10s %-10s %-10s %-10s %-15s%n", "Full Name", "ID", "Math", "Physics",
				"Chemical", "GPA", "Classification");
		for (StudentLesson2 studentLesson2 : listStudent) {
			System.out.println(studentLesson2.toString());
		}
	}
	
	//find
	public void findStudentByName(String name) {
		StudentLesson2 studentLesson2 = null;
		int size = listStudent.size();
		for (int i = 0; i < size; i++) {
			if (listStudent.get(i).name.contains(name)) {
				studentLesson2 = listStudent.get(i);
				break;
			}
		}
		if (studentLesson2 == null)
			System.out.println(name + " No information, try again !");
		else
			System.out.format("%-20s %-15s %-10s %-10s %-10s %-10s %-15s%n", "Full Name", "ID", "Math", "Physics",
					"Chemical", "GPA", "Classification");
		System.out.println(studentLesson2);
	}

	public void findStudentByID(String id) {
		StudentLesson2 studentLesson2 = null;
		int size = listStudent.size();
		for (int i = 0; i < size; i++) {
			if (listStudent.get(i).id.equals(id)) {
				studentLesson2 = listStudent.get(i);
				break;
			}
		}
		if (studentLesson2 == null)
			System.out.println(id + " No information, try again !");
		else
			System.out.format("%-20s %-15s %-10s %-10s %-10s %-10s %-15s%n", "Full Name", "ID", "Math", "Physics",
					"Chemical", "GPA", "Classification");
		System.out.println(studentLesson2);
	}

	//deletes
	public void deleteStudentById(String id) {
		StudentLesson2 studentLesson2 = null;
		int size = listStudent.size();
		for (int i = 0; i < size; i++) {
			if (listStudent.get(i).id.equals(id)) {
				studentLesson2 = listStudent.get(i);
				break;
			}
		}
		if (studentLesson2 != null)
			listStudent.remove(studentLesson2);
		System.out.println("Student is deleted !: ");
	}

	//UI
	public void showMenu() {
		System.out.println();
		System.out.println("\t\t\tApplication");
		System.out.println("1. Add student");
		System.out.println("2. Show student average score greater");
		System.out.println("3. Show list student cassification bad");
		System.out.println("4. Show student");
		System.out.println("5. Find student by name");
		System.out.println("6. Find student by ID");
		System.out.println("7. Delete student by ID");
		System.out.println("0. Exit");
		System.out.println();
	}
	
	public void uIManager() {
		int choose;
		String input = "";
		while (true) {
			showMenu();
			choose = getScanner().nextInt();
			switch (choose) {
			
			case 1:
				add();
				break;

			case 2:
				showAverage();
				break;

			case 3:
				showListStudentBad();
				break;

			case 4:
				showStudent();
				break;

			case 5:
				input = input();
				findStudentByName(input);
				break;

			case 6:
				input = input();
				findStudentByID(input);
				break;

			case 7:
				input = input();
				deleteStudentById(input);
				break;

			case 0:
				System.out.println("\t\t\tProgram is close !");
				return;

			default:
				System.out.println("Invalid ! try again");
				break;
			}
		}
	}


	private double inputChemical() {
		System.out.println("Input math score: ");
		while (true) {
			try {
				double chemical = Double.valueOf(getScanner().nextLine());
				if (chemical < 0 || physic > 10)
					throw new NumberFormatException();
				return chemical;
			} catch (NumberFormatException e) {
				System.out.println("Invalid ! try again");
			}
		}
	}

	private double inputPhysic() {
		System.out.println("Input math score: ");
		while (true) {
			try {
				double physic = Double.valueOf(getScanner().nextLine());
				if (physic < 0 || physic > 10)
					throw new NumberFormatException();
				return physic;
			} catch (NumberFormatException e) {
				System.out.println("Invalid ! try again");
			}
		}
	}

	private double inputMath() {
		System.out.println("Input math score: ");
		while (true) {
			try {
				double math = Double.valueOf(getScanner().nextLine());
				if (math < 0 || math > 10)
					throw new NumberFormatException();
				return math;
			} catch (NumberFormatException e) {
				System.out.println("Invalid ! try again");
			}
		}
	}

	private String inputId() {
		System.out.println("Input ID: ");
		return getScanner().nextLine();
	}

	private String inputName() {
		System.out.println("Input name: ");
		return getScanner().nextLine();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getPhysic() {
		return physic;
	}

	public void setPhysic(double physic) {
		this.physic = physic;
	}

	public double getChemical() {
		return chemical;
	}

	public void setChemical(double chemical) {
		this.chemical = chemical;
	}

	public double getAvarage() {
		return avarage;
	}

	public void setAvarage(double avarage) {
		this.avarage = avarage;
	}

	@Override
	public String toString() {
		return String.format("%-20s %-15s %-10s %-10s %-10s %-10.1f %-15s%n", name, id, math, physic, chemical,
				avarage(), classification());
	}

	public Scanner setSCANNER(Scanner sCANNER) {
		return sCANNER;
	}

	public String input() {
		System.out.println("Input required: ");
		return getScanner().nextLine();
	}

}
