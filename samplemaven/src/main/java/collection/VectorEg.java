package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;



public class VectorEg {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		v.add("Anu");  
		v.add("varun");  
		v.add("sinu");  
		v.add("nithin");  
		Iterator<String> t=v.iterator();  
		while(t.hasNext())
		{  
		System.out.println(t.next());  
		}
		v.remove("nithin");
		System.out.println("after remove " +v);
		
		System.out.println(v.size());
		
		Collections.sort(v);
		System.out.println("after sorting " +v);
		
		v.get(1);
		v.set(1, "sajay");
		System.out.println(v);

	
	}
}
