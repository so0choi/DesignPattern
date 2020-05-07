package ducksimul;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
		quakBehavior = new MuteQuack();
	}

	@Override
	void display() {
		System.out.println("Looks like DecoyDuck!");

	}

}
