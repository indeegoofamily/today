package pkg_1;

public class Student 
{ // boundry of class
	int age; // we have declared a variable
	int rollno;
	
   public void display1() //() indicate a method
   { //boundary of the method
	   System.out.println("Welcome all of you");
   }
   public void display2() //() indicate a method
   { //boundary of the method
	   System.out.println("automation is very easy");
   }
   
     public static void main(String[] args) 
    {//boundary of the main method 
    	 Student abhishek=new Student(); //object creation
    	 abhishek.display1();
    	 abhishek.display2();
	}
}
