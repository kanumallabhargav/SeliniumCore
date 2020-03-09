package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Siblings {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver=new FirefoxDriver();
		/*driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("type");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@type='submit']")).click();*/
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i=1;i<=5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.close();
	}

}
