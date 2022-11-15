package edu;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {

	public void copyFile(String sourceName, String destName) throws Exception {
		FileInputStream fis = new FileInputStream(sourceName);
		FileOutputStream fos = new FileOutputStream(destName);

		int r;
		// 1바이트씩 읽어서 1바이트씩 쓰는 것
		// fis에서 읽어서 r에다 집어 넣음, -1일떄 까지
		while ((r = fis.read()) != -1) {

			fos.write(r);

		}
		fos.close();
		fis.close();
	}

	public static void main(String[] args) throws Exception {
		Test3 tt = new Test3();

		tt.copyFile("testobj.dat", "dest.dat");
		System.out.println("done");
	}
}
