package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.google.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys("msubhajitsahoo");
		
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		driver.findElement(By.name("password")).sendKeys("selina90",Keys.ENTER);
		
		String s=driver.findElement(By.partialLinkText("Inbox")).getText();
	
		System.out.println(s.substring(7, s.length()-1));
		
		WebElement e= driver.findElement(By.xpath("//*[@id=':2c']"));
		
		Actions a= new Actions(driver);
		
		a.click(e).build().perform();
		
		Thread.sleep(5000);
		
		a.sendKeys(Keys.DOWN).build().perform();
		
		Thread.sleep(5000);
		
		a.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(5000);
		
		String s1=driver.findElement(By.xpath("//*[@id=':24']")).getText();
		
		System.out.println(s1);
		
				 
		driver.close();
		
	}
}
