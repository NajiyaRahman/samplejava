package ReviewEg;

public class Ex2 implements Ex,Ex1 {
	
	public void show()
	{
		System.out.println("show");
	}
	
	public void print()
	{
		System.out.println("print");
	}

	public static void main(String[] args) {
		Ex2 obj=new Ex2();
		obj.show();
		obj.display();
		
		

	}

}
