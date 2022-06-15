package Assign_1;

public class Class4 
{
	public Class4()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	
	public Class4(int a)
	{
		this(1,2);
		System.out.println("One parameterized Constructor");
	}
	
	public Class4(int a, int b)
	{
		this();
		System.out.println("Two parameterized Constructor");
	}

	public Class4(int a, int b, int c)
	{
		System.out.println("Three parameterized Constructor");
	}
	
	public Class4(int a, int b, int c, int d)
	{
		this(1);
		System.out.println("Four parameterized Constructor");
	}
	
		public static void main(String[] args) 
	{
		Class4 a=new Class4(1,2,3,4);
}
}