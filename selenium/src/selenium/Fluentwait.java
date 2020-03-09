package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		//Fluent Wait
		
		Wait <WebDriver> wt = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		WebElement ele=wt.until(new Function<WebDriver,WebElement>()
		{
			public WebElement apply (WebDriver driver)
			{
				if( driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed())
				{
					return driver.findElement(By.xpath("//div[@id='finish']/h4"));
				}
				else 
				{
					return null;
				}
			}
		}
		);
		System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());
		Thread.sleep(2000);
		driver.close();
				
			
			
	}

}
