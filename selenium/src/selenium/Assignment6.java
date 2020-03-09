package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
		String name = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		driver.findElement(By.id("dropdown-class-example")).click();
		
		//dropDown menu
		Select dropdown= new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		dropdown.selectByVisibleText(name);
		
		//passing the string into the textBox
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(name);
		
		//Click the alert button and grab the text on it
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
	}

}
