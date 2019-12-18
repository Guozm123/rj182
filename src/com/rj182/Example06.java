package com.rj182;

public class Example06 {
//实现两个整数相加
		public static int add(int x, int y) {
			return x+y;
		}
//实现三个整数相加
		public static int add(int x, int y,int z) {
			return x+y+z;
		}
//实现两个小数相加
		public static double add(double x,double y) {
			return x+y;
		}
		
	public static void main(String[] args) {
// TODO 自动生成的方法存根
//针对求和方法的调用
		int sum1 = add(1,2);
		int sum2 = add(3,4,7);
		double sum3 = add(0.2,5.3);
//打印求和结果
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
	}

}
