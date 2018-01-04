package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 
{
	public class Test2
	{
		
		@Test
		public void test()
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.amazon.in/");
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 7",  Keys.ENTER);
			
			String x=driver.findElement(By.id("s-result-count")).getText();
			
			System.out.println(x.substring(0, 11));
		}
	}
}
