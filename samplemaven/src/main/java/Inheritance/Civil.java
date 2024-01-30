package Inheritance;

public class Civil extends Department{
	
	public void assignment()
	{
		System.out.println("submit on monday");
	}
	
	public static void main(String args[])
	{
		Civil a=new Civil();
		a.exam();
		a.assignment();
				
	}

}
