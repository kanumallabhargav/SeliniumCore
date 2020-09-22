package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demos123 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		String tg = footerdriver.getTagName();
		System.out.println(tg);
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		//FindElements isa bhi use karsakte; baigan
	}

}
