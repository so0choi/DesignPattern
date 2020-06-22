package compositepattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList menuComponents; // 여기에 component들 저장
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
		menuComponents = new ArrayList();
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	@Override
	public void add(MenuComponent m) {
		menuComponents.add(m);
	}

	@Override
	public void remove(MenuComponent m) {
		menuComponents.remove(m);
	}

	@Override
	public MenuComponent getChild(int i) {
		return (MenuComponent) menuComponents.get(i + 1);
	}

	@Override
	public void print() {
		System.out.println(getName() + ", " + getDescription());
		System.out.println("------------");

		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.print();
		}
	}

}
