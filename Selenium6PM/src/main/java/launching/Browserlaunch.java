package launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch 
{

	public static void main(String[] args) 
	{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Drivers chrome\\chromedriver.exe");
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Drivers Firefox\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();

	}

}
