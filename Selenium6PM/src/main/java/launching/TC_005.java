package launching;

import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

public class TC_005 extends BaseTest

{
	private static final Logger log= Logger.getLogger(TC_005.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Initiate the properties file..........");
		
		Launcher("chromebrowser");
		log.info("Opening the browser :-"+p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("navigate to the url:-"+childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		log.info("Selecting the option Books by using Locator:-"+orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		log.info("Enter the text Harry Potter by using Locator:"+orProp.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Element by using Locator:"+orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		
		/* below 3 lines are static program we are not going to use*/
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

	
	

}
