package hdfc.loans.homeloans;

public class StringDemo1 {

	public static void main(String[] args) 
	{
		String s1="Vikash";
		String s2=new String("Anand");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s1=s1+s2;
		System.out.println(s1.hashCode());
		
		
		System.out.println("---------------------------");
		
		StringBuffer sb1=new StringBuffer("Vikash");
		StringBuffer sb2=new StringBuffer("Anand");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		sb1=sb1.append(s2);
		System.out.println(s1);

	}

}
