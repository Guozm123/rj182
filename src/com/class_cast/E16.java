package com.class_cast;
interface Animal{
	void shout();
	//void eatMan();
}
class Tiger implements Animal{
	@Override
	public void shout() {
		System.out.println("嗷~~~");
	}
	public void eatMan() {
		System.out.println("老虎吃人了呦");
	}
}
class Pig implements Animal{
	@Override
	public void shout() {
		System.out.println("哼哼~~");
	}

	
}
public class E16 {

	public static void main(String[] args) {
		Animal Pig=new Pig();
		if (Pig instanceof Tiger) {
			Tiger tiger=(Tiger) Pig;
			tiger.shout();
			tiger.eatMan();
		}
		else {
			System.out.println("这个不是老虎");
		}

	}

}
