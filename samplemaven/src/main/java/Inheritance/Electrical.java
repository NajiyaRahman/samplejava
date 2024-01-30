package Inheritance;

public class Electrical extends Department {
	
	public void attendance()
	{
		System.out.println("70% attendance");
	}
	
	public static void main(String args[])
	{
		Electrical obj=new Electrical();
		obj.exam();
		obj.attendance();
	}

}
