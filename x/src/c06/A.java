package c06;

import c06.B;

public class A {
	A() {
		System.out.println("A is constructed");
	}

	public static void main(String[] args) {
		C xiaoc = new C();
	}
}

class C extends A {
	B xiaoB = new B();

}