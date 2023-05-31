package com.SeleniumProject.javaprogrammes;

public class StringEg {

	public static void main(String[] args) {
		
		String course = "   Selen ei eum   ";
		
		System.out.println(course.length());
		System.out.println(course.charAt(4));
		System.out.println(course.indexOf('e'));
		System.out.println(course.lastIndexOf('e'));
		
		System.out.println(course.substring(2, 5));
		System.out.println(course.toUpperCase());
		System.out.println(course.toLowerCase());
		
		System.out.println(course.replace(" ", ""));
		System.out.println(course.replace("e", "X"));
		System.out.println(course.replaceFirst("e", "X"));
		
		System.out.println(course.replace('e', 'X'));
		
		String x = course.trim();
		System.out.println(x);
		System.out.println(x.length());
		
		System.out.println(course.isEmpty());
		
		System.out.println(course.equalsIgnoreCase("   seLen ei eum   "));
		
		System.out.println(course.contains("len"));
		
		String y = "Created order with 350 successfully";

		System.out.println(y.endsWith("susfully"));
		
		System.out.println(course.concat(y));
		
		System.out.println(course.join("$$$$", course, y, "Hello", "Welcome"));
		
		System.out.println(y + " " + "Java");
	}

}
