package new_1;

public class sele extends Auto 

{
	public void m2()
	{
		System.out.println("I am child class");
		
	}
	public static void main(String[] args) 
	{
		sele as=new sele();
		as.m1();
		as.m2();
		as.a=122;
		System.out.println(as.a); 		
	}
}
