package com.rj182;

import java.io.StringBufferInputStream;

public class Operator {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i=1;
		int j=1;
		System.out.println("后加i++"+(i++));
		System.out.println("先加++j"+(++j));
		System.out.println("不管先加还是后加以后变量都加1，i="+i);
		System.out.println("不管先加还是后加以后变量都加1，i="+j);
		//赋值运算符
		int a=2;
		a+=3;//等价于a=a+3
		System.out.println(a);
		//比较运算符
		String s1="hello";
		String s2="hello";
		E01 e1=new E01();
		E01 e2=new E01();
		System.out.println(s1==s2);
		System.out.println(e1==e2);
	}

}
