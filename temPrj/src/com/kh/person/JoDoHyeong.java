package com.kh.person;

public class JoDoHyeong extends Person{

	public JoDoHyeong(){
		super("조도형", "몰?루", 27);
	}
	
	
	@Override
	public void hello() {
		
		System.out.println("이름은 " + getName() + 
				"이고, mbti는 " + getMbti() + 
				", 나이는 " + getAge() );
		
	}

}
