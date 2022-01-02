package com.Inheritance;

public class Animal {
	
	private float height;
	private float weight;
	private String animalType;
	private String bloodType;
	
	public Animal() {
		this.height = 0;
		this.weight = 0;
		this.animalType = "unknown";
		this.bloodType = "unknown";
	}
	
	public Animal(float height, float weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public String getAnimalType() {
		return animalType;
	}

	public String getBloodType() {
		return bloodType;
	}
	
	public String showInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
}
