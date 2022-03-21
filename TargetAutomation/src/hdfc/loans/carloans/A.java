package hdfc.loans.carloans;

import java.util.Date;

public class A 
{
	
	public void m1()
	{
		System.out.println("i am m1 from A");
	}
	public static void m6()
	{
		System.out.println("i am m6 static");
	}
	static
	{
		System.out.println("i am static block");
		
	}
	static {
		Date dt = new Date();
		System.out.println(dt);
	}

	public static void main(String[] args) 
	{
		 A a = new A();
		 a.m1();
		 m6();
		
		

	}

}
