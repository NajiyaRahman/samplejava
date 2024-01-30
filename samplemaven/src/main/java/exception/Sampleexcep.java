package exception;

public class Sampleexcep {
	
	int a=10;
	public void display()
	{
	 try
	 {
	 int d=a/0;
	 System.out.println(d);
	 }
	 catch(Exception e)
	 {
		System.out.println(e);
	 }
	
	}
	
	public static void main(String args[])
	{
		//System.out.println("sample");
		Sampleexcep obj=new Sampleexcep();
		obj.display();
	
		System.out.println("sample");
		
	}

}
