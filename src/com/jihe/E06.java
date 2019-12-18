package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class E06 {

	public static void main(String[] args, Object obj) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Jack");
		list.add("Annie");
		list.add("Rose");
		list.add("Tom");
		Iterator<String> iterator=list.iterator();
		while (iterator.hasNext()) {
			@SuppressWarnings("unused")
			Object object=iterator.next();
			if("Annie".equals(obj)) {
				list.remove(obj);
			}
		}
	
	}

}
