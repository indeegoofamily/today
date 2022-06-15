package Assign_1;

public class localglobal 
{

	int abhi;
	int asd;
	public void m(int a)
	{
		System.out.println(a);	
		a=abhi;
		System.out.println(a);	
	
	}
	
	public void m2(int asd)
	
	{
		this.asd=asd;
	}
	
	public static void main(String[] args) 
	{
	  localglobal s=new localglobal();
	  s.m(12);
	  s.m2(13);
	  System.out.println(s.asd);	
	}
}
