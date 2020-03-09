package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 
{
    //Handling autoSuggest dropDowns
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement textBox = driver.findElement(By.id("autocomplete"));
		
		//Typing first three letters of Malaysia into the text box
		textBox.sendKeys("mal");
		
		//Pressing the down arrow for 4 times
		for (int i=0;i<=4;i++)
		{ textBox.sendKeys(Keys.ARROW_DOWN); }
		
		//Using the JavascriptExecutor to grab the hidden text
		JavascriptExecutor jsExe= (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String output=(String) jsExe.executeScript(script);
		System.out.println(output);
	}

}
