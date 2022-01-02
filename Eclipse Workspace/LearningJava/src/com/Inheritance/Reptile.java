package com.Inheritance;

public class Reptile extends Animal{
	
	private String skinType;
	private String backbone;
	private String eggType;
	
	public Reptile() {
		
		super();
		this.skinType = "Dry";
		this.backbone = "yes";
		this.eggType = "soft";
	}

	public Reptile(float height, float weight, String animalType, String bloodType, String skinType, String backbone, String eggType) {
		super(height, weight, animalType, bloodType);
		this.skinType = skinType;
		this.backbone = backbone;
		this.eggType = eggType;
	}

	public String getSkinType() {
		return skinType;
	}

	public String getBackbone() {
		return backbone;
	}

	public String getEggType() {
		return eggType;
	}

}
