package launching;

public class TC_002 extends BaseTest 
{

	public static void main(String[] args) throws Exception 
	{
		init();
		Launcher("firefoxbrowser");
		navigateUrl("bestbuyurl");

	}

}
