package hdfc.loans.homeloans;

public class DataTypeDemo 
{
	
	// integer types
	byte b =127;     // 1 byte
	
	short s = -32768; // 2 byte
	
	int i = 2147483647; // 4 byte
	
	long l = 2147483647; // 8 byte
	
	// floatingTypes
	float f =21.34f; // 4 bytes
	double d = 22.23f; // 8 bytes
	
	boolean bb =true;
	char ch='a'; // 2 bytes
	
	String name ="Vikash";

	public static void main(String[] args) 
	{ 
		
		DataTypeDemo obj = new DataTypeDemo();
		System.out.println(" Byte: "+obj.b);
		System.out.println("Short:"+obj.s);
		System.out.println("Int:"+obj.i);
		System.out.println("Long:"+obj.l);
		
		System.out.println("Float:"+obj.f);
		System.out.println("Double:"+obj.d);
		
		System.out.println("Boolean:"+obj.bb);
		System.out.println("Char:"+obj.ch);
		System.out.println("String:"+obj.name);
		
		

	}

}
