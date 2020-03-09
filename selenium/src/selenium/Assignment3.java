package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[contains(@href, 'loadAjax')]")).click();
		WebDriverWait w = new WebDriverWait(driver, 7);
		System.out.println(w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#results"))).getText());
		driver.close();
	}

}
