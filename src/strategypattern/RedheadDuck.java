package strategypattern;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		fb = new FlyWithWings();
		qb = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("I am redhead duck!");
	}
}
