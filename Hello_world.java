package demojava_package;

import java.util.*;

public class Hello_world {
	

	
	//2 error
	//complie error
	//runtime error

	
	
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	//bai 1
	public static double squareTrangle(double a, double b) {
		double c =Math.sqrt((Math.pow(a, 2)+ Math.pow(b, 2)));
		
		return c;
	}
	
	//bai 2
	public static double expressionP(double a, int n) {
		int x = 8;
		double result = a*Math.pow(x, n);
		return result;
	}
	
	//bai 3
	public static int sumTwoDigit(int number) {
		int sum = 0;
		if (number >= 10) {
		int divi = number/10;
		int mod = number%10;
		sum = divi+mod;
		}
		
		return sum;
	}
	
	
	//bai 5
	public static double cel(double c) {
		double f = (c*1.8)+ 32;
		return f;
	}
	
	//bai 6
	public static double vndToUsd(double usd) {
		final double VND = 23.500;
		return usd*VND;
	}
	
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//	int one;
//	String nameString = "a";
//	final double Pi = 3.14;
//	final String fullName = "David Tran";
//	boolean isEmpty = true;
	
//int a = Integer.valueOf(scanner.next());
//int b = Integer.valueOf(scanner.next());
//	System.out.println(add(a, b));
		
		
		
		
//bai 1
//		double a = Integer.valueOf(scanner.next());
//		double b = Integer.valueOf(scanner.next());	
//		System.out.println(squareTrangle(a, b));

		
//bai 2
//	double a = scanner.nextDouble();
//	int n = Math.abs(scanner.nextInt());
//	System.out.println(expressionP(a, n));
		
		
//bai 3
//		int n = scanner.nextInt();
//		System.out.println(sumTwoDigit(n));
		
		
//bai 4
//		double a = 0;
//		a += scanner.nextDouble();
//		a += scanner.nextDouble();
//		a += scanner.nextDouble();
//		a += scanner.nextDouble();
//		a += scanner.nextDouble();
//		double average = a/5;
//		System.out.println(average);
		

//bai 5
//		double c = scanner.nextDouble();
//		System.out.printf("%.5f",cel(c));
		
		
//bai 6
//		double USD = scanner.nextDouble();
//		System.out.printf("%.3f", vndToUsd(USD));
		

		
	}
}
