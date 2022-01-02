package com.Inheritance;

public class Crocodile extends Reptile{
	
	public Crocodile(float height, float weight, String animalType, String bloodType, String skinType, String backbone, String eggType) {
		super(height, weight, animalType, bloodType, skinType, backbone, eggType);
	}
	
	public String showInfo() {
		System.out.println("Skin: " + super.getSkinType() + "\nBackbone: " + super.getBackbone() + "\nEgg Type: " + super.getEggType());
		return "";
	}
}
