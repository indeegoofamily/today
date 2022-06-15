package new_1;

public class seleauto extends sele
{
	public void m3()
	{
		System.out.println("Hello ");
	}
	
	public static void main(String[] args) 
	{
	
		seleauto a=new seleauto();
		a.m1();
		a.m2();
		a.m3();
		a.a=1000;
		System.out.println(a.a);
	}
}
