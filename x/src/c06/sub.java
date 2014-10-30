package c06;

class ext {
	private String s;
	public ext() {
		// TODO Auto-generated constructor stub
		System.out.println("ext is create");
		s = new String("out of  bound");
	}
	public String toString(){
		return s;
	}
}

public class sub {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ext a = new ext();
		System.out.println(a);
	}

}
