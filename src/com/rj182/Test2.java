package com.rj182;//package:包  只能放在首行
/*
紫色的代码是关键字
褐色代码是参数或局部变量
蓝色代码是成员变量，它的地位比局部变量高，地位同成员方法一样
黑色的代码是标示符：包名（com，yj182），类名（首字母要大写），方法名（main，println），整型字面量
*/
public class Test2 {//class：类     public：修饰符，表示公有

	public static void main(String[] args) {//static：修饰符表示静态的  
		//void:空的 表示该方法没有返回值
		// TODO 自动生成的方法存根
		byte a=1;
		short b=1;
		int c=1;
		long d=1;
		float f=1.0f; //1.0
		double x=1.0;
		
		char h='a';//用单引号将字符常量括起来
		char hi=97;
		short hh=97;
		
		boolean flag1=true;
		boolean flag2=false;
		
		System.out.println(h);
		System.out.println(hi);
		System.out.println((char)hh);
		System.err.println("字节型整型数据的长度"+Byte.SIZE);
		System.err.println("段数型整型数据的长度"+Short.SIZE);
		System.err.println("整型数据的长度"+Integer.SIZE);
		System.err.println("长整型数据的长度是"+Long.SIZE);
		
		System.err.println("单精度浮点的长度是"+Float.SIZE);
		System.err.println("双精度浮点的长度是"+Double.SIZE);
		
		System.err.println("字符型数据的长度是"+Character.SIZE);
		
		System.err.println("字节型整型数据的长度"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.err.println("段数型整型数据的长度"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.err.println("整型数据的长度"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.err.println("长整型数据的长度是"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);

		System.err.println("单精度浮点的长度是"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		System.err.println("双精度浮点的长度是"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
		
		System.err.println("字符型数据的长度是"+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
		//字符型可以转换成整形，布尔型不可以转换整形
		System.err.println("字符型数据的长度是"+Boolean.TRUE+"-"+Boolean.FALSE);
				
	}

}
