package com.abstract_;
abstract class Animal{
	public abstract void shout();
}
class Dog extends Animal{
	@Override
	public void shout() {
		System.out.println("汪汪~~");
	}
}
class Cat extends Animal{
	@Override
	public void shout() {
		System.out.println("BiuBiuBiu~~");
	}
}
public class E12 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog .shout();

		Cat cat=new Cat();
		cat .shout();

	}

}
