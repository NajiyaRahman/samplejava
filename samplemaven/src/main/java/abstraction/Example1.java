package abstraction;

public class Example1 extends Example {
	
	public void show()
	{
		System.out.println("Showing");
	}
	
	public void print()
	{
		System.out.println("Printing");
	}
	public static void main(String args[])
	{
		Example1 obj=new Example1();
		obj.show();
		obj.print();
		obj.display();
	}

}
