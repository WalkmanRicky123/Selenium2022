package hdfc.loans.homeloans;

public class StringDemo {

	public static void main(String[] args) 
	{
		String s1="Vikash Anand ";
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.hashCode());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('a'));
		
		
		String s2=new String("Walkman");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		String s3="VikashAnand";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		String s4="Vikash";
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.contains(s4));
		
		//s1=s1+s2;
		 s1=s1.concat(s2);
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 System.out.println(s4);
		 
		 System.out.println(s1.replace('h', 's'));
		 System.out.println(s1.substring(3, 5));
		 
		 System.out.println(s1);
		 
		 String s5="  Vikash";
		 System.out.println(s5);
		 System.out.println(s5.trim());
		 System.out.println(s1.equals(s5.trim()));
		

	}

}
