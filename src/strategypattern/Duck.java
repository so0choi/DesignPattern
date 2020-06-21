package strategypattern;

public abstract class Duck {
	FlyBehavior fb;
	QuackBehavior qb;

	public void performFly() {
		fb.fly();
	}

	public void performQuak() {
		qb.quack();
	}

	public abstract void display();

	public void swim() {
		System.out.println("Every ducks can swim.");
	}
}
