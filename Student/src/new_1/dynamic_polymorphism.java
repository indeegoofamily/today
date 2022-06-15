package new_1;

public class dynamic_polymorphism extends polymorphism
{
	public void arithmetic(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("Result is : "+c);
	} 

	public static void main(String[] args) 
	{
		dynamic_polymorphism d=new dynamic_polymorphism();
		d.arithmetic(12, 2);
	}
}
