package strategypattern;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		fb = new FlyNoWay();
		qb = new Mute();
	}

	@Override
	public void display() {
		System.out.println("I am decoyduck");
	}
}
