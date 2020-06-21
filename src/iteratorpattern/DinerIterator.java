package iteratorpattern;

import java.util.Iterator;

public class DinerIterator implements Iterator {
	int position = 0;
	MenuItem[] items;

	public DinerIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else
			return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}

	@Override
	public void remove() {
		if (position <= 0) {
			System.out.println("Can't remove before execute next() at least once.");
		} else {
			if (items[position - 1] != null) {
				for (int i = position - 1; i < items.length - 1; i++) {
					items[i] = items[i + 1];
				}
				items[items.length - 1] = null;
			}
		}
	}
}
