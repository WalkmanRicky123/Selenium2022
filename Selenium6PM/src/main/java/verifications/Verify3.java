package verifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import launching.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test=rep.createTest("Verify3");
		test.log(Status.INFO,"Initiate the properties file..........");
	
		
		Launcher("chromebrowser");
		test.log(Status.INFO,"Opening the browser :-"+p.getProperty("chromebrowser"));
		
		
		
		navigateUrl("amazonurl");
		test.log(Status.PASS,"navigate to the url:-"+childProp.getProperty("amazonurl"));
		
		
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver= new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.amazon.in");
		 */
		
		String expectedLink = "Customer Service";
		if(!isLinkEqual(expectedLink))
			reportFailure("Both link are not equal");
		
			//System.out.println("Both link are not equal");
		else
			reportSuccess("Both link are equal");
			//System.out.println("Both link are equal");
		
		rep.flush();

	}

		

}
