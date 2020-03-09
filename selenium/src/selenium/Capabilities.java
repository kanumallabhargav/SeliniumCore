package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {

	public static void main(String[] args) throws IOException 
	{
		DesiredCapabilities desiredCapabilitiesObject = DesiredCapabilities.chrome();
		desiredCapabilitiesObject.acceptInsecureCerts();
		ChromeOptions chromeOptionsObject = new ChromeOptions();
		chromeOptionsObject.merge(desiredCapabilitiesObject);
		System.setProperty("webdriver.chrome.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/chromedriver");
		WebDriver driver=new ChromeDriver(chromeOptionsObject);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("www.google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(""));
	}

}
