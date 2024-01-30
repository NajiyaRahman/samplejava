package exception;

public class NullExcep {
	
	public void method1()
	{
		try
		{
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException a)
		{
			System.out.println("null pointer");
		}
		}

	public static void main(String[] args) {
		NullExcep obj=new NullExcep();
		obj.method1();

	}

}
