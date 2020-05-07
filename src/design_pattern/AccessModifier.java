package design_pattern;

class Parent {
	private String prv = "private";
	public String pub = "public";
	protected String prt = "protected";
	String dft = "default";

	private void msg() {
		System.out.println("hi");
	}
}

public class AccessModifier {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
//		System.out.println(p.prv);
	}

}
