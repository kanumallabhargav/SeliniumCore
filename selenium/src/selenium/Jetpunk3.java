package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jetpunk3 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/helpers/idAndPasswords.properties");
		prop.load(fis);
		
		String userName = prop.getProperty("jetpunkId");
		String password = prop.getProperty("jetpunkPassword");

		driver.get("https://www.jetpunk.com/quizzes/fast-math-double-that-number");
		
		//login Begin
		driver.findElement(By.xpath("//*[@id=\"inner-page\"]/div[1]/div/div[4]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div[2]/div[1]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div[2]/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div[2]/div[3]/button")).click();

		String closeMark = "/html/body/div/div/div[6]/div[2]/div/div[1]/div[2]/span";
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(closeMark)));
		driver.findElement(By.xpath(closeMark)).click();
		//login End
		
		driver.findElement(By.id("start-button")).click();

		WebElement inputBox = driver.findElement(By.id("txt-answer-box"));

		for (int colNumber=1;colNumber<=4;colNumber++)
		{
			for (int rowNumber=2;rowNumber<=6;rowNumber++)
			{
				WebElement table = driver.findElement(By.xpath(xpathFramer(colNumber, rowNumber)));
				String inputString = table.getText();
				int input = Integer.parseInt(inputString);
				int output = add(input);
				String outputString = String.valueOf(output);
				inputBox.sendKeys(outputString);
			}
		}	
		driver.quit();
	}
	public static int add(int input)
	{
		int output = input*2;
		return output;
	}
	public static String xpathFramer(int colNumber, int rowNumber)
	{
		String xpathLeft = "//*[@id=\"grid\"]/table/tbody/tr/td[";
		String xpathCenter = "]/table/tbody/tr[";
		String xpathRight = "]/td[1]/div";

		String xpathFinal = xpathLeft+colNumber+xpathCenter+rowNumber+xpathRight;
		return xpathFinal;
	}
}
