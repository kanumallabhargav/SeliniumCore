package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		Select adult=new Select(driver.findElement(By.id("Adults")));
		adult.selectByIndex(4);
		Thread.sleep(1000);
		Select child=new Select(driver.findElement(By.id("Childrens")));
		child.selectByIndex(3);
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		driver.findElement(By.cssSelector("a#MoreOptionsLink")).click();
		driver.findElement(By.cssSelector("input#AirlineAutocomplete")).sendKeys("Air India");
		driver.findElement(By.cssSelector("input#SearchBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector(".lineMessage.ugly.icon")).getText());
		Thread.sleep(1000);
		driver.close();
	}

}
