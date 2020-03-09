package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Disabled");
		}
		else
		{
			System.out.println("Enabled");
		}
		
		
		//System.out.println(driver.findElement(By.cssSelector("input#ctl00_mainContent_view_date2"));
		//driver.findElement(By.cssSelector("input[value='OneWay']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input#ctl00_mainContent_view_date2")).isEnabled());
		//driver.close();
/*
		WebElement check1 = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		Assert.assertFalse(check1.isSelected());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='originStation1']")).sendKeys("hy");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='destinationStation1']")).sendKeys("mum");
		check1.click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i=0;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertTrue(check1.isSelected());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
		driver.close();
		System.out.println("TEST CASE PASSED!");*/
	}

}
