package com.kh.person;

public class Yoonyerin extends Person {
	
	public Yoonyerin() {
		super("예린","ESFP",25);
	}
	
	@Override
	public void hello() {
		String name=getName();
		String m = getMbti();
		int a = getAge();
		System.out.println("감히 "+getName()+"갖고 흔들어");
		System.out.println("아원츄베 아원츄 아원츄베 아원츄 고원츄르 고원츄르");
		System.out.println("좋다싫다아님정말모르겠음모르겠다해");
		System.out.println("삼성전자삼성전자삼성전자삼성전자상성전자상정전자~ 우~");
	}

}
