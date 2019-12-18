package com.rj182;

public class Recursive {
// 求和递归方法：在方法的内部调用方法自己，叫做方法的递归
	public static int getSum(int n) {
		if (n==1) {
			return 1;
		}
		int temp = getSum(n-1);
		return temp+n;
	}
	//getSum(4) temp=getSum(3)=6 temp+4
	//getSum(3) temp=getSum(2)=3 temp+3
	//getSum(2) temp=getSum(1)=1 temp+2
	//getSum=(1)
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			int sum = getSum(4);
			System.out.println("sum="+sum);
	}

}
