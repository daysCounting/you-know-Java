package Pratices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.omg.CORBA.IRObject;
/***
 * ok , i agree that  i don't like remove !   
 * @author dayscounting
 *
 */
public class listTest {
	public List coursesToSelected;

	public listTest() {
		this.coursesToSelected = new ArrayList();
	}

	public void addTest(){
		course chinese = new course(1, "yuwen");
		
		course english = new course(2, "yingyu");
		
		course[] lizong  = {new course(3, "wuli")
									  ,new course(4, "huaxue")
									  ,new course(5, "shengwu")};
		
		coursesToSelected.add(chinese);
	
		coursesToSelected.addAll(Arrays.asList(lizong));

	    coursesToSelected.add(2, english);	
	}
	
	public void judgement() {
		ListIterator<course> lr ;
		if(coursesToSelected != null){
			coursesToSelected.contains("yuwen");
		
			course[] lizong  = {new course(3, "wuli")
										  ,new course(4, "huaxue")
			  							  ,new course(5, "shengwu")};
			System.out.println("containsAll:");
			System.out.println(coursesToSelected.containsAll(Arrays.asList(lizong)));
		
			System.out.println("Print all elements: ");
			for(Iterator ut = coursesToSelected.iterator();ut.hasNext();){
				System.out.println(ut.next());
			}
			System.out.println("indexOf three:");
			
			System.out.println(coursesToSelected.indexOf(new course(4, "huaxue")));
			
			System.out.println("get index of three");
			
			System.out.println(coursesToSelected.get(3));
			
			lr = coursesToSelected.listIterator();
		
			System.out.println("print  listIterator : ");
			
			for(;lr.hasNext();){
				System.out.println(lr.next());
			}
			 System.out.println(lr.previousIndex());
			
		}	
	}
	
	public void finilize(){
		System.out.println("before finilize");
		
		for(Object object : coursesToSelected ){
			System.out.println();
			System.out.println((course)object);
		}
		coursesToSelected.clear();
		
		System.out.println("after finilized");
		
		
	}
	
	public static void main(String[] args) {
	      listTest  lt = new listTest();
	      lt.addTest();
	      lt.judgement();
	      lt.finilize();
	}
	
}
