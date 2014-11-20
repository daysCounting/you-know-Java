package Pratices;

public class course implements Comparable {
	 private  Integer id;
	
	 private String courseName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public course(Integer id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "course [id=" + id + ", courseName=" + courseName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		course other = (course) obj;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	 
	public int compareTo(Object o){
		course aCourse = (course) o;
		int result = id > aCourse.id ? 1 : (id == aCourse.id ? 0 : -1);
		if(result == 0){
			result = courseName.compareTo(aCourse.courseName);
		}
		
		return result;
	}
	 
}
