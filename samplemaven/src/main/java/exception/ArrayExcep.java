package exception;

public class ArrayExcep {
	
	public void method()
	{
		//try
		//{
		int a[]= {1,3,4,6};
		System.out.println(a[7]);
		//}
		/*catch(Exception e)
		{
			System.out.println(e);
		}*/
		
	}

	public static void main(String[] args) {
		ArrayExcep obj=new ArrayExcep();
		try
		{
		obj.method();
		}
		finally {
		System.out.println("ArrayOutOfBound");
		}

	}

}
