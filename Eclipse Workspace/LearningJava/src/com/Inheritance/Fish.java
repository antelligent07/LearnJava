package com.Inheritance;

public class Fish extends Animal {
	
	private String livesIn;
	private String hasGills;
	
	public Fish() {
		super();
		this.livesIn = "Water";
		this.hasGills = "yes";
	}
	
	public Fish(float height, float weight, String animalType, String bloodType, String livesIn, String hasGills) {
		super(height, weight, animalType, bloodType);
		this.livesIn = livesIn;
		this.hasGills = hasGills;
	}

	public String getLivesIn() {
		return livesIn;
	}

	public String getHasGills() {
		return hasGills;
	}
}
