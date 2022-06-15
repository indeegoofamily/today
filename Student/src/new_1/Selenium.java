package new_1;

public class Selenium extends Automation // for constructor 
{
	public Selenium(int x,int a, int b) 
	{
		this();
	   System.out.println("Child Three Parameterized");
	}
	
	public Selenium(int a, int b) 
	{
		this(1,2,3);
	   System.out.println("Child Two Parameterized");
	}
	
	public Selenium(int a) 
	{
		this(1,2);
	   System.out.println("Child One Parameterized");
	}
	
	public Selenium() 
	{
		super(1,2);
	   System.out.println("Child Default Parameterized");
	}
	
	public static void main(String[] args) 
	{
		Selenium S=new Selenium(1);		
	}
}
