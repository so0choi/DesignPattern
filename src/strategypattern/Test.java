package strategypattern;

public class Test {
	public void testDuck(Duck d) {
		d.performFly();
		d.performQuak();
		d.display();
	}

	public static void main(String[] args) {
		Test test = new Test();

		Duck duck = new MallardDuck();
		test.testDuck(duck);

		duck = new RubberDuck();
		test.testDuck(duck);

		duck = new DecoyDuck();
		test.testDuck(duck);

		duck = new RedheadDuck();
		test.testDuck(duck);

	}

}
