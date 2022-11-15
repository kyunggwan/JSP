package edu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test2 {

	// object 형태로 출력하기, throws 예외 처리
	public void writeObject(String fname) throws Exception {
		FileOutputStream fos = new FileOutputStream(fname);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 10; i <= 20; i++) {
			// 오브젝트를 받아내는 Member클래스 생성
			Member m = new Member("홍길동" + i, i);
			oos.writeObject(m);
		}

		oos.close();
		fos.close();
	}

	// object를 프린트 하는 함수
	public void printObject(String fname) throws Exception {
		FileInputStream fis = new FileInputStream(fname);
		ObjectInputStream ois = new ObjectInputStream(fis);

		for (int i = 10; i <= 20; i++) {
			// object를 리턴하기때문에 member로 타입케스팅
			Member m = (Member) ois.readObject();
			System.out.println("print: " + m);
		}
		ois.close();
		fis.close();

	}

	public static void main(String[] args) throws Exception {
		Test2 tt = new Test2();
		tt.writeObject("testobj.dat");
		// tt.printObject("testobj.dat");
		System.out.println("done");
	}
}
