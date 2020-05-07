package ducksimul;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuakBehavior quakBehavior;

	void performQuack() {
		quakBehavior.quack();
	}

	void performFly() {
		flyBehavior.fly();
	}

	void swim() {
		System.out.println("I'm swimming");
	}

	abstract void display();
}