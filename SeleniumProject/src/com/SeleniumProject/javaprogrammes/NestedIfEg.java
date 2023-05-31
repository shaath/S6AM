package com.SeleniumProject.javaprogrammes;

public class NestedIfEg {

	public static void main(String[] args) {
		int a = 30;
		int b = 40;
		int c = 40;
		
		if(a > b && a > c)
		{
			System.out.println("A is Greater");
		}
		else if (b > a && b > c) 
		{
			System.out.println("B is Greater");
		}
		else if (c > a && c > b)
		{
			System.out.println("C is Greater");
		}
		else
		{
			System.out.println("Give proper values to compare");
		}
		

	}

}
