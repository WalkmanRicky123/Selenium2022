package hdfc.loans.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUserDefineObject {

	public static void main(String[] args) 
	{
		Emp e1= new Emp(101, "VIKASH");
		Emp e2= new Emp(102, "CHAITALI");
		Emp e3= new Emp(103, "ANAND");
		Emp e4= new Emp(104, "PATIL");
		Emp e5= new Emp(105, "RICKY");
		
		//e1.display();
		//e2.display();
		//e3.display();
		//e4.display();
		//e5.display();
		
		HashMap<Integer, Emp> obj= new HashMap<Integer, Emp>();
		obj.put(e1.eno, e1);
		obj.put(e2.eno, e2);
		obj.put(e3.eno, e3);
		obj.put(e4.eno, e4);
		obj.put(e5.eno, e5);
		
		// By Using EntrySet
		
		Set<Entry<Integer, Emp>> entries = obj.entrySet();
		for(Entry<Integer, Emp> e:entries)
		{
			System.out.println(e.getKey());
			Emp ee = e.getValue();
			ee.display();
		}
		
		System.out.println("-------------------------------------");
		
		//By Using Iterator
		Iterator<Integer>iterator=obj.keySet().iterator();
		while(iterator.hasNext())
		{
			Emp e=obj.get(iterator.next());
			e.display();
		}

	}

}
