package com.interface_;
//接口关键字：interface
interface Animal{
	//接口的成员变量声明时，可以省略public static final
	int ID=1;
	//接口的普通成员方法声明时可以省略public abstract 两个关键字
	void shout();
	//接口内不能有普通方法，可以有静态方法
	static int getID() {
		return Animal.ID;
	}		
}
interface LandAnimal extends Animal{
	void run();
}
//实现接口的功能用implements关键字
class Dog implements LandAnimal{
	@Override
	public void shout() {
		System.out.println("汪汪~~");
	}
	@Override
	public void run() {
		System.out.println("小狗在跑");
	}
}
class Cat implements Animal{
	@Override
	public void shout() {
		System.out.println("BiuBiuBiu~~");
	}
}
public class E13 {

	public static void main(String[] args) {
		System.out.println(Animal.getID());
		Dog dog=new Dog();
		dog .shout();
		dog.run();
		Cat cat=new Cat();
		cat .shout();

	}
}
