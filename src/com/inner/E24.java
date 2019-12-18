package com.inner;

@FunctionalInterface
interface Calcable{
	int calc(int num);
}
//Math类已经实现了Calcable接口
class Math{
	public static int abs(int num) {
		//int calc(int num)
		if (num>=0) {
			return num;
		}
		else {
			return -num;
		}
	}
}
public class E24 {

	public static void main(String[] args) {
		printAbs(-50,n->Math.abs(n));
		printAbs(-40,Math::abs);
	}
	private static void printAbs(int i,Calcable c) {
		System.out.println(c.calc(i));
	}
}
