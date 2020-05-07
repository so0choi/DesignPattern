package ducksimul;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quakBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	void display() {
		System.out.println("Looks like MallardDuck!");
	}

}
