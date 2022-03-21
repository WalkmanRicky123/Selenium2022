package hdfc.loans.homeloans;

class Parent
{
	public int WorkHard()   // primitive type
	{
		System.out.println("Parent: wake up early, go to college");
		return 0;
	}
	
	public void Care()
	{
		System.out.println("Parent: Atmost care");
	}
}

public class Child extends Parent
{
	// predefining parent class behavior[workhard] in child class known as MethodOverridding
	public int WorkHard() // primitive type
	{
		System.out.println("Parent: wake up anytime, go to movie");
		return 0; 
	}
	
	
	public void Love()
	{
		System.out.println("Child: I love you");
	}
	public static void main(String[] args) 
	
	{
		Child obj = new Child();
		obj.WorkHard();
		obj.Care();
		obj.Love();
		
	}

}
