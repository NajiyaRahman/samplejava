package aggregation;

public class Student1 {
	String name;
	int rollno;
	Address1 address1;
	
public Student1(String name,int rollno,Address1 address1)
{
	this.name=name;
	this.rollno=rollno;
	this.address1=address1;
}

public void print()
{
	System.out.println("Name : " +name);
	System.out.println("Rollno : " +rollno);
	System.out.println(address1.houseno+address1.city+address1.state);
}

public static void main(String args[])
{
	Address1 obj1=new Address1(12,"Edappal","kerala");
	Student1 obj=new Student1("Anu",3,obj1);
	obj.print();
}
	
	

}
