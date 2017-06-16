package com.atuldwivedi.learn.jse.iq;

public class Palindrome {

	public static void main(String[] args) {
		String str = "abababababa";

		boolean result = checkPalindromeUsingRecursion(str);
		System.out.println(result);

		result = checkPalindromeUsingStringBuilder(str);
		System.out.println(result);
	}

	private static boolean checkPalindromeUsingStringBuilder(String str) {
		return str.equals((new StringBuilder(str)).reverse().toString());
	}

	private static boolean checkPalindromeUsingRecursion(String str) {
		int strLength = str.length();
		for (int i = 0; i < strLength / 2; i++) {
			if (str.charAt(i) != str.charAt(strLength - i - 1))
				return false;
		}
		return true;
	}

}
