package IO.Praticse;

//工具类  列出file的一些操作比如过滤，遍历等操作
import java.io.File;
import java.io.IOException;

public class file2 {
	public static void listDirectory(File dir) throws IOException {
		if (!dir.exists()) {
			throw new IllegalArgumentException("目录" + dir + "不存在");
		}
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + " 不是目录");
		}
//
//		String[] filename = dir.list();
//		for (String aString : filename) {
//			System.out.println(dir + ": ");
//			System.out.println(aString);
//		}
		File[] file1 = dir.listFiles();
		if (file1 != null && file1.length > 0) {
			for (File file : file1) {
				if (file.isDirectory()) {
					listDirectory(file);
				}else {
					System.out.println(file);
				}
			}
		}

	}
}
