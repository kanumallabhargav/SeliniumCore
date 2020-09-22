package selenium;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actionsdemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).release().build().perform();  //mouse hover
		
	//driver.switchTo().window(arg0);
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//File SrcFile=scrShot.getScreenshotAs(OutputType.);
		
		WebElement element = driver.findElement(By.xpath(""));
		Select select = new Select(element);
		List<WebElement> SO = select.getAllSelectedOptions();
		String S = SO.toString();
		System.out.println(S);
		
		//click and enter info
		act.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();  
		act.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox")));
		
		
		act.moveToElement(driver.findElement(By.xpath("//a[contains(@href,'UTF8&node=')]"))).contextClick().build().perform();
		driver.close();
	}
}
