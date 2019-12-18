package com.inner;
//函数式接口注解：表明注解下面的接口有且仅有一个抽象方法


import java.util.Locale.Category;
@FunctionalInterface
interface Animal{
	void shout();
}
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}
class Cat implements Animal {
	@Override
	public void shout() {
		System.out.println("喵喵~");	
	}
}
public class E21 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.shout();
		animalshout(new Animal() {
			@Override
			public void shout() {
				System.out.println("BiuBiuBiu~~");	
			}
		});
		animalshout(()->System.out.println("嗷嗷~~"));
		showSum(10,30,(x,y)->x+y);
	}
	
	private static void showSum(int x, int y, Calculate c) {
		// TODO 自动生成的方法存根
		System.out.println(x+"+"+y+"的和为:"+c.sum(x,y));
	}

	private static void animalshout(Animal animal) {
		animal.shout();
	}
}
