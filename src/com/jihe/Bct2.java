package com.jihe;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Customparator implements Comparator<Object>{
	@Override
	public int compare(Object o1,Object o2) {
		String key1=(String)o1;
		String key2=(String)o2;
		return key2.compareTo(key1);
	}
}
public class Bct2 {

	public static void main(String[] args) {
		Map<String,String> map = new TreeMap<String,String>(new Customparator());
		map.put("1", "Lucy");
		map.put("2", "John");
		map.put("3", "Smith");
		map.put("4", "Aimee");
		map.put("5", "Amanda");
		System.out.println(map);
		System.out.println("用双键集遍历双列集合的见和值");
		Set<String> jianji=map.keySet();
		Iterator<String> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key=(Object)diedai.next();
			Object value=map.get(key);
			System.out.print(key+":"+value);
		
		}
		}
	}

	
