package polymorphism;

import java.util.Scanner;

public class Offseason extends Onseason {
	
	public void discount()
	{
		double discount=(total*15)/100;
		System.out.println("Discount on offseason :" +discount);
	}
	
	public static void main(String args[])
	{
		/*Offseason obj=new Offseason();
		obj.discount();
		Onseason obj1=new Onseason();
		obj1.discount();*/
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Discount on onseason");
		System.out.println("2.Discount on offseason");
		System.out.println("3.Exit");
		System.out.println("Enter your option");
		int o=sc.nextInt();
		switch(o)
		{
		case 1:
			Onseason obj1=new Onseason();
			obj1.discount();
			break;
		case 2:
			Offseason obj=new Offseason();
			obj.discount();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("invalid");
		}
			
			
		}
		
	}
}


