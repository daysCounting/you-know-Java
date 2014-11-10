package c07;
/***
 * int radius = 1; 初始化后。调用父类Glyph()的draw()方法，抽象方法变量 即为0,
 * 然后用子类RoundGlyph 的draw()覆盖父类方法，即输出为radius = 0 ;
 * @author dayscounting
 *
 */
abstract class Glyph {

	abstract void draw();

	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	void draw() { 
		System.out.println("before println");
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
} // /: ̄
