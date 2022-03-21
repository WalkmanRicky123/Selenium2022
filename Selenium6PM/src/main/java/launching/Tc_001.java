package launching;

public class Tc_001 extends BaseTest
{
	public static void main(String[] args) throws Exception 
	{
		init();
		Launcher("chromebrowser");
		navigateUrl("amazonurl");
		
	}

}
