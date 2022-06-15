package Assign_1;

public class this_method_calling 
{
	public void A()
	{
		System.out.println("Default parameterized method");
	}
	
	public void A1()
	{
		System.out.println("1 parameterized method");
	}
	
	public void A2()
	{
		System.out.println("2 parameterized method");
	}
	
	public void A3()
	{
		System.out.println("3 parameterized method");
	}
	
	public void A4()
	{
		this.A3();
		this.A();
		this.A1();
		this.A2();
		System.out.println("4 parameterized method");

	}
	public static void main(String[] args) 
	{
	
		this_method_calling s1=new this_method_calling();
		
		s1.A4();
	}
}
