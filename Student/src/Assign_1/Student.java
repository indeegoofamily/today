package Assign_1;

public class Student 
{
	int RollNum;
	int Age;
	
	public void display_1()
	{
		System.out.println("Welcome to 2022 ");
	}
	public void display_2()
	{
		System.out.println("A beginning of a new era ");
	}
	public static void main(String[] args) 
	{
		Student abc=new Student();
		abc.RollNum=1;
		abc.Age=21;
		abc.display_1();
		abc.display_2();
		System.out.println("Roll Number is : "+abc.RollNum);
		System.out.println("Age is : "+abc.Age);
		
	}
}
