package selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).click();
		
		ArrayList<Boolean> l = new ArrayList<>();
		//METHOD ONE -------> BASIC LOGIC
		/*driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("hyd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(@class,'primaryBtn')]")).click();*/
		
		//METHOD TWO -------> CODE COMPRESSING
		WebElement to=driver.findElement(By.xpath("//input[@placeholder='From']"));
		to.sendKeys("mum");
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='To']"));
		from.sendKeys("hyd");
		Thread.sleep(2000);
		for(int i=0;i<4;i++)
		{
		from.sendKeys(Keys.ARROW_DOWN);
		}
		from.sendKeys(Keys.ENTER);
		
	}

}
