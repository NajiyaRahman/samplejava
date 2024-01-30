package abstraction;

import java.util.Scanner;

public class FulltimeEmployee extends Employee {
	
	public void calculatesalary()
	{
		salary=8*a;
		System.out.println("salary of full-time employee is "+salary);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter working hours");
		 int hour=sc.nextInt();
		 
		 FulltimeEmployee obj=new FulltimeEmployee();
		 obj.calculatesalary();
		
	}

}
