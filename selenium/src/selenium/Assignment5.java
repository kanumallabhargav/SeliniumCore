package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	
	//Nested frames
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
		//Switching to the first frame
		driver.switchTo().frame(0);
		//Switching to the second frame nested inside
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
		driver.close();
	}

}
