package strategypattern;

public class RubberDuck extends Duck {

	public RubberDuck() {
		qb = new Quack();
		fb = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am rubberduck!");
	}

}
