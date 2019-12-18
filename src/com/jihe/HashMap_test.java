package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_test {

	public static void main(String[] args) {
			Map<Object, Object> map = new HashMap<>();
			map.put("1", "Jack");
			map.put("2", "Rose");
			map.put("3", "Lucy");
			map.put("4", "Lucy");
			map.put("1", "Tom");
			System.out.println(map);
			System.out.println(map.containsKey("1"));
			System.out.println(map.get("1"));
			System.out.println(map.keySet());
			System.out.println(map.values());
			
			if(map.containsKey("1")) {
				System.out.println("这个双列集合包含键1");
				System.out.println("这个双列集合包中键1的值是"+map.get("1"));	
			}
			System.out.println("这个双列集合中所有键的集合是"+map.keySet());
			System.out.println("这个双列集合中所有键的集合是"+map.values());
			map.replace("1","Andy");
			System.out.println(map);
			
			map.remove("1");
			System.out.println(map);
			
			System.out.println("用双键集遍历双列集合的见和值");
			Set<Object> jianji=map.keySet();
			Iterator<Object> diedai=jianji.iterator();
			while (diedai.hasNext()) {
				Object key=(Object)diedai.next();
				Object value=map.get(key);
				System.out.print(key+":"+value);
			}
			System.out.println("用键值对集遍历双列集合的键和值");
			Set<?> jianzhiduiji=map.entrySet();
			Iterator<?> diedai2=jianzhiduiji.iterator();
			while (diedai2.hasNext()) {
				@SuppressWarnings("rawtypes")
				Map.Entry jianzhidui = (Map.Entry) diedai2.next();
				Object key=jianzhidui.getKey();
				Object value=jianzhidui.getValue();
				System.out.print(key+":"+value);
			}
			System.out.println("用foreach键值对集遍历双列集合的键和值");
			map. forEach((key,value)->System.out.println(key+":"+value));
			
			System.out.println("用foreach键值对集遍历双列集合的所有值");
			Collection<Object> zhiji=map.values();
			zhiji.forEach(value->System.out.println(value));
	
	Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
	map2.put(2,"Rose");
	map2.put(2,"Jack");
	map2.put(2,"Lucy");
	map2.forEach((key,value)->System.out.println(key+":"+value));
	}
}
