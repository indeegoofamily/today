package new_1;

public class Selenium_method extends Automation_method //for method
{
	public void m()
	{
		System.out.println("child default method");
	}
	public void m1(int a)
	{
		System.out.println("child one parameterized method");
	}
	public void m2(int a,int b)
	{
		System.out.println("child two parameterized method");
	}
	public void m3(int a,int b,int c)
	{
		super.m3(1, 2, 3);
		super.m();
		super.m1(1);
		super.m2(1,2);
		this.m2(1,2);
		this.m();
		this.m1(1);

	System.out.println("child three parameterized method");
	}
	
	public static void main(String[] args) 
	{
		Selenium_method s=new Selenium_method();
		s.m3(1,2,30);
	}
}
