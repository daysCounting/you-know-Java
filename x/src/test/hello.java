package test;
public class hello {
		
	int num1;
	int num2;
	public static int num3  = 34;
	public hello() {
		// TODO Auto-generated constructor stub
		num1 = 13;
		System.out.println(num1 +"xixi");
	}
	{
		num2 = 14 ;
		System.out.println(num2 +"xixi");
	}
	static{
		num3 = 22;
		System.out.println(num3 +"xixi");
	}
	public static void main(String[] args) {
		hello hi = new hello();
		System.out.println(hi.num1);
		System.out.println(hi.num2);
		System.out.println(num3);
		hello noHello = new hello();
	}
	
}
