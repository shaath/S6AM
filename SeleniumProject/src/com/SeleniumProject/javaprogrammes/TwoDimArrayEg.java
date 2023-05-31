package com.SeleniumProject.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) {
		
		Object[][] tArray = new Object[2][3];
		
		System.out.println("Rows length: " + tArray.length);
		System.out.println("Columns Length: " + tArray[0].length);
		
		tArray[0][1] = "Java";
		tArray[1][2] = "Selenium";
		
//		System.out.println(tArray[0][2]);
		
		for(int i = 0; i < tArray.length; i++)
		{
			for(int j = 0; j < tArray[i].length; j++)
			{
				System.out.println(tArray[i][j]);
			}
		}
		
	}

}
