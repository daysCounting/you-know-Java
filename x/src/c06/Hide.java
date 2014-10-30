package c06;

class Homer {
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}

	float doh(float f) {
		System.out.println("doh(float)");
		return 1.0f;
	}

	String doh(String s) {
		System.out.println("doh(String)");

		return "he";
	}
}

class Milhouse {
	public String toString() {
		return ("x");
	}
}

class Bart extends Homer {
	void doh(Milhouse m) {
		System.out.println("Milhouse beta");
	}
}

class Hide {
	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1); // doh(float) used
		b.doh('x');
		b.doh(1.0f);
		b.doh("s");
		System.out.println(new Milhouse());
		b.doh(new Milhouse());
	}
}