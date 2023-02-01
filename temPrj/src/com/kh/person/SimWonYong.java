package com.kh.person;

public class SimWonYong extends Person {

	public SimWonYong() {
		super("심원용", "ENFP", 20);
	}

	@Override
	public void hello() {
		String name = getName();
		String m = getMbti();
		int a = getAge();
		System.out.println("제 이름은 " + name + " 이고 , " + m + " 이고 , + " + a + " 살 입니다.");
	}

}
