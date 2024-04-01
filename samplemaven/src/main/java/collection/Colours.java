package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Colours {
	
	public static void main(String args[])
	{
	ArrayList<String> col=new ArrayList<String>();
	col.add("black");
	col.add("blue");
	col.add("white");
	
	
	Iterator t=col.iterator();
	while(t.hasNext())
	{
		System.out.println(t.next());
	}
	

}
}
