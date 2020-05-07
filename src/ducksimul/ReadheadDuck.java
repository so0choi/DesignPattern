package ducksimul;

public class ReadheadDuck extends Duck {
	public ReadheadDuck() {
		quakBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	void display() {
		System.out.println("Looks like RedHeadDuck!");
	}

}
