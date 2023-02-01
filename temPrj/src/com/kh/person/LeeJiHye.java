package com.kh.person;

public class LeeJiHye extends Person {

	public LeeJiHye() {
		super("이지혜", "INFP", 200);
	}
	
	@Override
	public void hello() {
		String name = getName();
		String m = getMbti();
		int a = getAge();
		System.out.println("이름 : " + name + "mbti : " + m + "나이 : " + a);
	}
	

}
