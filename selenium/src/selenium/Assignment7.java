package selenium;

import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment7 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver=new FirefoxDriver();
		int numberOfRows, numberOfCols;
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		
		//Calculate the number of rows
		numberOfRows = table.findElements(By.tagName("tr")).size();
		System.out.println("ROWS: "+numberOfRows);
		
		//Calculate the number of columns
		WebElement secondRow = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]"));
		numberOfCols = secondRow.findElements(By.tagName("td")).size();
		System.out.println("COLS: "+numberOfCols);
		
		//Iterating through the second row to grab the text and put it into a String array and printing it.
		String a[]= new String[3];
		for(int i=0;i<numberOfCols;i++)
		{
			String printGrab = secondRow.findElements(By.tagName("td")).get(i).getText();
			a[i]=printGrab;
		}
		System.out.println("Contents of the second row: "+Arrays.toString(a));
	}
}