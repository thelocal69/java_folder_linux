package baitap_Animal;

public class Testt {

	public static void main(String[] args) {
		Animal animal = new Cat();
		Animal animal2 = new Bird();
		
		Cat cat = (Cat) animal;
		cat.eat();
		cat.run();
		cat.makeSound();
		
		Bird bird = (Bird) animal2;
		bird.eat();
		bird.makeSound();
		bird.fly();
	}

}
