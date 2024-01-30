package super1;

public class Class2 extends Class1 {
	int a=7;
	public Class2()
	{
		System.out.println(super.a);
	    super.display();
		System.out.println("show");
	}
	
	public void display()
	{
		//System.out.println(super.a);
		
		int s=3;
		System.out.println(s);
		System.out.println("class2");
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		//super.display();
		Class2 obj=new Class2();
		obj.display();
	}

}
