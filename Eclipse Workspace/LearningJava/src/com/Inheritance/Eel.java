package com.Inheritance;

public class Eel extends Fish{
	
	private String releasesElectricCharge;

	public Eel() {
		super();
		this.releasesElectricCharge = "yes";
	}

	public String getReleasesElectricCharge() {
		return releasesElectricCharge;
	}
	
//	public String showInfo() {
//		System.out.println("");
//	}
}
