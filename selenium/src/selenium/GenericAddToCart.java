package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericAddToCart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		String[] itemName = {"Beetroot","Mushroom","Carrot","Mango"};
		int j=0, i;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> itemsList =driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(i=0;i<itemsList.size();i++)
		{
			String [] compare = itemsList.get(i).getText().split("-");
			String compare2 = compare[0].trim();
			List specificItem = Arrays.asList(itemName); 
			if(specificItem.contains(compare2))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemName.length)
				{
					break;
				}
			}
		}
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		Thread.sleep(4000);
		driver.close();
	}
}