package Inheritance;

public class Daughter extends Father {
	
	public void print1()
	{
		System.out.println("Daughter is older than son");
	}
	
	public static void main(String args[])
	{
		Daughter obj=new Daughter();
		obj.print1();
		obj.print();
		obj.display();
		
	}

}
