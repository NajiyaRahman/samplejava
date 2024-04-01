package collection;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedEg {

	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();  
		l.add("Ravi");  
		l.add("Ramu");  
		l.add("Arun");  
		l.add("Ajay");  
		Iterator<String> itr=l.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
		
		
		
		

	}

}
