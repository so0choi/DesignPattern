package commandpattern;

public class Light {
	String name;

	public Light(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(this.name + " light on");
	}

	public void off() {
		System.out.println(this.name + " light off");
	}
}
