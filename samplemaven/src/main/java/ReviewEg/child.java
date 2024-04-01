package ReviewEg;

public class child extends parent{
	
	public void method()
	{
		super.method();
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		child obj=new child();
		obj.method();

	}

}
