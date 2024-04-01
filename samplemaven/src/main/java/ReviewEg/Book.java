package ReviewEg;

public class Book {
	String name;
	int id;
	Author author;
	
	public Book(String name,int id,Author author)
	{
		this.name=name;
		this.id=id;
		this.author=author;
	}

	public void method()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(author.name+author.age);
	}
	public static void main(String args[])
	{
		Author obj=new Author();
		Book ob=new Book();
		ob.method();
		
	}

}
