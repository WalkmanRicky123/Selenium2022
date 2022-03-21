package launching;

import org.openqa.selenium.By;

public class TC_004 extends BaseTest
{
	public static void main(String[] args) throws Exception 
	{
		init();
		Launcher("chromebrowser");
		navigateUrl("iciciurl");
		
		driver.findElement(By.id("")).getTagName();
		 
		
	}

}
