package edu;

import java.io.Serializable;

//Serializable 해야지 text 파일이 안읽히게 나옴
public class Member implements Serializable {
	// SerialVersionUID = 1L; 2L; 있음. 차이는 잘 모르겠는데 버젼 잘 맞춰야함
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

}
