import java.util.*;
public class NumberDemo {

	public static int[] Random(int n)
	{
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=(int) (0+Math.random()*n);
			System.out.println(a[i]);
		}
		//Decending(a);
		return a;
		
	}
	public static void Decending(int a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]=new int[10];
		
		//Random(10);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No: ");
		int n=sc.nextInt();
		//int n=Integer.parseInt(args[0]);
		Decending(Random(n));
		
	}

}
