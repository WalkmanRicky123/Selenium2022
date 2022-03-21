package launching;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

public class TC_006 extends BaseTest

{
	
	
	public static void main(String[] args) throws Exception 
	{
		init();
		test=rep.createTest("TC_006");
		test.log(Status.INFO,"Initiate the properties file..........");
	
		
		Launcher("chromebrowser");
		test.log(Status.INFO,"Opening the browser :-"+p.getProperty("chromebrowser"));
		
		
		
		navigateUrl("amazonurl");
		test.log(Status.PASS,"navigate to the url:-"+childProp.getProperty("amazonurl"));
		
		
		
		selectOption("amazondropbox_id","Books");
		test.log(Status.FAIL, "Selecting the option Books by using Locator:-"+orProp.getProperty("amazondropbox_id"));
		
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		test.log(Status.PASS, "Enter the text Harry Potter by using Locator:"+orProp.getProperty("amazonsearchtextbox_id"));
		
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicked on Element by using Locator:"+orProp.getProperty("amazonsearchbutton_xpath"));
		
		rep.flush();
		
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		
		/* below 3 lines are static program we are not going to use*/
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

	
	

}
