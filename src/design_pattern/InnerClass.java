package design_pattern;

public class InnerClass {
	private static int x = 100;

	class Inner {
		private int x = 200;

		public void display() {
			System.out.println("x in outer: " + InnerClass.x);
			System.out.println("x in inner: " + this.x);
		}
	}
}
