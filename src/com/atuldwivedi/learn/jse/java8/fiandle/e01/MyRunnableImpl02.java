package com.atuldwivedi.learn.jse.java8.fiandle.e01;

public class MyRunnableImpl02{

	

		Runnable r = new Runnable() {

			public void run(){
				System.out.println(">> "+this.getClass().getSimpleName()+" run()");
				System.out.println("Running/executing the thread.");
				System.out.println("<< "+this.getClass().getSimpleName()+" run()");
			}
		};
	
}
