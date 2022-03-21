package hdfc.loans.collections;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add("vikash");
		a.add(20);
		a.add(10);
		a.add("Anand");
		
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.isEmpty());
		System.out.println(a.hashCode());
		System.out.println(a.contains("vikash"));
		
		System.out.println(a);
		
		System.out.println(a.add(40));
		System.out.println(a);
		
		a.add(1, "walkman");
		a.add(4, "rick");
		System.out.println(a);
		
		a.set(1, "Walkman");
		a.set(4, "Rick");
		System.out.println(a);
		
		System.out.println(a.size());
		
		System.out.println(a.subList(1, 7));
		a.remove(1);
		System.out.println(a);
		
		a.remove("Rick");
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		

	}

}
