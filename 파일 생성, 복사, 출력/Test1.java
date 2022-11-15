package edu;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) {

		// 파일을 만들어 주는 구문 FileOutputStream
		FileOutputStream fos = null;

		// 생성자 만들고 예외를 처리한다
		try {
			fos = new FileOutputStream("test.dat");
			// abcd라는 값을 파일내용으로 쓴다
			fos.write("abcd".getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		}
		// finally는 예외처리 구문에서 마지막에 반드시 실행시켜야 하는 구문
		finally {
			try {
				fos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("END");
	}
}
