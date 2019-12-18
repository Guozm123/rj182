package com.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class E_25 {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		Collections.addAll(list,"C","Z","B","K");
		System.out.println("排序前："+list);
		Collections.reverse(list);
		System.out.println("反转后:"+list);
		Collections.sort(list);
		System.out.println("按自然顺序排序后:"+list);
		Collections.shuffle(list);
		System.err.println("按随机顺序排序后"+list);
		Collections.swap(list, 0,list.size()-1);
		System.out.println("集合首位元素交换后:"+list);
		
		
		ArrayList<Integer>list1=new ArrayList<>();
		Collections.addAll(list1,-3,2,9,5,8);
		System.out.println("集合中元素:"+list1);
		System.out.println("集合中的最大元素:"+Collections.max(list1));
		System.out.println("集合中的最小元素:"+Collections.min(list1));
		Collections.replaceAll(list1,8,0);
		System.out.println("替换后的集合:"+list1);
		Collections.sort(list1);
		System.out.println("集合排序后："+list1);
		int index=Collections.binarySearch(list1,9);
		System.out.println("集合通过二分查找方法查找元素9所在角标为"+index);
		

	}

}
