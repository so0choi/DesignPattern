package design_pattern;

class Mammal {
	public void eat() {
		System.out.println("eat");
	};
}

class Dog extends Mammal {
	public void bark() {
		System.out.println("bark!!");
	}
}

public class Hierarchy {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		Mammal m = d;
		// m.bark(); ----impossible
		m.eat();
		Dog newD = (Dog) m;
		newD.bark(); // possible
	}
}
