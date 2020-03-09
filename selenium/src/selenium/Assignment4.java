package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	//Switching between multiple windows
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(@href,'windows')]")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		
		
		//switching to the child window
		Set<String> s=driver.getWindowHandles();
		Iterator<String> itr=s.iterator();
		String parentID=itr.next();
		String childID=itr.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.close();
		
		
		
		//switching back to the original window
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		Thread.sleep(2000);
		driver.close();
		
	}

}
