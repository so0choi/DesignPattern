package design_pattern;

class Shape {
	public Shape next;

	void draw() {
		System.out.println("shape");
	}
}

class Line extends Shape {
	@Override
	void draw() {
		System.out.println("line");
	}
}

class Rect extends Shape {
	@Override
	void draw() {
		System.out.println("rect");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("circle");
	}
}

public class OverridngExample {
	public static void main(String[] args) {
		Shape start, last, obj;
		start = new Line();
		last = start;
		obj = new Rect();
		last.next = obj;
		last = obj;
		obj = new Circle();
		last.next = obj;
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;
		}
	}
}
