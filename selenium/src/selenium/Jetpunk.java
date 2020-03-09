package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jetpunk {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jetpunk.com/user-quizzes/63858/countries-of-the-world-one-minute-sprint");
		driver.findElement(By.id("start-button")).click();
		//Thread.sleep(400);
		WebElement box = driver.findElement(By.id("txt-answer-box"));
		
		//Asia
		box.sendKeys("kazakhstan");
		box.sendKeys("uzbekistan");
		box.sendKeys("tajikistan");
		box.sendKeys("turkmenistan");
		box.sendKeys("kyrgyzstan");
		box.sendKeys("afghanistan");
		box.sendKeys("pakistan");
		box.sendKeys("iran");
		box.sendKeys("iraq");
		box.sendKeys("syria");
		box.sendKeys("lebanon");
		box.sendKeys("jordan");
		box.sendKeys("israel");
		box.sendKeys("kuwait");
		box.sendKeys("qatar");
		box.sendKeys("bahrain");
		box.sendKeys("saudi arabia");
		box.sendKeys("yemen");
		box.sendKeys("oman");
		box.sendKeys("uae");
		box.sendKeys("mongolia");
		box.sendKeys("china");
		box.sendKeys("north korea");
		box.sendKeys("south korea");
		box.sendKeys("taiwan");
		box.sendKeys("philippines");
		box.sendKeys("japan");
		box.sendKeys("myanmar");
		box.sendKeys("laos");
		box.sendKeys("cambodia");
		box.sendKeys("thailand");
		box.sendKeys("vietnam");
		box.sendKeys("malaysia");
		box.sendKeys("indonesia");
		box.sendKeys("singapore");
		box.sendKeys("east timor");
		box.sendKeys("brunei");
		box.sendKeys("nepal");
		box.sendKeys("bhutan");
		box.sendKeys("bangladesh");
		box.sendKeys("sri lanka");
		box.sendKeys("maldives");
		box.sendKeys("india");
		box.sendKeys("turkey");
		box.sendKeys("georgia");
		box.sendKeys("armenia");
		box.sendKeys("azerbaijan");
		box.sendKeys("cyprus");
		
		//Europe
		box.sendKeys("iceland");
		box.sendKeys("ireland");
		box.sendKeys("uk");
		box.sendKeys("portugal");
		box.sendKeys("spain");
		box.sendKeys("france");
		box.sendKeys("germany");
		box.sendKeys("italy");
		box.sendKeys("switzerland");
		box.sendKeys("andorra");
		box.sendKeys("monaco");
		box.sendKeys("san marino");
		box.sendKeys("leichtenstien");
		box.sendKeys("vatican");
		box.sendKeys("austria");
		box.sendKeys("poland");
		box.sendKeys("czechia");
		box.sendKeys("luxembourg");
		box.sendKeys("belgium");
		box.sendKeys("netherlands");
		box.sendKeys("denmark");
		box.sendKeys("norway");
		box.sendKeys("sweden");
		box.sendKeys("finland");
		box.sendKeys("estonia");
		box.sendKeys("latvia");
		box.sendKeys("lithuania");
		box.sendKeys("belarus");
		box.sendKeys("ukraine");
		box.sendKeys("moldova");
		box.sendKeys("romania");
		box.sendKeys("bulgaria");
		box.sendKeys("hungary");
		box.sendKeys("slovakia");
		box.sendKeys("slovenia");
		box.sendKeys("bosnia");
		box.sendKeys("croatia");
		box.sendKeys("montenegro");
		box.sendKeys("macedonia");
		box.sendKeys("greece");
		box.sendKeys("albania");
		box.sendKeys("kosovo");
		box.sendKeys("serbia");
		box.sendKeys("malta");
		box.sendKeys("russia");
		
		//North America
		box.sendKeys("canada");
		box.sendKeys("usa");
		box.sendKeys("mexico");
		box.sendKeys("panama");
		box.sendKeys("costa rica");
		box.sendKeys("nicaragua");
		box.sendKeys("el salvador");
		box.sendKeys("guatemala");
		box.sendKeys("honduras");
		box.sendKeys("belize");
		box.sendKeys("bahamas");
		box.sendKeys("cuba");
		box.sendKeys("dominica");
		box.sendKeys("dominican republic");
		box.sendKeys("jamaica");
		box.sendKeys("st lucia");
		box.sendKeys("st vincent");
		box.sendKeys("st kitts");
		box.sendKeys("trinidad");
		box.sendKeys("antigua");
		box.sendKeys("grenada");
		box.sendKeys("barbados");
		box.sendKeys("haiti");
		
		//South America
		box.sendKeys("chile");
		box.sendKeys("argentina");
		box.sendKeys("brazil");
		box.sendKeys("paraguay");
		box.sendKeys("uruguay");
		box.sendKeys("bolivia");
		box.sendKeys("peru");
		box.sendKeys("colombia");
		box.sendKeys("ecuador");
		box.sendKeys("venezuela");
		box.sendKeys("suriname");
		box.sendKeys("guyana");
		
		//Australia and Oceania
		box.sendKeys("Australia");
		box.sendKeys("new zealand");
		box.sendKeys("papua new guinea");
		box.sendKeys("micronesia");
		box.sendKeys("vanuatu");
		box.sendKeys("fiji");
		box.sendKeys("solomon islands");
		box.sendKeys("marshall islands");
		box.sendKeys("kiribati");
		box.sendKeys("nauru");
		box.sendKeys("tuvalu");
		box.sendKeys("palau");
		box.sendKeys("samoa");
		box.sendKeys("tonga");
		
		//Africa
		box.sendKeys("egypt");
		box.sendKeys("algeria");
		box.sendKeys("libya");
		box.sendKeys("tunisia");
		box.sendKeys("morocco");
		box.sendKeys("mauritania");
		box.sendKeys("niger");
		box.sendKeys("chad");
		box.sendKeys("mali");
		box.sendKeys("sudan");
		box.sendKeys("south sudan");
		box.sendKeys("eritria");
		box.sendKeys("ethiopia");
		box.sendKeys("djibouti");
		box.sendKeys("somalia");
		box.sendKeys("kenya");
		box.sendKeys("tanzania");
		box.sendKeys("mozambique");
		box.sendKeys("rwanda");
		box.sendKeys("uganda");
		box.sendKeys("burundi");
		box.sendKeys("malawi");
		box.sendKeys("lesotho");
		box.sendKeys("eswatini");
		box.sendKeys("south africa");
		box.sendKeys("namibia");
		box.sendKeys("angola");
		box.sendKeys("botswana");
		box.sendKeys("zimbabwe");
		box.sendKeys("zambia");
		box.sendKeys("congo");
		box.sendKeys("madagascar");
		box.sendKeys("comoros");
		box.sendKeys("sao tome");
		box.sendKeys("cape verde");
		box.sendKeys("seychelles");
		box.sendKeys("mauritius");
		box.sendKeys("cameroon");
		box.sendKeys("nigeria");
		box.sendKeys("central african republic");
		box.sendKeys("burkina faso");
		box.sendKeys("benin");
		box.sendKeys("ivory coast");
		box.sendKeys("sierra leone");
		box.sendKeys("senegal");
		box.sendKeys("togo");
		box.sendKeys("gabon");
		box.sendKeys("ghana");
		box.sendKeys("gambia");
		box.sendKeys("guinea");
		box.sendKeys("guinea bissau");
		box.sendKeys("equatorial guinea");
		box.sendKeys("liberia");
		//Thread.sleep(6000);
		
		//US states
		/*driver.get("https://www.jetpunk.com/quizzes/50-states-one-minute-quiz");
		driver.findElement(By.id("start-button")).click();
		WebElement box = driver.findElement(By.id("txt-answer-box"));
		Thread.sleep(2000);
		box.sendKeys("washington");
		box.sendKeys("california");
		box.sendKeys("nevada");
		box.sendKeys("idaho");
		box.sendKeys("montana");
		box.sendKeys("north dakota");
		box.sendKeys("south dakota");
		box.sendKeys("nebraska");
		box.sendKeys("colorado");
		box.sendKeys("wyoming");
		box.sendKeys("utah");
		box.sendKeys("arizona");
		box.sendKeys("new mexico");
		box.sendKeys("texas");
		box.sendKeys("oklahoma");
		box.sendKeys("alabama");
		box.sendKeys("mississippi");
		box.sendKeys("louisiana");
		box.sendKeys("georgia");
		box.sendKeys("florida");
		box.sendKeys("north carolina");
		box.sendKeys("south carolina");
		box.sendKeys("iowa");
		box.sendKeys("michigan");
		box.sendKeys("wisconsin");
		box.sendKeys("minnesota");
		box.sendKeys("illinois");
		box.sendKeys("kansas");
		box.sendKeys("missouri");
		box.sendKeys("indiana");
		box.sendKeys("ohio");
		box.sendKeys("tennessee");
		box.sendKeys("kentucky");
		box.sendKeys("new york");
		box.sendKeys("Pennsylvania");
		box.sendKeys("Connecticut");
		box.sendKeys("vermont");
		box.sendKeys("maine");
		box.sendKeys("new hampshire");
		box.sendKeys("maryland");
		box.sendKeys("alaska");
		box.sendKeys("hawaii");
		box.sendKeys("Massachusetts");
		box.sendKeys("virginia");
		box.sendKeys("west virginia");
		box.sendKeys("rhode island");
		box.sendKeys("delaware");
		box.sendKeys("oregon");
		box.sendKeys("new jersey");
		box.sendKeys("arkansas");*/
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='blue close']")).click();
		
		/*Actions act = new Actions(driver);
		for (int i=0;i<10;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(4000);*/
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.quit();
	}

}
