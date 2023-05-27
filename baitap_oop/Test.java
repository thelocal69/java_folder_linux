package baitap_oop;


public class Test {

	public static void main(String[] args) {
		
		//bai1
//		ExpressionTwo expressionTwo = new ExpressionTwo(1, 3, -1);
//		ExpressionTwo expressionTwo2 = new ExpressionTwo(1, -2, 1);
//		ExpressionTwo expressionTwo3 = new ExpressionTwo(6, 1, 5);
//		System.out.println(expressionTwo.delta());
//		expressionTwo.equaltionTest();
//		
//		System.out.println(expressionTwo2.delta());
//		expressionTwo2.equaltionTest();
//		
//		System.out.println(expressionTwo3.delta());
//		expressionTwo3.equaltionTest();
		
		//bai2
//		Student student1 = new Student(1, "thien", 1, 1);
//		student1.average();
//		System.out.println(student1.toString());
//		
//		Student student2 = new Student(2, "hoa", 2, 2);
//		student2.average();
//		System.out.println("My best friend "+student2.toString());
//		
//		Student student3 = new Student();
//		student3.setId(1);
//		student3.setName("lan");
//		student3.setScoreLT(3);
//		student3.setScoreTH(3);
//		student3.average();
//		System.out.println(student3.toString());
		
		//bai3
		Account account1 = new Account(1234567890, "TRAN PHI LAM");
		System.out.println(account1.toString());
		System.out.println("money recharge: ");
		account1.moneyRecharge();
		System.out.println("money withdrawal: ");
		account1.moneyWithdraw();
		System.out.println("money transfer: ");
		account1.moneyTransfer();
		System.out.println("account expired: ");
		account1.accountExpired();
	}

}
