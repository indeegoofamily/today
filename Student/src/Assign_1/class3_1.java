package Assign_1;

public class class3_1 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum is : " +c);
		return c;
	}

	public int sub(int a1,int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("Sub is : " +c1);
		return c1;
	}
	
	public int multi(int a2,int b2)
	{
		int c2;
		c2=a2*b2;
		System.out.println("Multi is : " +c2);
		return c2;
	}
		
	public void Div(float a3,float b3)
	{
		float c3;
		c3=a3/b3;
		System.out.println("Div is : " +c3);
	}
	
	
	public static void main(String[] args) 
	{
		{
		class3_1 qw=new class3_1();
		 int sumre=qw.sum(10, 2);
		 int s2=qw.sum(sumre, 2);
		 int s3=qw.sub(s2, 2);
		 int s4=qw.multi(s3, 2);
		 qw.Div(s4, 2);
		
	}

}}
