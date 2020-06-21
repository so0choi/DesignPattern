package adapter_facade_pattern;

public class TurkeyAdapter {
	Turkey turkey;

	public TurkeyAdapter(WildTurkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		System.out.println("(I can pretend to be a duck... I'm a wild turkey)");
		turkey.fly();
	}

	public void display() {
		System.out.println("I am actually a Wild Turkey!");
	}
}
