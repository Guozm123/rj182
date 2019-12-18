package com.api;

import java.util.Random;

public class Random_test {

	public static void main(String[] args) {
		System.out.println("随机生成[0,1,)之间的一个浮点数"+Math.random());
		Random r=new Random();
		System.out.println("随机生成[0,1)之间的一个浮点数"+r.nextDouble());
		//生成整数
		System.out.println("随机生成-21亿到21亿之间的一个整数"+r.nextInt());
		System.out.println("随机生成10以内不包括0的一个整数"+r.nextInt(10));
	}

}
