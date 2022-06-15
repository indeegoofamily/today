package new_1;

public class son1 extends father
{
public void c2()
{
	System.out.println("I am first son method");
}
public static void main(String[] args) 
{
	son1 d=new son1();
	d.c1();
	d.c2();
}
}
