package com.kh.person;

public class Kimyejin extends Person{

	public Kimyejin() {
		super("김예진","isfj",22);
	}
	
	
	@Override
	public void hello() {
		String name = getName();
		String m = getMbti();
		int a = getAge();
		System.out.println("이름 : " + name + ", 나이 : " + a + ", mbti : " + m);
	}
	
	

}
