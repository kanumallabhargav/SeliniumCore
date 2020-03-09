package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");//go to the URL
		System.out.println(driver.getTitle());//validate the title
		System.out.println(driver.getCurrentUrl());//validate the URL 
		//System.out.println(driver.getPageSource());
		/*driver.get("http://yahoo.com");
		driver.navigate().back();*/
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("bhargavkanmalla@yahoo.in");
		driver.findElement(By.id("pass")).sendKeys("Munna1shailaja");
		/*driver.findElement(By.id("u_0_a")).click();
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.className("_54nh")).click();*/
		driver.get("http://oracle.com");
		try
		{
			driver.findElement(By.id("uh-signin"));
		driver.get("http://9gag.com");
		}
		catch (Exception e)
		{
			driver.get("http://google.com");
		}
		
	}

}
