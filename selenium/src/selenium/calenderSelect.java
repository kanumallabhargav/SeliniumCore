package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderSelect {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		List<WebElement> dates = driver.findElements(By.className("day"));
		for (int i=0;i<dates.size();i++)
		{
			String comp = dates.get(i).getText();
			if(comp.equalsIgnoreCase("26"))
			{
				dates.get(i).click();
			}
		}
	}

}
