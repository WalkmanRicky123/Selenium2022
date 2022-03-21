package hdfc.loans.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) 
	{
		ArrayList<Integer> AL= new ArrayList<Integer>();
		for(int i =1;i<=10;i++)
		{
			AL.add(i);
		}
		System.out.println(AL);
		
		Iterator<Integer> var = AL.iterator();
		while(var.hasNext())
		{
			Integer val= var.next();
			if(val%2==0)
				System.out.println(val);
			else
			
				var.remove();
			}
		System.out.println(AL);
		

	}

}
