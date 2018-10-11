//package Test;

import java.util.Scanner;

class Deque
{
	int front;
	int rear;
	int []q;
	int s;
	Deque(int l)
	{
		int front=0;
		int rear=0;
		s=l;
		q=new int [l];
	}
	
	
void pushLeft(int item)
{
	if(front==0 && rear ==0)
	{			
		front=1;
		rear=1;
		q[1]=item;
	
	 }
	 else if(front==s)
	 {
	     System.out.println("queue is full");
	 }
	 else
    {
    	q[--front]=item;
    }
}
void pushRight(int item)
{
	if(front==0 && rear ==0)
	{
		front=1;
		rear=1;
	    q[1]=item;
	}
	else if(rear==s)
	{
		System.out.println("queue is full");
	}
	else 
	{
		q[++rear]=item;
	
	} 
}
void popLeft()
{
	if(front==rear)
    {
	     System.out.println(q[front]);
	     front=0;
	     rear=0;

	 }
   else if(front==0 && rear==0)
   {
       System.out.println("queue is empty");
    }
	 else
    {
		 System.out.println(q[front]);
	     front++;
    }
}
void popRight()
{
	 if(front==rear)
	{
		  System.out.println(q[front]);
		  front=0;
		  rear=0;

	}
	else if(front==0 && rear==0)
	{
		  System.out.println("queue is empty");
    }
	else
	{
		   System.out.println(q[rear]);
		   rear--;

	}

	}
void display()
{
	if(front!=0||rear!=0)
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.println(q[i]);
		}
	}
}
}
public  class Solution1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of element to insert");
		int n=sc.nextInt();
		int ch;
		 Deque d=new  Deque(n);
		 System.out.println("1.pushleft\n 2.pushright\n 3.popleft\n 4.popright\n 5.display\n 6.exit\n");
		 do
		 {
		 System.out.println("enter your choice");
		  ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.println("enter an element");
					int p=sc.nextInt();
					d.pushLeft(p);
					break;
			case 2:System.out.println("enter an element");
					int p1=sc.nextInt();
					d.pushRight(p1);
					break;
			case 3:d.popLeft();
					break;
			case 4:d.popRight();
					break;
			case 5:d.display();
					break;
			case 6:break;
			
		}
		

	}while(ch<6);

	}
}
