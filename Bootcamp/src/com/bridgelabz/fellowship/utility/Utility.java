package com.bridgelabz.fellowship.utility;
import java.util.*;
public class Utility {
	static Scanner sc=new Scanner(System.in);
//********************************************************	
	public static int integerInput()
	{
		return sc.nextInt();
	}
	public static String StringInput()
	{
		return sc.nextLine();
	}
	public static float floatInput()
	{
		return sc.nextFloat();
	}
	public static double doubleInput()
	{
		return sc.nextDouble();
	}
	public static long longInput()
	{
		return sc.nextLong();
	}
	
//	**************Leap Year*******************
	public static void leapYear(int y)
	{
		if((y%400==0) || (y%4==0 && y%100!=0))
			System.out.println(y+" is Leap Year");
		else
			System.out.println(y+" is Not Leap Year");
	}
	
// ****************Harmonic Series***************
	
	public static void HarmonicSeries(int n)
	{
		for (int i = 1; i < n; i++)
		{
			System.out.print("1/"+i+"+");
		}
		System.out.println("1/"+n);
	}
	
// *****************FlipCoin*************************
	public static void FlipCoin(int n)
	{
		int head=0;
		int tail=0;
		for (int i = 0; i < n; i++) {
			if(Math.random()<0.5)
				head++;
			else
				tail++;
		}
		System.out.println("Head: "+head);
		System.out.println("Tails: "+tail);
	}

// **********************Prime Factor*****************
	public static void primeFactor(int n)
	{
		for (int i = 2; i < n; i++)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
		}
		if(n>2)
			System.out.println(n);
	}
// *****************Poawer Of *****************************
	public static void powerOf(int number)
	{
		int i;
		int power=0;
		if(number<31)
		{
			for ( i = 0; i <= number; i++) 
			{
				 power=(int) Math.pow(2, i);
			}
			System.out.println("Power Of 2 Upto : "+(i-1)+" is "+ power);
		}
	}
// *****************Addition Of Two Number******************
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Add: "+c);
	}
// ********************String Replace************************
	public static void strReplace(String s)
	{
		String str="Hello, Username How Are You?";
		String rp=str.replace("Username", s);
		System.out.println(rp);
	}
// *****************BubbleSort***************************
	public static void bubbleSort(int[] a)
	{
		int n=a.length;
		for (int i = 0; i < n-1; i++)
		{
			for (int j = 0; j < n-i-1; j++)
			{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
// *************************Insertion Sort*******************
	public static void insertionSort(int a[])
	{
		for (int i = 1; i < a.length; i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
// *********************Selection Sort*****************************
	public static void selectionSort(int a[])
	{
		for (int i  = 0;  i< a.length-1; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			if(i!=min)
			{
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
//***********************Triplets***********************************
	public static void triplets(int a[])
	{
		System.out.println("Triplets are: ");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				for (int k = j+1; k < a.length; k++) 
				{
					if(a[i]+a[j]+a[k]==0)
						System.out.println(a[i]+" , "+a[j]+" and "+a[k]);
				}
			}
		}
	}
// *****************Number Palindrome********************************
	public static void isPalindrome(int n)
	{
		int rev=0;
		int x;
		int temp=n;
		while(n>0)
		{
			x=n%10;
			rev=(rev*10)+x;
			n/=10;
		}
		if(rev==temp)
			System.out.println("Is palindrome");
		else
			System.out.println("is Not Palindrome");
	}
// **********************String Palindrome**********************
	public static boolean isstringPalindrome(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
// *************************Prime Number*****************************
	public static void primeNumber(int n)
	{
		int flag;
		for (int i = 2; i < n; i++)
		{
			flag=0;
			for (int j = 2; j<i/2; j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}
	
// ******************************BalancedParenthesis********************************
	
	public static boolean isBalanced(String s)
	{
		char[] ch=s.toCharArray();
		Stack<Character> st=new Stack<Character>();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]=='(')
				st.push(ch[i]);
			if(ch[i]==')')
			{
				if(st.isEmpty())
				{
					return false;
				}
			st.pop();
			}
		}
		if(st.isEmpty())
			return true;
		else
		{
			return false;
		}
	}
}
