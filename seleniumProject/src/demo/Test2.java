package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2
{
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone 7", Keys.ENTER);
		
		String x=driver.findElement(By.xpath("//span[contains(text(), 'Showing')]")).getText();
		
		System.out.println(x);
	}
}
