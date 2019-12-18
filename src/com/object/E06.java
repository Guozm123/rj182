package com.object;
class Animal extends java.lang.Object{
	void shout() {
		System.out.println("动物叫");
	}
	@Override
	public String toString() {
		return "这是一只动物";
	}
}
public class E06 {
	
	public static void main(String[] args) {
		Animal dw=new Animal();//创建Animal类的对象
		Animal dw2=new Animal();
		System.out.println(dw.toString());
		System.out.println(dw2.toString());//调用toString（）方法并打印
	}

}
