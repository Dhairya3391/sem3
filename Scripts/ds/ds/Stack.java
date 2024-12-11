//stack

import java.util.*;

class Stack extends main {
	 int top=-1,x=0,n=5;
	int a[]=new int[n];
	
	public void push()
	{

		for(int i=0;i<n;i++)
		{
		
		if(top>=n)
		{
			System.out.println("Stack Overflow");
			break;
			

		}
		else{
			System.out.println("Enter Element");
			Scanner sc=new Scanner(System.in);
			x=sc.nextInt();
			top=top+1;
			a[top]=x;
			break;
		}


		}
		for(int j=0;j<n;j++)
		{	
			System.out.println("Index"+j+"Element is="+a[j]);
		}

	}
	


public void pop()
{
	if(top<0)
	{
		System.out.println("Stack underflow");
	
	}
	else{
		
		top=top-1;
		x=a[top+1];
		a[top+1]=0;
		System.out.println(x);


	}
	for(int j=0;j<n;j++)
		{	
			System.out.println("Index"+j+"Element is="+a[j]);
		}

}
public void peep()
{
	Scanner ac=new Scanner(System.in);
	int i=ac.nextInt();
	if(a[top-i+1]<0)
	{
		System.out.println("Stack Underflow");
		

	}
	else{
		System.out.println(a[top-i+1]);
		
	}
	
}
public void change()
{
		Scanner c=new Scanner(System.in);
		System.out.println("Enter index");
		int i=c.nextInt();
		System.out.println("Enter Value");
		x=c.nextInt();
		if(top-i+1<0)
		{
			System.out.println("Underfl");
		}
		else
		{
			a[top-i+1]=x;
		}
		for(int j=0;j<n;j++)
		{	
			System.out.println("Index"+j+"Element is="+a[j]);
		}
}
}

class main 
{

public static void main(String[] args) 
{
	Stack s1=new Stack();
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	switch(s)
	{
		case 1:
		s1.push();
		break;

		case 2:
		s1.pop();

		case 3:
		s1.peep();

		case 4:
		s1.change();

		default:
				System.out.println();
	}
	
}
}