package IO.Praticse;

import java.io.File;
import java.io.IOException;

public class fileApi {
	public static void main(String[] args) {
		File file = new File("//workSpace//imooc");
		if(!file.exists()){
			file.mkdir();
		}else {
			file.delete();
		}
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		File file2 = new File("//workSpace//xixi.txt");
		
		if(!file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			file2.delete();
		}
		System.out.println(file);//function toString
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getParent());
		System.out.println(file2.getParentFile().getAbsolutePath());
	}
}
