package IO.Praticse;

import java.io.UnsupportedEncodingException;

public class Encoding {
			public static void main(String[] args){
				String d = "慕课ABC";
				byte[] byte1 = null;
				try {
					byte1 = d.getBytes("utf-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(byte a : byte1){
					System.out.print(Integer.toHexString(a & 0xff) + " ");
				}
				System.out.println();
				byte[] byte2 = null;
				try {
					byte2 = d.getBytes("gbk");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				for(byte a : byte2){
					System.out.print(Integer.toHexString(a & 0xff) + " ");
				}
				System.out.println();
				byte[] byte3 = null;
				try {
					byte3 = d.getBytes("utf-16be");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				for(byte a : byte3){
					System.out.print(Integer.toHexString(a & 0xff) + " ");
				}
				String str = null;
				try {
					str = new String(byte2,"gbk");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String str2 = new String(byte1);
				System.out.println(str);
				System.out.println(str2);
			}
}
