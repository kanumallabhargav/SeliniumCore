package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumMobileTest {

	public AppiumDriver<MobileElement> driver;
	@Test
	public void launchCalculator() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","Munna");
		cap.setCapability("udid","7b6c7f7e");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9");
		cap.setCapability("appPackage","com.android.Calculator2");
		cap.setCapability("appActivity","com.android.Calculator2.cal.CalculatorActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	}

}
