package com.bridgelabz.fellowship.DS;

import com.bridgelabz.fellowship.utility.Utility;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Expression: ");
		String s=Utility.StringInput();
		if(Utility.isBalanced(s))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
		
	}

}
