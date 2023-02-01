package com.kh.person;

public class KwakSeKyung extends Person {

	
	public KwakSeKyung () {
		super("곽세경" , "ISFP" , 28);
	}
	
	@Override
	public void hello() {
		System.out.println("제 이름은 " + getName() + "이고 , "
				+ getMbti() + "이고 , " + getAge() + "살 입니다.");
	}
	
}
