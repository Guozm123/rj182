package com.final_;
 class Animal{
	 //如果一个成员变量被final修饰，则该变量在本类不能修改
	 final String name="动物";
	public void shout() {}
	//从写object类的toString()的放法
	@Override
		public String toString(){
			return "这是一个动物";	
	}
}
class Dog extends Animal{
	String name="皮卡丘";
	@Override
	public void shout(){}
	@Override
	public String toString(){
		return "这是一只皮卡丘";	
}
}
public class E08 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		Dog xg=new Dog();
		System.out.println(dw.toString());
		System.out.println(xg.toString());
		
	}

}
