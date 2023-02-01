package com.kh.person;

public class YoonSoYeon extends Person {

	public YoonSoYeon() {
		super("윤소연", "ISTP", 25);
	}
	
	@Override
	public void hello() {
		String name = getName();
		String mbti = getMbti();
		int age = getAge();
		
		System.out.println("안녕하세요 이름:" + name + " mbti:" + mbti + " age:" + age + "입니다." );
	}

}
