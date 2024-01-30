package exception;

public class Finallyeg {

	int a=5;
	
	public void method()
	{
		
		int d=a/0;
		System.out.println(d);
		
	}
	
	
	public static void main(String args[])
	{
		Finallyeg o=new Finallyeg();
		try
		{
		o.method();
		}
		finally
		{
		System.out.println("finally");
		}
	}
}
