package multilevel;

public class Kakkanadsbi extends Sbi {
	
	public void accountopen()
	{
		System.out.println("open");
	}

	public static void main(String[] args) {
		Kakkanadsbi obj=new Kakkanadsbi();
		
		obj.deposit();
		obj.accountopen();

	}

}
