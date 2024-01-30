package Inheritance;

public class Salary extends Hra {
	double totalsal;
	
	public void totalsalary()
	{
		//super.hra();
		totalsal=(a+h-pf-b+c);
		//System.out.println("total salary is "+totalsal);
	}
	public void salaryslip()
	{
		this.totalsalary();
		System.out.println("Salary slip");
		System.out.println("basicpay"+a);
		System.out.println("deduction"+b);
		System.out.println("Hra "+h);
		System.out.println("Pf "+pf);
		System.out.println("bonus"+c);
		System.out.println("totalsalary "+totalsal);
	}
	
	public static void main(String args[])
	{
		Salary obj=new Salary();
		obj.method1();
		obj.hra();
		obj.totalsalary();
		obj.salaryslip();
		
		
	}

}
