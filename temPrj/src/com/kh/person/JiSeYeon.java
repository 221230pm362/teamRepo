package com.kh.person;

public class JiSeYeon extends Person {

	public JiSeYeon() {
		super("지세연", "INFJ", 20);
		
	}
	
	@Override
	public void hello() {
		System.out.println("제 이름은 "+getName()+"이고, 제 MBTI는 "+getMbti()+"이고, "+getAge()+"살 입니다.");
	}
	
	

}
