package com.kh.person;

public abstract class Person {
	
	private String name;
	private String mbti;
	private int age;
	
	public abstract void hello();

	@Override
	public String toString() {
		return "Person [name=" + name + ", mbti=" + mbti + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMbti() {
		return mbti;
	}

	public void setMbti(String mbti) {
		this.mbti = mbti;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String mbti, int age) {
		super();
		this.name = name;
		this.mbti = mbti;
		this.age = age;
	}
	
	

}
