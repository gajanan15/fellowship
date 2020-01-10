package com.bridgelabz.fellowship.Algorithm;

import com.bridgelabz.fellowship.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Size of array:");
		int n=Utility.integerInput();
		int a[]=new int[n];
		System.out.println("Enter "+n+" elemenst:");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=Utility.integerInput();
		}
		System.out.println("Afetr Insertion Sort : ");
		Utility.insertionSort(a);
	}

}
