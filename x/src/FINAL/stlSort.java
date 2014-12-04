package FINAL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.BitSet;
import java.util.Scanner;

public class stlSort implements testMemory {
	static BitSet bitSet;
	static int num;

	public static void readTxtFile(String filePath, int flag) {
		bitSet = new BitSet(5000000);
		try {
			String encoding = "GBK";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				System.out.println(2);
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到编码格式
				System.out.println(1);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				System.out.println("@");
				while ((lineTxt = bufferedReader.readLine()) != null) {
					num = Integer.parseInt(lineTxt);
					if (flag == 0 && num < 5000000)
						bitSet.set(num, true);
					if (flag == 1 && num > 5000000)
						bitSet.set(num - 5000000, true);
				}
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}

	}

	public static void fileWrite(String path) throws IOException {
		File file = new File(path);
		System.out.println("!");
		if (!(file.isFile() && file.exists())) {
			file.createNewFile();
		}
		try {
			String encoding = "GBK";
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				OutputStreamWriter writer = new OutputStreamWriter(
						new FileOutputStream(file), encoding);// 考虑到编码格式
				BufferedWriter bw = new BufferedWriter(writer);
				String lineText = null;
				for (int i = 1; i < 10000000; i++) {
					lineText = i + "\n";
					writer.write(lineText);
				}

				writer.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}

	}

	public static void print(int flag) {
		for (int i = 5000000; i > 100; i = i - 100) {

			if (bitSet.get(i)) {
				System.out.println(i + flag * 5000000);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// Scanner in = new Scanner(System.in);
		// String i = in.next();
		// System.out.println(i);
		long start = System.currentTimeMillis();
		String filePathString = "//workSpace//xixi.txt";
		// fileWrite(filePathString);
		readTxtFile(filePathString, 0);
		//print(0);
		System.out.println(" - - - Memory Usage:");
		System.out.println("Total Memory = " + rt.totalMemory()
				+ "  Free Memory  = " + rt.freeMemory());
		System.out.println("Use Memory" +( rt.totalMemory()-rt.freeMemory()));
		readTxtFile(filePathString, 1);
		//print(1);
		long end = System.currentTimeMillis();
		System.out.println("Use time "+ (end - start));

	}

}
