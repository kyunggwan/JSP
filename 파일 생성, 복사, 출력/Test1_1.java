package edu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Test1을 조금 변형
public class Test1_1 {
	// 파일을 만들어 주는 구문 FileOutputStream
	FileOutputStream fos = null;

	// writer 메소드로 구현
	public void writer(String fname) {

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

	// 출력 부분 구현, 식이 복잡하면 throws로 예외 처리
	public void printdata(String fname) throws Exception {

		FileInputStream fis = new FileInputStream(fname);
		while (true) {
			// fis에 있는 파일을 다 읽으면 -1리턴
			int r = fis.read();
			if (r == -1)
				break;
			System.out.println("r : " + r);
		}
		fis.close();
	}

	public static void main(String[] args) {

		Test1_1 tt = new Test1_1();
		// writer 메소드로 출력
//		tt.writer("test.dat");
		// printdata메소드를 이용한 출력, 간단할 때는 try catch로 예외 처리
		// 출력하면 97 98 99 100 나오는데 각각 a, b, c, d 아스키 코드값
		try {
			tt.printdata("test.dat");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
