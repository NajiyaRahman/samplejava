package Inheritance;

public class  Accountant extends Employee {
  int pf=3000;
  
  public void display1()
  {
	  System.out.println("child class accountant");
  }
  
  public static void main(String args[])
  {
	  Accountant s=new Accountant();
	  s.display();
	  s.display1();
	  System.out.println(s.salary);
	  System.out.println(s.pf);
  }
  
}
