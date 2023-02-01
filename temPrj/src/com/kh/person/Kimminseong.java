package com.kh.person;

public class Kimminseong extends Person {

	public Kimminseong() {
		super("김민성", "INFP", 25);
	}
	
	@Override
	public void hello() {
		System.out.println("제 이름은 " + getName() + "이고, MBTI는 " + getMbti() + "이고, 나이는 " + getAge() + "살 입니다^^");
	}	

}
