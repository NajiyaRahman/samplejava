package accessmodifier;

public class Class1 {
	 protected int age=25;
	 protected String name="naji";
	
	protected void method1()
	{
		System.out.println("access modifier private");
	}
	
	public static void main(String args[])
	{
		Class1 obj=new Class1();
		System.out.println(obj.age);
		System.out.println(obj.name);
		obj.method1();
	}

}
