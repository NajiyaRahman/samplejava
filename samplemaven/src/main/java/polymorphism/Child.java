package polymorphism;

public class Child extends Parent {
	
	public void sum(int c,int d)
	{
		//super.sum(4,7);
		int sum1=c+d;
		System.out.println("sum is :" +sum1);
		System.out.println("child class");
		
	}
	public static void main(String args[])
	{
	
	/*Parent obj=new Child();
	obj.sum(2,3);
	obj.sum(3, 10);*/
	
	Parent obj1=new Parent();
	obj1.sum(3,7);
	Child obj=new Child();
	obj.sum(1,4);
	}
	

}
