package hdfc.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Walkman");
		a.add("vikash");
		a.add("Anand");
		a.add("Rick");
		a.add("chaitali");
		
		System.out.println(a);
		
		ListIterator<String> var = a.listIterator();
		while(var.hasNext())
		{
			String str= var.next();
			if(str.equals("Anand"))
				var.set("Vikash Anand ");
			else
				var.remove();
		}
		System.out.println(a);

	}

}
