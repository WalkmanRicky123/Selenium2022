package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='vikash anand'" );
		
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		//js.executeScript("window.scrollBy(0,100)");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//js.executeScript("document.getElementById('u_0_d_93').scrollIntoView()");
		
		js.executeScript("window.history.back()");
		
		Thread.sleep(2000);
		
		js.executeScript("window.history.forward()");
		
		Thread.sleep(2000);
		
		js.executeScript("window.history.go(0)");

	}

}
