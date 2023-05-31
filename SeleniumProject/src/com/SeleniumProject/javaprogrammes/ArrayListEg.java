package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add("Selenium");
		al.add(200000);
		al.add(true);
		al.add("Apple");
		al.add("Java");
		al.add(5, "Boll");
		al.add("Apple");
		
//		al.clear();
//		al.remove(2);
		al.set(2, "Welcome");
		System.out.println(al.get(2));
		
		System.out.println(al.size());
		System.out.println(al.indexOf("Boll"));
//		System.out.println(al.get(1));
		for(int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}

	}

}
