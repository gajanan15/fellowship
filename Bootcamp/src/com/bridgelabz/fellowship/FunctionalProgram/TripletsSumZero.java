package com.bridgelabz.fellowship.FunctionalProgram;

import com.bridgelabz.fellowship.utility.Utility;

public class TripletsSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entre size of array: ");
		int n=Utility.integerInput();
		int a[]=new int[n];
		System.out.println("Enter "+n+" Elements");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=Utility.integerInput();
		}
		Utility.triplets(a);
	}

}
