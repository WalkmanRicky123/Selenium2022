package hdfc.loans.carloans;

public class B extends A // Is A Relationship
{
	public void m1()
	{
		System.out.println("i am overridden m1 in B");
	}
	
	public void m2()
	{
		System.out.println("i am m2 in B");
	}

	public static void main(String[] args) 
	{
		A a = new A();   // Has-A Relationship
		a.m1();
		
		B b = new B();
		b.m2();
		b.m1();
		
		// we can use Parent Class reference variable to refer/ hold child class object
		A obj = new B();
		obj.m1();
		
		B obj1 = (B) obj;
		obj1.m1();
		obj1.m2();
		
		// we can not use child class reference variable to hold parent class object
		
	    B a1= (B) new A();
	    a1.m1();
	    a1.m2();
		
		
		//B b = new B();
		//b.m2();
		//System.out.println(b.hashCode());
		
	}

}
