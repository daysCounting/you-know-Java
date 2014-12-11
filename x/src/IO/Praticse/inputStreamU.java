package IO.Praticse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;

/**
 * 输入流:字节流， 字符流
 * 
 * @author dayscounting
 * 
 **/
public class inputStreamU {
	public inputStreamU() {
		// TODO Auto-generated constructor stub
	}

	public void inputFile(File file) throws IOException {
		FileInputStream in = new FileInputStream(file);
		int i;
		int b = 1;
		byte[] buf = new byte[20 * 1024 * 1024];
		// while ((i = in.read()) != -1) {
		// if (i <= 0x0f) {
		// System.out.print("0");
		// }
		// System.out.print(Integer.toHexString(i) + " ");
		// if (b++ % 10 == 0) {
		// System.out.println();
		// }
		// }
		while ((i = in.read(buf, 0, buf.length)) != -1) {
			
		}
	}
}
