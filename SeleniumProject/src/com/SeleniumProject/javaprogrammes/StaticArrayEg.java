package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) {
		
		String[]  monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

		System.out.println(monthNames.length);
		
//		System.out.println(monthNames[6]);
		for(int i = 0; i < monthNames.length; i++)
		{
			String name = monthNames[i];
			System.out.println(name);
		}
	}

}
