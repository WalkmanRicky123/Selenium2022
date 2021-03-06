package launching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		//option.addArguments("--Incognito");
		option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		
		driver.findElement(By.id("departure")).click();
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText().contains("April 2022"))
			
			{
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		
			}
		List<WebElement> dateList = driver.findElements(By.xpath("//div[@class='DayPicker-Body']/div/div[@class='DayPicker-Day']"));
		for(int i=0;i<dateList.size();i++)
		{
			String dateText = dateList.get(i).getText();
			System.out.println(dateText);
			if(dateText.equals("20"))
			{
				dateList.get(i).click();
				break;
			}
		}

	}

}
