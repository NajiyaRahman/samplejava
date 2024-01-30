package super1;

public class Divisiblity extends Addition {
	
	public void method1()
	{
		super.method1();
		super.sum1();
		System.out.println(sum);
		if(sum % 10==0)
		{
			System.out.println("The no is divisible by 10");
		}
		else
		{
			System.out.println("The no is not divisible by 10");
		}
	}
	public static void main(String args[])
	{
	 Divisiblity obj=new Divisiblity();
	 obj.method1();
	}

}
