package Pratices;
import java.util.*;

public class RandomString {
	
	public String[] randomString(int size, int length){
		String[] za = null; 
		String ssource = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		char[] model = ssource.toCharArray();
		for (int i = 0; i < size; i++) {
			za[i] = randomString( length);
		}
		return za;
	}
	
	public String randomString(int length) {
		String temp = null; 
		
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
