package Assign_1;

public class Class_2 
{	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum is : " +c);
		return c;
		
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("Sub is : " +z);
		return z;
	}
	public void multi(int x1, int x2)
	{
		int x3;
		x3=x1*x2;
		System.out.println("Multiply is : " +x3);
	}
	
 public static void main(String[] args) 
 
{
	 Class_2 tr=new Class_2();
	 int sumre=tr.sum(10, 2);
	 int subre=tr.sub(12,3);
	 tr.multi(sumre, subre);
} 
}
