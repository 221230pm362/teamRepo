package com.kh.person;

public class KimGangBoon extends Person {

	public KimGangBoon() {
		super("김강분", "ENFP", 20);
	}
	
	@Override
	public void hello() {
			String name = getName();
			String m = getMbti();
			
			System.out.println("제 이름은 " + name + "이고, mbti는 " + m + ", 나이는...");
		
	}
	
}
