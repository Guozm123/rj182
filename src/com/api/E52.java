package com.api;

public class E52 {

	public static void main(String[] args) {
		String s="abcacbcab";
		System.out.println("字符串的长度为："+s.length());
		System.out.println("字符串中的第一个字符"+s.charAt(0));
		System.out.println("字符c第一次出现的位置："+s.indexOf('c'));
		System.out.println("字符c最后一次出现的位置："+s.lastIndexOf('c'));
		System.out.println("子字符第一次出现的位置："+s.indexOf("ab"));
		System.out.println("子字符串最后一次出现的位置"+s.lastIndexOf("ab"));
		// TODO 自动生成的方法存根

	}

}
