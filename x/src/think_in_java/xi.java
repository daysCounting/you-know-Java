package think_in_java;
import java.util.*;
public class xi {
	
	/**
	 * @author daysCounting lin
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Date());
		Properties p  = System.getProperties();
		p.list(System.out);
		System.out.println(" - - - Memory Usage:");
	    Runtime rt  = Runtime.getRuntime();
	    System.out.println("Total Memory = "
	    									+ rt.totalMemory()
	    									+ "  Free Memory  = "
	    									+ rt.freeMemory());
	    A xi = new A(1, "b", "f");
	    /** 
	    
	    * 您<em>甚至</em>可以插入一个列表: 
	    * <ol> 
	    * <li> 项目一 
	    * <li> 项目二 
	    * <li> 项目三 
	    * </ol> 
	    */ 
	    
	}
	public static  class A{
		private int a ;
		private String b;
		private String c;
		public A(int a ,String b,  String C){
			this.a = a;
			this.b = b;
			this.c = c;
			
		}
	}

}
