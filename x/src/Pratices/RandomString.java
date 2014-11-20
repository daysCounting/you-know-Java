package Pratices;
import java.util.*;

public class RandomString {
	static Random r = new Random();
	static String ssource = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static char[] model = ssource.toCharArray();
	public String[] randomString(int size, int length){
		String[] za = null; 

		for (int i = 0; i < size; i++) {
			za[i] = randomString( length);
		}
		return za;
	}
	
	public String randomString(int length) {
		char[] buf = new char[length];
		int rnd;
		for (int i = 0; i < length; i++) {
			rnd = Math.abs(r.nextInt()) % model.length;
			buf[i] = model[rnd];
		}
		return new String(buf);
		
	}
	
	public static void main(String[] args) {
		Random rd = new  Random();
		byte[] bt = new byte[9];
		rd.nextBytes(bt);
		for (int i = 0; i < bt.length; i++) {
			System.out.print(bt[i]+"-");
		}
	
	}
	
}
