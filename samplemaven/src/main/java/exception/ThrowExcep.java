package exception;

import java.io.IOException;

public class ThrowExcep {
	
	public void method(int a,int b)throws IOException,ArithmeticException
	{
		int sum=a+b;
		if(sum>15)
		{
			throw new ArithmeticException();
		}
		else
		{
			throw new IOException();
		}
		
	}

	public static void main(String[] args)throws IOException,ArithmeticException {
		ThrowExcep obj=new ThrowExcep();
		try
		{
			obj.method(10,6);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		catch(IOException a)
		{
			System.out.println(a);
		}
		

	}

}
