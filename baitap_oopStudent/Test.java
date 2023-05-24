package baitap_oopStudent;

import java.util.Scanner;

public class Test {
	public static final Scanner SCANNER = new Scanner(System.in);
	public static void main(String[] args) {
		
		//bai1
//		StudentLesson1 studentLesson1 = new StudentLesson1("thien", "44.01.613", 9, 10, 10);
//		System.out.println(studentLesson1.toString);
//		studentLesson1.classification();
		
		//bai2
		StudentLesson2 studentLesson2 = new StudentLesson2();
		String input;
		while (true) {
			showMenu();
			int choose = SCANNER.nextInt();
			switch (choose) {
			
			case 1:{
				studentLesson2.add();
				break;
			}

			case 2:{
				studentLesson2.showAverage();
				break;
			}

			case 3:{
				studentLesson2.showListStudentBad();;
				break;
			}

			case 4:{
				studentLesson2.showStudent();
				break;
			}

			case 5:{
				System.out.println("Input name: ");
				input = studentLesson2.input();
				studentLesson2.findStudentByName(input);
				break;
			}

			case 6:{
				System.out.println("Input Id: ");
				input = studentLesson2.input();
				studentLesson2.findStudentByID(input);
				break;
			}

			case 7:{
				System.out.println("Input Id: ");
				input = studentLesson2.input();
				studentLesson2.deleteStudentById(input);
				break;
			}

			case 0:{
				System.out.println("\t\t\tProgram is close !");
				return;
			}
			
			default:
				System.out.println("Invalid");
			}
		}
		
	}
	public static void showMenu() {
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
}
