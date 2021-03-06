package c07;

/***
 * 内部类的例子
 * 
 * @author dayscounting
 * 
 */
public class Parcel1 {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public Destination to(String s) {
		return new Destination(s);
	}

	public Contents cont() {
		return new Contents();
	}

	public void ship(String dest) {
		Contents c = cont();
		Destination d = to(dest);
	}

	public static void main(String[] args) {
		Parcel1 p = new Parcel1();
		p.ship("Tanzania");
		Parcel1 q = new Parcel1();
		// Defining handles to inner classes:
		Parcel1.Contents c = q.cont();
		Parcel1.Destination d = q.to("Borneo");
	}
} // /: ̄
