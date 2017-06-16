package com.atuldwivedi.learn.jse.lang.string;

public class ReverseTheString {
	public static void main(String[] args) {
		String str = "Hello";
		String revStr = "";
		
		revStr = reverseUsingArray(str);
		System.out.println(revStr);
		
		revStr = reverseUsingRecursion(str);
		System.out.println(revStr);
		
		revStr = reverseUsingStringBuffer(str);
		System.out.println(revStr);
	}

	private static String reverseUsingStringBuffer(String str) {
		return new StringBuffer(str).reverse().toString();
	}

	private static String reverseUsingRecursion(String str) {
		String retVal = "";
		if(null == str || str.length() == 1)
			return str;
		
		return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
	}

	private static String reverseUsingArray(String str) {
		String retVal = "";
		char[] strChar = str.toCharArray();
		for (int i = strChar.length-1; i >= 0; i--) {
			retVal = retVal + strChar[i];
		}
		return retVal;
	}
}
