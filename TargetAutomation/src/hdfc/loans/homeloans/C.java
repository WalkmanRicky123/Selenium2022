package hdfc.loans.homeloans;

import hdfc.loans.carloans.A;
import hdfc.loans.carloans.B;

public class C extends B
{
	public void m3()
	{
		System.out.println("i am m3 from C");
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		
		B b = new B();
		b.m2();
		b.m1();
		
		
		C c = new C();
		c.m3();
		c.m2();
		c.m1();
	}

}
