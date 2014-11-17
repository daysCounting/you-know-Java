package collectionDemo;

public class Course {
	
	private String courseName;
	
	private int id ;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getId() {
		return id;
	}

	public Course(String courseName, int id) {
		super();
		this.courseName = courseName;
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "添加课程"+"Course [courseName=" + courseName + ", id=" + id + "]";
	}
	
	
}
