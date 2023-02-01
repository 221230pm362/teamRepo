package com.kh.person;

public class KangwooSeok extends Person {
	
	public KangwooSeok() {
		super("강우석", "INTP", 26);
	}
	
	@Override
	public void hello() {
		String name = getName();
		String m = getMbti();
		int a = getAge();
		System.out.println("이름은 " + name + ", MBTI는 " + m + ", 나이는 " + a);
		
	}
	
	
	
	
}
