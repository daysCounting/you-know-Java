package Pratices;
/***
 * the pratice is about (set) hashSet. part of hashMap  ---->key
 *  two Parts : hashSet and TreeSet
 * @author dayscounting
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setTest {

	public Set<course> stsc;
	public TreeSet<course> ts;

	public setTest() {
		stsc = new HashSet<course>();
		ts = new TreeSet<course>();
	}

	public void testAdd() {

		course chinese = new course(1, "yuwen");

		course english = new course(2, "yingyu");

		course[] lizong = { new course(3, "wuli"), new course(4, "huaxue"),
				new course(5, "shengwu") };

		stsc.add(chinese);
		stsc.add(english);
		stsc.addAll(Arrays.asList(lizong));
		stsc.add(chinese);

		System.out.println("   setSize is :  " + stsc.size());

		ts.add(english);
		ts.add(chinese);
		ts.addAll(Arrays.asList(lizong));

		System.out.println("the size of  treeSet " + ts.size());

	}

	public void testExist() {
		stsc.contains(new course(1, "yuwen"));

		course[] lizong = { new course(3, "wuli"), new course(4, "huaxue"),
				new course(5, "shengwu") };

		stsc.containsAll(Arrays.asList(lizong));
		
		System.out.println("the elements of ts :  ");
		for(Object object : ts){
			System.out.println((course)object);
		}
		
		System.out.println("the elements of stsc : ");
		
		for(Object object : stsc){
			
			System.out.println((course)object);
			
		}
		
		System.out.println("ts.comparator is : " + ts.comparator());
	}

	public void removeTest() {
		System.out.println("before finilize");

		for (Object object : stsc) {
			System.out.println((course) object);
		}

			
	}

	public static void main(String[] args) {
		setTest sTest = new setTest();
		sTest.testAdd();
		sTest.testExist();
		sTest.removeTest();
	}
   
}
