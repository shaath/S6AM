package com.SeleniumProject.javaprogrammes;

public class WhileEg {

	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 500)
		{
			System.out.println(i);
			if(i == 350)
			{
				break;
			}
			i++;
		}
		System.out.println("****");
		int j = 500;
		
		while(j >= 1)
		{
			System.out.println(j);
			j--;
			if(j==250)
			{
				break;
			}
		}

	}

}
