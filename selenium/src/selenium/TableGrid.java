package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23388/ire-vs-sco-6th-match-ireland-t20i-tri-series-2019");
		WebElement table1 = driver.findElement(By.xpath("//div[@id='innings_1']"));
		int rowCount = table1.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).size();
		System.out.println(rowCount);
		
		/*for (int i=0;i<rowCount;i++)
		{
			System.out.println(table1.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText());
		}*/
		
	}

}
////div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]

////div[@id='innings_1']/div/div[3]/div[3]
