package com.SeleniumProject.javaprogrammes;

public class MethodsReuseEg {

	public static void main(String[] args) {
		MethodsEg.Function1();
		
		MethodsEg me = new MethodsEg();
		me.Function3();
		
		int res = me.sum(50, 60);
		System.out.println(res);
		
		res = me.sum(10, 30, 60);
		System.out.println(res);
	}

}
