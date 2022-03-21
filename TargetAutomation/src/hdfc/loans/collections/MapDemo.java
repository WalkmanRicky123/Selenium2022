package hdfc.loans.collections;

import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) 
	{
		//HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		//LinkedHashMap<Integer, Integer> h = new LinkedHashMap<Integer, Integer>();
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(10, 100);// duplicate keys are not allowed
		h.put(20, 200);
		h.put(30, 300);
		h.put(40, 400);
		h.put(10, 500);
		h.put(40, 600);
		h.put(5, 700);
		
		System.out.println(h);
		System.out.println(h.get(10));
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		
		Set<Integer> keys = h.keySet();
		for(Integer key:keys)
		{
			System.out.println(key+"-----"+h.get(key));
		}

	}

}
