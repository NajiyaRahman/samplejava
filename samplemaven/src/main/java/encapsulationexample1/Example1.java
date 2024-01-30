package encapsulationexample1;

import encapsulationexample.Encapsulationclass;

public class Example1 {
	
	public static void main(String args[])
	{
	Encapsulationclass obj=new Encapsulationclass();
	obj.setAccno(12368);
	obj.setName("naji");
	obj.setEmail("naji@123gmail.com");
	System.out.println(obj.getAccno());
	System.out.println(obj.getName());
	System.out.println(obj.getEmail());
	}
			
}
