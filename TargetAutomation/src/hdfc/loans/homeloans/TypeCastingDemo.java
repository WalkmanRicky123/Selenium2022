package hdfc.loans.homeloans;

public class TypeCastingDemo 
{
	

	public static void main(String[] args) 
	{
		// byte, short, int, long ,float, double, boolean, char
		
		// 1 liter of bottle == 500 ml --> There is no risk
		// 1 Liter of bottle == 1.5 l --> There is Risk(overflow)
		
		// int x = 10;
		//System.out.println(x);
		//double y = x;
		//System.out.println(y);
		
		double x = 10;
		System.out.println(x);
		int y = (int) x;
		System.out.println(y);
		
		System.out.println("-----------------------");
		
		int a = 67;
		System.out.println(a);
		 char b=(char) a;
		 System.out.println(b);
		

	}

}
