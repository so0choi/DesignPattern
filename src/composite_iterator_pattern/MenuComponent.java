package composite_iterator_pattern;

import java.util.Iterator;

public abstract class MenuComponent {
	String name;
	String description;
	double price;

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public void add(MenuComponent m) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent m) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}

	public abstract Iterator createIterator();

}
