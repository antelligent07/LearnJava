package com.composition;

public class MainClass {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		//System.out.println(laptop.getProcessor().getBrand());
		
		Processor gamingLaptopProcessor = new Processor("Intel", "7200U", 7, 4, 4, "6MB", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		GraphicsCard gamingLaptopGraphicsCard = new GraphicsCard("Nvidia", 1050, "4GB");
		Laptop gamingLaptop = new Laptop(17f, gamingLaptopProcessor, "DDR4", "2TB", gamingLaptopGraphicsCard, "null", "backlit");
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();
		System.out.println(gamingLaptop.getProcessor().getFrequency());
	}

}
