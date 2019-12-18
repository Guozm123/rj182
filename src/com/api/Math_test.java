package com.api;

public class Math_test {

	public static void main(String[] args) {
		System.out.println("-5.3的绝对值是"+Math.abs(-5.3));
		System.out.println("-5.3的正弦值是"+Math.sin(-5.3));
		System.out.println("4的平方根是"+Math.sqrt(4));
		System.out.println("27的立方根是"+Math.sqrt(27));
		System.out.println("3的4次方是"+Math.pow(3,4));
		//ceil:天花板 floor:地板
		System.out.println("求大于参数的最小整数"+Math.ceil(3.4));
		System.out.println("求小于参数的最小整数"+Math.ceil(3.4));
		System.out.println("对小数进行四舍五入后的结果"+Math.round(-8.6));
		System.out.println("求两个数的较大值"+Math.max(5.1,5.5));
		System.out.println("生成一个大于等于0.0小于1.0的随机值"+Math.random());
	}

}
