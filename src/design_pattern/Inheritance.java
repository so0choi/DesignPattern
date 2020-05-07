package design_pattern;

public class Inheritance {
	public class ParentClass {
		String parent = "I am parent";

		public void parent() {
			System.out.println("I am Parent's method Parent() in ParentClass");
		}
	}

	public class ChildClass extends ParentClass {
		String child = "I am child";

		public void child() {
			parent();
			System.out.println(parent);
			System.out.println("I am child's method child() in ChildClass");
			System.out.println(child);
		}
	}

	public static void main(String[] args) {
		Inheritance inheritance = new Inheritance();
		ChildClass childClass = inheritance.new ChildClass();
		childClass.child();
	}
}
