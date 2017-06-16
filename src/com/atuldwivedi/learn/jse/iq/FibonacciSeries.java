package com.atuldwivedi.learn.jse.iq;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number = 13;
		boolean isFbonaciNumner = checkFibonaciNumber(number);
		System.out.println(isFbonaciNumner);
	}

	private static boolean checkFibonaciNumber(int number) {
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum = 0;
		
		while(thirdNum < number){
			thirdNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;
		}
		
		if(thirdNum == number)
			return true;
		return false;
	}

}
