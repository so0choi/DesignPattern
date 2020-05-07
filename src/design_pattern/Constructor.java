package design_pattern;

class ParentClass {
	ParentClass() {
		System.out.println("default parent constructor");
	}

	ParentClass(int x) {
		System.out.println("x is " + x);
	}
}

class Child extends ParentClass {
	Child() {
		super(2);
		System.out.println("child constructor");
	}
}

public class Constructor {
	public static void main(String[] args) {
		Child c = new Child();
	}
}
