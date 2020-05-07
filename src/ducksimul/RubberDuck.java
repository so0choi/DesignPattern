package ducksimul;

public class RubberDuck extends Duck {
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quakBehavior = new Squeak();
	}

	@Override
	void display() {
		System.out.println("Looks like RubberdDuck!");

	}

}
