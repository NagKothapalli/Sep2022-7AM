package seleniumAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
	//Actions - mouseHover , scroll , double click , right click , drag and drop , click , sendKeys
	@Test
	public void specialMethodsInActions()
	{
		launchApplication();
		WebElement sourceCity = driver.findElement(By.xpath("//input[@name='source']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(sourceCity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).doubleClick().contextClick().build().perform();
		actions.dragAndDrop(sourceCity, sourceCity).build().perform();
	}
	//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	@Test
	public void handleMultipleWindows()
	{
		launchApplication();
		driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		driver.findElement(By.xpath("//a[text()='All services Time Table & Tracking']")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> mywindows = new ArrayList<String>(windows);
		for(int i=0;i<mywindows.size();i++)
		{
			System.out.println("SessionID of the widows :" + mywindows.get(i));			
		}
		System.out.println("Title 1st :" + driver.getTitle());
		driver.switchTo().window(mywindows.get(1)); // 0 , 1
		System.out.println("Title 2nd :" + driver.getTitle());
		driver.close();	//Current active window only will be closed
		//driver.quit(); //Will kill the complete driver process , all windows opened by the current driver instance will be closed
		driver.switchTo().window(mywindows.get(0));
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		//driver.close(); //Current active window only will be closed
		driver.quit();
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
