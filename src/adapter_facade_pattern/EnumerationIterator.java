
package adapter_facade_pattern;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
	Enumeration enumeration;

	public EnumerationIterator(Enumeration e) {
		this.enumeration = e;
	}

	@Override
	public boolean hasNext() {
		System.out.println("this is enumeration ");
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		System.out.println("this is enumeration");
		return enumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
