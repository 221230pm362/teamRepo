package com.kh.person;

public class KimMinKyu extends Person {

	
	  
	public KimMinKyu() {
		super("김민규", "ENTP", 20);
	}


	@Override
	public void hello() {
		String name = getName();
		String m = getMbti();
		int a  = getAge();
		System.out.println("제 이름은" + name + "입니다.");
	}
	
	

}
