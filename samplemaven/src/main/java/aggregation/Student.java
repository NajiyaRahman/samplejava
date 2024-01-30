package aggregation;

public class Student {
	int id;
	String name;
	Address address;


public Student(int id,String name,Address address)
{
	this.id=id;
	this.name=name;
	this.address=address;
}
public void method1()
{
	System.out.println(id+name);
	System.out.println(address.city+address.state+address.country);
}
public static void main(String args[])
{
	Address obj1=new Address("Edappal","Kerala","India");
	Student obj=new Student(1,"Naji",obj1);
	obj.method1();
}
}
