package encapsulationexample;

public class Bank {
	private int pin;
	
	public void setter(int pin)
	{
		this.pin=pin;
	}
	
	public void getter()
	{
		System.out.println("pin no is " +pin);
	}
	
	public void validation()
	{
		if(pin==1001)
		{
			System.out.println("pin is valid");
		}
		else if(pin==1234)
		{
			System.out.println("pin is valid");
		}
		else if(pin==1212)
		{
			System.out.println("pin is valid");
		}
		else
		{
			System.out.println("pin is inavalid");
		}
	}
}
