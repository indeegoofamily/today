package Assign_1;

import java.util.Scanner;

public class scan2 
{
	public int sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum is : "+c);
		return c;
	}
	
	public int sub(int a, int b)
	{
		int c=a-b;
		System.out.println("Sub is : "+c);
		return c;
	}
	
	public int multi(int a, int b)
	{
		int c=a*b;
		System.out.println("Multi is : "+c);
		return c;
	}
	
	public void div(int a, int b)
	{
		int c=a/b;
		System.out.println("Div is : "+c);
	}
	
	
 public static void main(String[] args) 
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter Value of X1 :");
	 int x1=s.nextInt();
	 System.out.println("Enter Value of X2 :");
	 int x2=s.nextInt();
	 System.out.println("Enter Value of X3 :");
	 int x3=s.nextInt();
	 System.out.println("Enter Value of X4 :");
	 int x4=s.nextInt();
	 System.out.println("Enter Value of X5 :");
	 int x5=s.nextInt();
	 System.out.println("Enter Value of X6 :");
	 int x6=s.nextInt();
	 scan2 d=new scan2();
	 int m=d.multi(x1,x2);
	 int s1=d.sub(m, x3);
	 int s2=d.multi(s1, x4);
	 int s3=d.sum(s2, x5);
	 d.div(s3, x6);	 
}
}
