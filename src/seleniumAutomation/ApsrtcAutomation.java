package seleniumAutomation;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation {
	
	//class                    Constructor
	//ChromeDriver cdriver = new ChromeDriver();
	//Interface - WebDriver  this was implemented by class ChromeDriver , FirefoxDriver , InternetExplorerDriver , EdgeDriver
	WebDriver  driver;
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void launchApplication()
	{
		System.out.println("Launch Application");
		driver.get("https://www.apsrtconline.in/");
	}
	@Test
	public void bookBusTicket() throws InterruptedException
	{
		System.out.println("Book Bus Ticket");
		launchApplication();
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		WebElement sourceCity = driver.findElement(By.xpath("//input[@name='source']"));
		//Thread.sleep(1000);
		Actions actions = new Actions(driver);
		//actions.sendKeys(Keys.ENTER).perform();
		actions.moveToElement(sourceCity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='searchBtn']"));
		actions.moveToElement(searchBtn).click().build().perform();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		selectJourneyDate("10");		
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}
	
	public void selectJourneyDate(String mydate)
	{
		driver.findElement(By.xpath("//a[text()='"+mydate+"']")).click(); //a[text()='10']
	}
	
	
	

}
