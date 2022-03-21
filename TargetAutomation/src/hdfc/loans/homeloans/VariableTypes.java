package hdfc.loans.homeloans;

public class VariableTypes 
{
	// primitive variable
	int x = 100;     // instance (or) non static (or) instance- global variable
	static String cname ="Vikash"; // static (or) static- global variable
	static VariableTypes obj;

	
	public void m1()
	{
		int y = 200; //local variable
		System.out.println(y);
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableTypes.cname);
	}
	public static void m2()
	{
		 obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	public static void main(String[] args) 
	{
		 obj = new VariableTypes(); //non-primitive / reference variable
		System.out.println(obj.x);
		System.out.println(cname);
		
	}

}
