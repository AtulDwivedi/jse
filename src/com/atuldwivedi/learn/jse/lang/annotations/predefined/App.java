package com.atuldwivedi.learn.jse.lang.annotations.predefined;

public class App {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TVSBike tvsBike = new TVSBike();
		tvsBike.fuelUpTank();;
		tvsBike.startUsingKick();
		tvsBike.changeGear();
		tvsBike.stop();
		tvsBike.bikeService();
	}
}
