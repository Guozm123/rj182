package com.chapter4;
class Animal_1{
	public Animal_1(String name) {
		System.out.println("我是一只"+name);
	}
}
class Dog_1 extends Animal_1{
	public Dog_1() {
		super("泰迪");
	}
}
public class E02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog_1 dog = new Dog_1();

	}

}
