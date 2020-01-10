package com.bridgelabz.fellowship.BasicPrograms;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++)
		{
			int c=1;
			for (int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 5; k >=i; k--)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();

			if(i==2)
				break;
		}
		for (int i = 2; i <=4; i++) 
		{
			
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = i; k <=4; k++) 
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
