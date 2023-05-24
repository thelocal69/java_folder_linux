package baitap_oop;

public class ExpressionTwo {
	private double a;
	private double b;
	private double c;
	
	
	public ExpressionTwo() {}


	public ExpressionTwo(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	public double delta() {
		return (Math.pow(this.b, 2)) - (4*this.a*this.c);
	}
	
	public void equaltionTest() {
		double delta = delta();
		double x1 = 0;
		double x2 = 0;
		double x3 = 0;
		if (delta > 0) {
			x1 = (-b + Math.sqrt(delta))/(2*a);
			x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.printf("phuon trinh co 2 nghiem phan biet: x1 = %.10f x2 = %.10f", x1, x2);
		}else if (delta < 0) {
			System.out.println("phuong trinh vo nghiem");
		}else {
			x3 = -b/(2*a);
			System.out.println("Phuong trinh co nghiem kep: "+x3);
		}
	}


	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}
	
	
}
