package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Nongen {
	
	public static void main(String args[])
	{
		ArrayList l=new ArrayList();
		l.add("Anu");
		l.add(17);
		l.add(2.3f);
		l.add("a");
		l.add(2345d);
		l.add(12);
		
		System.out.println(l);
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("anu");
		list.add("minu");
		list.add("ajay");
		
		list.remove("anu");
		System.out.println("remove" +list);
		
		Collections.sort(list);
		System.out.println("after sorting" +list);
		
		
		/*l.removeAll(list);
		System.out.println(l);*/
		
		for(String a:list)
		{
			System.out.println(a);
		}
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("anu");
		list1.add("arun");
		list1.add("varun");
		
		list1.get(1);
		list1.set(1, "fida");
		System.out.println(list1);
		
		list.removeAll(list1);
		System.out.println("after removing" +list);
		
		/*Collections.sort(list);
		System.out.println(list);*/
		
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		s.add(12);
		s.add(5);
		s.add(6);
		System.out.println(s);
		Iterator <String> t=list1.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		
	    System.out.println("before remove" +list1);
	    
		t.remove();
		System.out.println("after removing" + list1);
		
		ArrayList<Float> f=new ArrayList<Float>();
		f.add(1.2f);
		f.add(1.7f);
		System.out.println(f);
		
		l.addAll(list);
		System.out.println(l);
		
		
		
		
		
	}

}
