package collection;

import java.util.Iterator;
import java.util.Stack;

public class StackEg {
	
	public static void main(String args[])
	{
		Stack<String> s=new Stack<String>();  
		s.push("Naji");  
		s.push("Keerthy");  
		s.push("Anu");  
		s.push("nithin"); 
		Iterator<String> t=s.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		
	}

}
