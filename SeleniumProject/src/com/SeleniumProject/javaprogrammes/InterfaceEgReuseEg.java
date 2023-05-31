package com.SeleniumProject.javaprogrammes;

public class InterfaceEgReuseEg {

	public static void main(String[] args) {
		InterfaceEg iei1 = new InterfaceEgImplementes1();
		iei1.aeroplane();

		InterfaceEg iei2 = new InterfaceEgImplements2();
		iei2.aeroplane();
	}

}
