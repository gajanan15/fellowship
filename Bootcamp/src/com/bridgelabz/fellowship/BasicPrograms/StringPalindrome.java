package com.bridgelabz.fellowship.BasicPrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String: ");
		String s=Utility.StringInput();
		if(Utility.isstringPalindrome(s))
			System.out.println("is palindrome");
		else
			System.out.println("is Not Palindrome");
	}

}
