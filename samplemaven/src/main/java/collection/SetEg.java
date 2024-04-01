package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetEg {

	public static void main(String[] args) {
		
		HashSet<String> s=new HashSet<String>();
		s.add("anu");
		s.add("minu");
		s.add("ajay");
		System.out.println(s);
		Iterator <String> t=s.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
	
		
		System.out.println(s.size());
		s.remove("ajay");
		System.out.println("after remove" +s);
		
		HashSet<Float> f=new HashSet<Float>();
		f.add(1.2f);
		f.add(1.7f);
		System.out.println(f);
		
		//s.addAll(f);
		//System.out.println(s);
		
		s.removeAll(s);
		System.out.println("after removing" +s);
		
		

	}

}
