package com.jihe;

import java.util.HashSet;

public class E09 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add(" Jack ");
		set.add(" Eve ");
		set.add(" Rose ");
		set.add(" Rose ");
		System.out.println("来自哈希集的输出");
		set.forEach(o->System.out.print(o));
	}

}
