package com.atuldwivedi.learn.jse.lang.annotations.predefined;

public class TVSBike implements Bike {

	@Override
	@Deprecated
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " started using kick.");
	}
	
	public void startUsingSelf(){
		System.out.println(this.getClass().getSimpleName() + " started using self.");
	}

	@Override
	public void move() {
		System.out.println(this.getClass().getSimpleName() + " is moving.");

	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " stoped.");

	}

	@Override
	public void changeGear() {
		System.out.println(this.getClass().getSimpleName() + " changing gear.");

	}

	@Override
	public void fuelUpTank() {
		System.out.println(this.getClass().getSimpleName() + " filling tank.");

	}

	// @Override
	public void bikeService() {
		System.out.println(this.getClass().getSimpleName() + " servicing.");
	}

}
