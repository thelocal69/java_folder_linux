package baitap_Animal;

public class Cat extends Animal{
	
	
	public Cat() {
		super();
	}

	@Override
	void eat() {
		System.out.println("Ngon Ngon");
	}

	@Override
	void makeSound() {
		System.out.println("leu leu");
	}

	void run() {
		System.out.println("sao nhanh qua day");
	}
}
