package adapter_facade_pattern;

import strategypattern.MallardDuck;

public class TestTurkeyAdapter {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		duck.display();
		duck.performFly();
		duck.performQuak();
		turkeyAdapter.display();
		turkeyAdapter.quack();
		turkeyAdapter.fly();

	}
}
