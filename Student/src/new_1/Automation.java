package new_1;

public class Automation 
{
	public Automation(int a, int b,int x) 
	{
	   System.out.println("Parent Three Parameterized");
	}
	
	public Automation(int a, int b) 
	{
		this(1);
	   System.out.println("Parent Two Parameterized");
	}
	
	public Automation(int a) 
	{
		this();
	   System.out.println("Parent One Parameterized");
	}
	
	public Automation() 
	{
		this(1,2,3);
	   System.out.println("Parent Default Parameterized");
	}
}
