package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		Object[] dArray = new Object[5];
		//Getting length of the array
		System.out.println(dArray.length);
		//Writing the data into Array
		dArray[1] = "Selenium";
		dArray[3] = 200000;
		dArray[1] = "Java";
		
		//Reading the data from an array
		Object x = dArray[1];
		System.out.println(dArray[1]);
		
		for(Object index: dArray)
		{
			System.out.println(index);
		}
	}

}
