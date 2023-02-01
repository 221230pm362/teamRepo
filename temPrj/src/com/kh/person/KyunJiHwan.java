package com.kh.person;

public class KyunJiHwan extends Person {

	public KyunJiHwan() {
		super("견지환", "mbti", 27);
	}

	@Override
	public void hello() {
		String name = getName();
		int age = getAge();
		System.out.println("ㅎㅇ루~ " + name + "이고, 나이는 " + age + "입니다.");
	}

}
