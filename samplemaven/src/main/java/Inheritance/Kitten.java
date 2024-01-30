package Inheritance;

public class Kitten extends Cat {
	
	public void eat()
	{
		System.out.println("eating");
	}
public static void main(String args[])
{
	Kitten a=new Kitten();
	a.jump();
	a.eat();
	a.bark();
}
}
