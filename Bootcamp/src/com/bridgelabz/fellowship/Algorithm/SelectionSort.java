package com.bridgelabz.fellowship.Algorithm;

import com.bridgelabz.fellowship.utility.Utility;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array: ");
		int n=Utility.integerInput();
		int a[]=new int[n];
		System.out.println("Entre "+n+" Elements:");
		for (int i = 0; i < a.length; i++) {
			a[i]=Utility.integerInput();
		}
		System.out.println("After Selection Sort: ");
		Utility.selectionSort(a);
	}

}
