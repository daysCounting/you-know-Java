package think_in_java;

import java.security.PublicKey;

import org.omg.CORBA.PUBLIC_MEMBER;

public class baseRules {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test());
		int x = 1;
		switch (x) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break ;
		default:
			System.out.println(3);
			break;
		}
	}

	public static int test() {
		int x = 0;
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if (i == 47) {
				x = i;
				break;
			}
		}
		return x;
	}

}
