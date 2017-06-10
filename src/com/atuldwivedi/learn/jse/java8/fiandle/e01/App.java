package com.atuldwivedi.learn.jse.java8.fiandle.e01;

public class App {

	public static void main(String[] args) {
		MyRunnableImpl01 myRunnableImpl01 = new MyRunnableImpl01();
		Thread tMyRunnableImpl01 = new Thread(myRunnableImpl01);
		
		tMyRunnableImpl01.start();
		
		MyRunnableImpl02 myRunnableImpl02 = new MyRunnableImpl02();
		Thread tMyRunnableImpl02 = new Thread(myRunnableImpl02.r);
		
		tMyRunnableImpl02.start();
		
		
		MyRunnableImpl02Now myRunnableImpl02Now = new MyRunnableImpl02Now();
		Thread tMyRunnableImpl02NowR1 = new Thread(myRunnableImpl02Now.r1);
		Thread tMyRunnableImpl02NowR2 = new Thread(myRunnableImpl02Now.r2);
		
		tMyRunnableImpl02NowR1.start();
		tMyRunnableImpl02NowR2.start();
	}
}
