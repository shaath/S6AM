package com.SeleniumProject.javaprogrammes;

public class InheritanceEg extends MethodsEg{

	public static void main(String[] args) {
		
		Function1();
		MethodsEg.Function1();
		
		MethodsEg me = new MethodsEg();
		me.Function3();
//		me.Function1();
	}
	
	public static void Function1()
	{
		System.out.println("This is child class Fucntion1 code");
	}
}
