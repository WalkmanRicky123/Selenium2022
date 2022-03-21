package hdfc.loans.homeloans;

public class Calculations 
{
	int a,b,results;
	
	
	
	public Calculations(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void add()
	{
		results = a+b;
		System.out.println("Add of A & B is: "+ results);
		
	}
	
	public void sub()
	{
		results = a-b;
		System.out.println("Sub of A & B is: "+ results);
		
	}
	
	public static void main(String[] args) 
	{
		Calculations obj = new Calculations(100,200);
		obj.add();
		obj.sub();
		
		 Calculations obj1 = new Calculations(40,60);
		 obj1.add();
		 obj1.sub();
		
	}

}
