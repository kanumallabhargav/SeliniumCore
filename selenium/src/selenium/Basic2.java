package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic2
{

	public static void main(String[] args) 
	{
		//X-path locator
		
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("abcd");
		driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	}

}





//*[@id='forgot_password_link']

//$x("//*[@id='forgot_password_link']")