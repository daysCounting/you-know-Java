package c08;

import java.util.*;

public class Collection1 {
	public static Collection fill(Collection c, int start, int size) {
		for (int i = start; i < start + size; i++)
			c.add(Integer.toString(i));
		return c;
	}

	// Default to a "start" of 0:
	public static Collection fill(Collection c, int size) {
		return fill(c, 0, size);
	}

	// Default to 10 elements:
	public static Collection fill(Collection c) {
		return fill(c, 0, 10);
	}

	// Create & upcast to Collection:
	public static Collection newCollection() {
		return fill(new ArrayList());
		// ArrayList is used for simplicity, but it's
		// only seen as a generic Collection
		// everywhere else in the program.
	}

	// Fill a Collection with a range of values:
	public static Collection newCollection(int start, int size) {
		return fill(new ArrayList(), start, size);
	}

	// Moving through a List with an iterator:
	public static void print(Collection c) {
		for (Iterator x = c.iterator(); x.hasNext();)
			System.out.print(x.next() + " ");
		System.out.println();
	}

	public static void Print(Collection c) {
		for (Iterator x = c.iterator(); x.hasNext();) {
			System.out.println(x.next() + "");
		}
	}

	public static void main(String[] args) {
		// new a Collection(ArrayList)
		Collection c = newCollection();
		// add test
		c.add("one");
		c.add("two");
		Print(c);
		String[] str = (String[]) c.toArray(new String[1]);
		String s = new String();
		for (String string : str) {
			s += string;
		}
		System.out.println(s);
		System.out.println("max "+Collections.max(c));
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "  i");
		}
	}

} // /: ̄ 