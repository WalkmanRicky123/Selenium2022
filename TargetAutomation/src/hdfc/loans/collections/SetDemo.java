package hdfc.loans.collections;

//import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) 
	{
		//HashSet<Integer> h= new HashSet<Integer>();
		LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		
		System.out.println(h);

	}

}
