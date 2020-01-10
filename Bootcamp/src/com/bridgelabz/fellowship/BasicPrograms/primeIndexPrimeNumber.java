package com.bridgelabz.fellowship.BasicPrograms;

public class primeIndexPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=1,n=0,c;
		while(n<10)
		{
			j=1;c=0;
			while(j<=i)
			{
				if(i%j==0)
				{
					c++;
				}
				j++;
			}
			if(c==2)
			{
				System.out.print(i+" ");
				n++;
			}
			i++;
		}
		int a[]=new int[10];
		int flag;
		for (int k = 2; k < 10; k++)
		{
			flag=0;
			for (int k2 = 2; k2 < k/2; k2++)
			{
				if(k%k2==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(k);
			}
		}
	}

}
