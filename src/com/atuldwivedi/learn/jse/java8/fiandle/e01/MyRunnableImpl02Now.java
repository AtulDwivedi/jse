package com.atuldwivedi.learn.jse.java8.fiandle.e01;

public class MyRunnableImpl02Now {

	/**
	 * This is implementation of Runnable interface using Lambda Expression (LE)
	 */
	Runnable r1 = () -> {

		System.out.println(">> " + this.getClass().getSimpleName() + " run()");
		System.out.println("Running/executing the thread.");
		System.out.println("<< " + this.getClass().getSimpleName() + " run()");

	};

	
	Runnable r2 = () -> System.out.println("I've only one statement so don't need curly braces.");
}
