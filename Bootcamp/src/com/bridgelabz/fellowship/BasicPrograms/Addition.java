package com.bridgelabz.fellowship.BasicPrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1st number: ");
		int a=Utility.integerInput();
		System.out.println("Enter 2nd Number: ");
		int b=Utility.integerInput();
		Utility.add(a, b);
	}

}
