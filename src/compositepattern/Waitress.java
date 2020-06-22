package compositepattern;

public class Waitress {
	MenuComponent allItem;

	public Waitress(MenuComponent allItem) {
		this.allItem = allItem;
	}

	public void printAllMenu() {
		allItem.print();
	}
}
