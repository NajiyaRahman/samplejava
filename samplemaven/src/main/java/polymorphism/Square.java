package polymorphism;

public class Square extends Shape {
	
	public void draw()
	{
		System.out.println("Circle drawing");
	}
	
	public static void main(String args[])
	{
		Square obj=new Square();                            
		obj.draw();                                           /*Shape s;
		                                                    s=new Rectangle();                                        
		                                                    s.draw();
		                                                    s.new Circle();
		                                                    s.draw();*/
		
		
		Shape obj1=new Shape();
		obj1.draw();
		
		Rectangle obj2=new Rectangle();
		obj2.draw();
		
		Circle obj3=new Circle();
		obj3.draw();
		
	}


}
