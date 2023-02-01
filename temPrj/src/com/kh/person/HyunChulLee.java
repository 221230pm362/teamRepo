package com.kh.person;

public class HyunChulLee extends Person{
	
	public HyunChulLee() {
		super("이현철", "ISFP", 26);
		
	}

	public HyunChulLee(String name, String mbti, int age) {
		super(name, mbti, age);
	}

	@Override
	public void hello() {
		System.out.println("안녕하세요");
		System.out.println("제 이름은 " + getName() + "이고 MBTI는 " + getMbti()+ "이고 나이는 " + getAge() + "입니다");
		
	}

	
}
