package com.static_element;

public class App {
	public static void main(String[] args) {
		System.out.println("hello");
		
		TestStatic test = new TestStatic();
		
		System.out.println(test.getStaticVariable());
		test.setStaticVariable(5);
		System.out.println(test.getStaticVariable());
	}
}
