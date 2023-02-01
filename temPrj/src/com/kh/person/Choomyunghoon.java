package com.kh.person;

public class Choomyunghoon extends Person{

	public Choomyunghoon() {
		super("추명훈", "MBTI", 25);
	}
	
	
	@Override
	public void hello() {
		String name = getName();
		String m = getMbti();
		int a = getAge();
		System.out.println("제 이름은" + name + "이고, " + a + "입니다");
	}
}
