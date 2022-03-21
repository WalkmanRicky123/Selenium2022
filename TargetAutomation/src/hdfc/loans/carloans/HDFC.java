package hdfc.loans.carloans;

public class HDFC implements Rbi


{

	public static void main(String[] args) 
	{
		HDFC h = new HDFC();
		h.deposit();
		h.withdrawl();
	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overriden in HDFc deposit");
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("i am overriden in HDFC withdraw");
	}

	

	

}
