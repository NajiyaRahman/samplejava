package abstraction;

public class Video extends Google {
	
	public void search()
	{
		System.out.println("video search");
	}
	
	public static void main(String args[])
	{
		/*Video obj=new Video();
		obj.search();
		
		Image obj1=new Image();
		obj1.search();*/
		Google g;
		g=new Image();
		g.search();
		g=new Video();
		g.search();
	}

}
