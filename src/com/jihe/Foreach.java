package com.jihe;

public class Foreach {
static String [] strings= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		for (@SuppressWarnings("unused") String str:strings) {
			str="ddd";
		}
		System.out.println("foreach循环修改后的数组："+strings[0]+","+strings[1]+","+strings[2]);
	
		for (int i=0;i<strings.length;i++) {
			strings[i]="ddd";
		}
		System.out.println("普通for循环修改后的数组："+strings[0]+","+strings[1]+","+strings[2]);
	}
	
}
