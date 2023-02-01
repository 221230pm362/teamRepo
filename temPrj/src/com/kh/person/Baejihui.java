package com.kh.person;

public class Baejihui extends Person {
	
	public Baejihui() {
		super("baejihui" , "ENFP" , 20 );
	}
	
	@Override
	public void hello() {
		String name = getName();
		String m = getMbti();
		int a = getAge();
		System.out.println("제 이름은 " + name + "mbti는" + m + "나이는" +a);
		
	}

}
