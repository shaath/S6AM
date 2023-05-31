package com.SeleniumProject.javaprogrammes;

public class PolindromeStringEg {

	public static void main(String[] args) {
		String str = "Malayalam";  //muineleS
		String rev = "";
		
		int len = str.length();
		for(int i = len - 1; i >= 0; i--)
		{
//			System.out.print(str.charAt(i));
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		if (rev.equalsIgnoreCase(str)) {
			System.out.println("The Given String is a polindrome");
		}else{
			System.out.println("The Given String is not a polindrome");
		}
	}

}
