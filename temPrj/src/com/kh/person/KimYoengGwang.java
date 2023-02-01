package com.kh.person;

public class KimYoengGwang extends Person{
	
	public KimYoengGwang() {
		super("김영광", "INFP", 28);
	}
	
	@Override
	public void hello() {
		String name = getName();
		String e = getMbti();
		int a = getAge();		
		
		System.out.println("제 이름은"+ name + " 이고 , "+ e +"이고 , " +a+ "살입니다");
	}
	
}
