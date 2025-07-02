package inheritance;

class Animal {
	String name;
	int age;

	// Constructor
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void makeSound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
}

class Bird extends Animal {
	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	void makeSound() {
		System.out.println("Bird chirps");
	}
}

public class AnimalHierarchy {
	public static void main(String[] args) {
		Animal dog = new Dog("Buddy", 3);
		Animal cat = new Cat("Whiskers", 2);
		Animal bird = new Bird("Tweety", 1);

		// Demonstrate polymorphism
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
}