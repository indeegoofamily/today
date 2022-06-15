package new_1;

public class polymorphism 

{
	public void arithmetic(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result is : "+c);
	}
	public void sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("The answer is : "+c);
	}

	public void sum(int a, int b, int abhi)
	{
		int c;
		c=a+b+abhi;
		System.out.println("The answer is : "+c);
	}	
	public static void main(String[] args) 
	{
	polymorphism p=new polymorphism();
	p.sum(12, 12);
	p.sum(12, 12,12);
	}
}
