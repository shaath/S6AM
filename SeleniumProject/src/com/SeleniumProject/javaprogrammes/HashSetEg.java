package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) {
		
		Set<Object> hs = new HashSet<>();
		
		hs.add("Selenium");
		hs.add("Apple");
		hs.add("Boll");
		hs.add(200000);
		hs.add("Apple");
		
//		hs.clear();
//		hs.remove("Boll");
//		
//		Iterator<Object> it = hs.iterator();
//		
//		while(it.hasNext())
//		{
//			Object data = it.next();
//			System.out.println(data);
//		}
		
		for(Object d: hs)
		{
			System.out.println(d);
		}

	}

}
