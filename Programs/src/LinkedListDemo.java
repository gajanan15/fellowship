
import java.util.*;
class Node
{
	private int data;
	private Node next;
	
	Node()
	{
		data=0;
		next=null;
	}
	Node(int data,Node next)
	{
		this.data=data;
		this.next=next;
	}
	
	void  setdata(int data)
	{
		this.data=data;
	}
	int getdata()
	{
		return data;
	}
	void setnext(Node next)
	{
		this.next=next;
	}
	Node getnext()
	{
		return next;
	}
}
class LinkedList
{
	private Node start;
	private int size;
	
	LinkedList()
	{
		size=0;
		start=null;
	}
	//check empty or not
	boolean isEmpty()
	{
		if(start==null)
			return true;
		else
			return false;
	}
	
	//return size
	int getsize()
	{
		return size;
	}
	//Add Element at First
	void addFirst(int data)
	{
		Node n=new Node(data, null);
		n.setnext(start);
		start=n;
		size++;
	}
	//Add Elements At Last
	void addLast(int data)
	{
		Node t=start;
		if(t==null)
			addFirst(data);
		else
		{
		while(t.getnext()!=null)
			t=t.getnext();
		Node n=new Node(data,null);
		t.setnext(n);
		}
		size++;
	}
	//Add Elements User Enter position
	void addAtPosition(int data,int pos)
	{
		if(start==null)
			System.out.println("List list empty");
		else if(pos==1)
			addFirst(data);
		else if(pos==size+1)
			addLast(data);
		else if(pos>1 && pos<= size)
		{
			Node t=start;
			Node n=new Node(data,null);
			for (int i = 1; i < pos-1; i++)
			{
				t=t.getnext();
			}
			n.setnext(t.getnext());
			t.setnext(n);
			size++;
		}
	}
	//Add After Specific Node
	void addAfter(int data,int next)
	{
		Node t=start;
		while(t!=null)
		{
			if(t.getdata()==next)
				break;
			t=t.getnext();
		}
		if(t==null)
			System.out.println("Node Not Found");
		else
		{
			Node n=new Node(data,null);
			n.setnext(t.getnext());
			t.setnext(n);
		}
		size++;
	}
	//reverse list
	void reverse()
	{
		Node curr,prv,next;
		curr=start;
		prv=next=null;
		 
		while(curr!=null)
		{
			next=curr.getnext();
			curr.setnext(prv);
			prv=curr;
			curr=next;
		}
		start=prv;	
	}
	//Delete Dulicate Node
	void deleteDuplicate()
	{
		Node c,t,t1=null;
		c=start;
		while(c!=null)
		{
			t=c;
			while(t!=null && t.getdata()==c.getdata())
			{
				t1=t;
				t=t.getnext();
			}
			t.setnext(t.getnext());
			size--;
		}
		
	}
	
	//delete First
	void deleteFirst()
	{
		start=start.getnext();
		size--;
	}
	
	//deleteAt Last
	void deleteLast()
	{
		if(start==null)
			System.out.println("List is Empty");
		else if(size==1)
		{
			start=null;
			size--;
		}
		else 
		{
			Node t=start;
			for (int i = 1; i < size-1; i++)
			{
				t=t.getnext();
			}
			t.setnext(null);
		}
		size--;
	}
	
	//deleteAt Position
	void deleteAtPosition(int pos)
	{
		if(start==null)
			System.out.println("List is empty");
		else if(pos<1 || pos>size)
			System.out.println("Invalid");
		else if(pos==1)
			deleteFirst();
		else if(pos==size)
			deleteLast();
		else
		{
			Node t,t1;
			t=start;
			for (int i = 1; i < pos-1; i++)
				t=t.getnext();
			t1=t.getnext();
			t.setnext(t1.getnext());
			size--;
		}
	}
	//smallest value
	
	int smallNode()
	{
		int min=32767;
		while(start!=null)
		{
			if(min>start.getdata())
			{
				min=start.getdata();
			}
		start=start.getnext();
		}
		return min;
	}
	
	void mid()
	{
		Node slow=start;
		Node fast=start;
		
		if(start!=null)
		{
			while(fast!=null && fast.getnext()!=null)
			{
				slow=slow.getnext();
				fast=fast.getnext().getnext();
			}
			System.out.println("Mid Node: "+slow.getdata());
		}
	}
	
	
	//display list
	void disp()
	{
		Node t=start;
		while(t!=null)
		{
			System.out.print(t.getdata()+" ");
			t=t.getnext();
		}
		System.out.println();
	}
}
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls=new LinkedList();
		ls.addFirst(10);
		ls.addFirst(20);
		ls.addFirst(30);
		ls.disp();
		ls.addLast(40);
		ls.disp();
		ls.addAtPosition(25, 2);
		ls.disp();
		ls.addAfter(35, 25);
		ls.disp();
		ls.deleteFirst();
		ls.disp();
		ls.deleteLast();
		ls.disp();
		ls.deleteAtPosition(3);
		ls.disp();
		ls.reverse();
		ls.disp();
		ls.addFirst(80);
		ls.addFirst(90);
		ls.disp();
		ls.addAtPosition(80, 5);
		ls.disp();
		//ls.deleteDuplicate();
		ls.mid();
		ls.disp();
	}

}
