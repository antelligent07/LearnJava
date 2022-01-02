package com.Inheritance;

public class Birds extends Animal {

		private String feathers;
		private String canFly;
		
		public Birds() {
			super();
			this.feathers = "yes";
			this.canFly = "yes";
		}
		
		public Birds(float height, float weight, String animalType, String bloodType, String feathers, String canFly) {
			super(height, weight, animalType, bloodType);
			this.feathers = feathers;
			this.canFly = canFly;
		}
		public String getFeathers() {
			return feathers;
		}
		public String getCanFly() {
			return canFly;
		}
		
		
}
