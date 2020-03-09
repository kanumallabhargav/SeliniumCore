package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentOne {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		Thread.sleep(2000);
		WebElement check1 = driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
		check1.click();
		Assert.assertTrue(check1.isSelected());
		check1.click();
		Assert.assertFalse(check1.isSelected());
		System.out.println("TEST CASE PASSED!");
		
		System.out.println("Number of checkboxes: "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(3000);
		driver.close();
	}

}
