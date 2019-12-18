package com.jihe;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparaor implements Comparator<Object>{
	public int compare(Object obj1,Object obj2) {
		String s1=(String) obj1;
		String s2=(String) obj2;
		int temp=s1.length() -s2.length();
		return temp;
	}
}
public class TeeSet_test3 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new MyComparaor());
		ts.add("Jack");
		ts.add("Helena");
		ts.add("Eve");
		System.out.println(ts);
		TreeSet<String> ts2 = new TreeSet<String>((obj1,obj2)->{
			String s1 = (String) obj1;
			String s2 = (String) obj2;
			return s1.length()-s2.length();
		});
		ts2.add("Jack");
		ts2.add("Helena");
		ts2.add("Eve");
		System.out.println(ts2);
	}

}
