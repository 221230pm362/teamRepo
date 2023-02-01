package com.kh.person;

public class YoonJiWoong extends Person {
	
	public YoonJiWoong() {
		super("윤지웅", "IIII", 7)
	}

	@Override
	public void hello() {
		String name = getName();
		String m = getMbti();
		int a = getAge();
		
		System.out.println("제 이름은 " +name+ "이고, " +m+ "이고, " +a+ "살 입니다.");
	}
	
	

}
