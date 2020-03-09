package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
	}

}
