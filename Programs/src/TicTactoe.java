import java.util.*;
public class TicTactoe {

	static int player=0;
	static int Board[][]=new int[3][3];
	static boolean isEmpty=true;
	
	static void init()
	{
		for (int i = 0; i < Board.length; i++)
		{
			for (int j = 0; j < Board[i].length; j++)
			{
				Board[i][j]=-10;
			}
		}
	dispBoard();	
	}
	
	static void dispBoard()
	{
		int count=0;
		for (int i = 0; i < Board.length; i++) 
		{
			System.out.println("---------------");
			System.out.print("||");
			for (int j = 0; j < Board[i].length; j++)
			{
				if(Board[i][j]==0)
				{
					count++;
					System.out.print(" X |");
				}
				else if(Board[i][j]==1)
				{
					count++;
					System.out.print(" O |");
				}
				else
				{
					 System.out.print("   |");
				}
			}
			System.out.println("|");
		}
		if(count==9)
		{
			isEmpty=false;
		}
		System.out.println("---------------");
		
	}
	
	static void putValue()
	{
		int i;
		int j;
		
		if(player%2==1)
		{
			i=(int) (Math.random()*10)%3;
			j=(int) (Math.random()*10)%3;
		}
		else
		{
			System.out.println("Enter the value of X and Y by space");
			Scanner sc=new Scanner(System.in);
			i=sc.nextInt();
			j=sc.nextInt();
		}
		if(Board[i][j]==-10)
		{
			if(player%2==0)
			{
				Board[i][j]=0;
			}
			else
			{
				Board[i][j]=1;
				System.out.println("Computer Choose: "+i+" "+j);
			}
		}
		else
			putValue();
	}
	
	static boolean win()
	{
		return((Board[0][0]+Board[0][1]+Board[0][2])==player*3
			|| (Board[1][0]+Board[1][1]+Board[1][2])==player*3
			|| (Board[2][0]+Board[2][1]+Board[2][2])==player*3
			|| (Board[0][0]+Board[1][0]+Board[2][0])==player*3
			|| (Board[0][1]+Board[1][1]+Board[2][1])==player*3
			|| (Board[0][2]+Board[1][2]+Board[2][2])==player*3
			|| (Board[0][0]+Board[1][1]+Board[2][2])==player*3
			|| (Board[2][0]+Board[1][1]+Board[0][2])==player*3);
	}
	static void play()
	{
		init();
		while(isEmpty)
		{
			System.out.println("Player Turn");
			putValue();
			dispBoard();
			if(win())
				{
					System.out.println("Player Win");
					return;
				}
			player=1;
		System.out.println("Computer Turn: ");
		putValue();
		dispBoard();
		if(win())
		{
			System.out.println("Computer Win");
			return;
		}
		player=0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		play();
	}

}
