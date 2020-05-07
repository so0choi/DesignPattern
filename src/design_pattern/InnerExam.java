package design_pattern;

public class InnerExam {
	public static void main(String[] args) {
		int x = 100;
		class Inner {
			int y = 200;
		}
		Inner in = new Inner();
		System.out.println("x:" + x);
		System.out.println("y:" + in.y);
	}
}
