package Inheritance;

public class Son extends Father {
	
	public void display1()
	{
		System.out.println("Son is younger than daughter");
	}
	
	public static void main(String args[])
	{
		Son obj=new Son();
		obj.display();
		obj.print();
		obj.display1();
		
	}

}
