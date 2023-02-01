package com.kh.person;

public class SongJunSub extends Person{

	
	
	
	public SongJunSub() {
		super("송준섭", "ENFP", 20);
	}

	@Override
	public void hello() {
		String name = getName();
		String m = getMbti();
		int a = getAge();
		System.out.println("제 이름은 "+name+"이고, "+m+" 이고,"+ a+"살입니다.");
		
	}

}
