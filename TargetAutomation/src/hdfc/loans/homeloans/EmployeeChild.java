package hdfc.loans.homeloans;

public class EmployeeChild extends Employee
{
	String city;
	
	public EmployeeChild(String city) 
	{
		super(100,"Vikash",10.09f);
		this.city = city;
		System.out.println(this.city);
	}



	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("BIHAR");
	}

}
