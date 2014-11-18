package collectionDemo;
/**
 *  list  中的ArrayList 类似有序数组。是最常用的一种方式。
 * @author dayscounting
 */

import java.util.*;

public class ListTest {

	public List coursesToSelected;

	public ListTest() {
		super();
		this.coursesToSelected = new ArrayList();
	}

	public void testList() {

		Course c1 = new Course("math", 1);

		coursesToSelected.add(c1);
		coursesToSelected.add(c1);
		coursesToSelected.add(c1);
		coursesToSelected.add(c1);

		Course[] courses = { new Course("chinese", 2), new Course("english", 3) };
		coursesToSelected.addAll(Arrays.asList(courses));
		Course temp = (Course) coursesToSelected.get(3);

		System.out.println(temp);
	}

	public void get() {
		Iterator itr = coursesToSelected.iterator();
		for (; itr.hasNext();) {
			System.out.println(itr.next());
		}
	}

	public void forEach() {
		for (Object object : coursesToSelected) {
			System.out.println(object);
		}

	}
	public void listModify(){
		coursesToSelected.set(3, new Course("history", 3));
	}
   
	public void listDelete(){
		coursesToSelected.remove(2);
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.testList();
		System.out.println();
		lt.get();
		System.out.println();
		lt.listModify();
		lt.listDelete();
		lt.forEach();
	}
}
