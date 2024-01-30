package abstraction;

public class Test3 implements Test,Test1 {
	
	public void print()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("print");
	}
	public void dispaly()
	{
		System.out.println("test");
	}
	public static void main(String args[])
	{
		Test3 obj=new Test3();
		obj.dispaly();
		obj.print();
	}

}
