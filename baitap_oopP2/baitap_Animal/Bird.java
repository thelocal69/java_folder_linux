package baitap_Animal;

public class Bird extends Animal{
	
	public Bird() {
		super();
	}

	@Override
	void eat() {
		System.out.println("Do Do");
	}

	@Override
	void makeSound() {
		System.out.println("Bak Bak");
	}

	void fly() {
		System.out.println("Bay len hoa mi oi");
	}
}
