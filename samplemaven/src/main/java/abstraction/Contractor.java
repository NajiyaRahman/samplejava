package abstraction;

import java.util.Scanner;

public class Contractor extends Employee {
	
    public void calculatesalary()
	{
    	
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter working hours");
		 int hour=sc.nextInt();
        salary = hour*a;
		System.out.println("salary for contractemployee is "+salary);
	}
    
	


}
