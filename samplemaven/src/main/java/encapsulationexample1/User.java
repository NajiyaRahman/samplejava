package encapsulationexample1;

import java.util.Scanner;

import encapsulationexample.Bank;

public class User
{
	public static void main(String args[])
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter your pin");
		int pin=sc.nextInt();*/
		
		Bank obj=new Bank();
		obj.setter(1001);
		obj.getter();
		obj.validation();
	}
	
}


