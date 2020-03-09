package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButton 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		/*driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Milk']")).click();
		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		for(int i=0;i<count;i++)
		{
		//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		if(text.equals("Cheese"))
		{
		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		}*/

		
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		WebElement check1 = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		//check1.click();
		//System.out.println(check1.isSelected());
		
		Assert.assertFalse(check1.isSelected());
		
		
		
		Thread.sleep(5000);
		//driver.close();
	}


}


