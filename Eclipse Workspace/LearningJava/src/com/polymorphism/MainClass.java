package com.polymorphism;

public class MainClass {

	public static void main(String[] args) {
//		Phone phone = new Phone("Nokia 3310");
//		System.out.println(phone.getModel());
//		System.out.println(phone.features());
//		System.out.println(phone.getModel());
		
		SamsungNote8 sam = new SamsungNote8("Note 8");
		sam.features();
	}

	public Phone phone() {
		return null;
	
	}
}