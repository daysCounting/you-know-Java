package collectionDemo;

import java.util.HashSet;
import java.util.Set;

public class Student {

	private String name;

	private String className;

	private Set courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Set getCourses() {
		return courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

	public Student(String name, String className, Set courses) {
		super();
		this.name = name;
		this.className = className;
		this.courses =  new HashSet();
	}
	

	public Student(String name, String className) {
		super();
		this.name = name;
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", className=" + className
				+ ", courses=" + courses + "]";
	}

}
