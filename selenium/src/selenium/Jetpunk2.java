package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jetpunk2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jetpunk.com/quizzes/fast-typing-to-hundred-quiz");
		driver.findElement(By.id("start-button")).click();
		//Thread.sleep(400);
		WebElement box = driver.findElement(By.id("txt-answer-box"));
		for(int i=1;i<=100;i++)
		{
			String val = Integer.toString(i);
			box.sendKeys(val);
		}
		
	}

}
