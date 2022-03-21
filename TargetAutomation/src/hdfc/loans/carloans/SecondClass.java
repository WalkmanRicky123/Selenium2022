package hdfc.loans.carloans;

public class SecondClass 
{
	//Data -properties
	int a =10, b=20, results;
	
	//Operation - Behavior
	
	public void add()
	{
		results =a+b;
		System.out.println("Addition of A & B is: "+results);
	}
	public void sub()
	{
		results =a-b;
		System.out.println("Subtraction of A & B is: "+results);
	}

	public static void main(String[] args) 
	{
		//if we have to execute SecondClass than we have to create Class Object under main method
		
		System.out.println("This is second class");
		SecondClass Obj =new SecondClass();
		Obj.add();
		Obj.sub();
		System.out.println("This is other new class");
		SecondClass Obj1 = new SecondClass();
		Obj1.add();
		Obj1.sub();
 
	}

}
