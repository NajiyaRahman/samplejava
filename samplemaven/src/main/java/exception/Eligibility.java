package exception;

public class Eligibility {
	
	public static void check(int age)throws LicenseException
	{
		if(age<18)
		{
			throw new LicenseException("license not approved");
		}
		else
		{
			System.out.println("Eligible");
		}
			
	}
	
	public static void main(String args[])
	{
		try
		{
			check(10);
		}
		catch(LicenseException e)
		{
			System.out.println(e);
		}
	}

}
