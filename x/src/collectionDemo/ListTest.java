package collectionDemo;

import java.util.*;


public class ListTest {
	
	public List coursesToSelected;
	
	public ListTest() {
		super();
		this.coursesToSelected = new ArrayList();
	}
	
	public void testList(){
		
		Course c1 = new Course("math", 1);
		
		coursesToSelected.add(c1);
		coursesToSelected.add(c1);
		coursesToSelected.add(c1);
		coursesToSelected.add(c1);
		coursesToSelected.add(c1);
		
		Course temp = (Course) coursesToSelected.get(4);
		
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest(); 
		lt.testList();
	}
}
