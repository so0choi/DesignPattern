package composite_iterator_pattern;

import java.util.Iterator;

public class Waitress {
	MenuComponent items;

	public Waitress(MenuComponent items) {
		this.items = items;
	}

	public void printAllMenu() {
		items.print();
	}

	public void allVegiMenus() {
		Iterator iterator = items.createIterator();
		System.out.println("vegi menus---");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
			}
		}
	}
}
