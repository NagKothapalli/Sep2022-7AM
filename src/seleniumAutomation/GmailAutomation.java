package seleniumAutomation;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation {
	
	//Selenium IDE - Tool / Plugin , WebDriver - jar file
	//ChromeDriver , FiIrefoxDriver , InternetExplorerDriver
	String expectedTitle = "Gmail";
	ChromeDriver driver; //null
	String name; //null
	//java.lang.NullPointerException
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"*[name='identifier']"}
	public GmailAutomation()
	{
		name = "Ram";
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//Inside the constructor they wrote small code to open
		//an empty google chrome browser by executing the chrome.exe file
	}
	@Test
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Application");
		System.out.println("Student Name :" + name);
		driver.get("https://gmail.com");
		String actualTitle = driver.getTitle();
		System.out.println("the current title :"+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		String session = driver.getWindowHandle();
		System.out.println("Session ID :"+session);		
		String c_url = driver.getCurrentUrl();
		System.out.println("Current URL :" + c_url);
		System.out.println("My Current URL :" + driver.getCurrentUrl());
		//Validation (or) Assertion
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title Verifcation is PASSED");
		}
		else
		{
			System.out.println("Title Validation FAILED");
		}
		//Assert myassert = new Assert();		
		Assert.assertEquals("My Title Validation is Failed", expectedTitle, actualTitle);
		
		
		/*
		 * WebElement email = driver.findElement(By.name("identifier")); email.click();
		 * email.sendKeys("dfdfdsfsdfsdds"); email.clear(); email.sendKeys("nag022");
		 */
	}
	//All variables will be loaded -> Constructor will be executed -> Launch -> Login
	//Selectors / Locators : id , name , class , linkText , partialLinkText , cssSelector , xpath
	//WebDriver : get() , getTitle() , getUrl() , getWindowHandle() , findElement() , findElements()
	//WebElement : click() , clear() , sendKeys() , getText() ,
	//Exceptions : NullPointerExcpetion , NoSuchElementException ,
	@Test
	public void loginToApplication()
	{
		launchApplication();
		//How to Enter my username  - Object Identification
		//driver.findElement(By.name("identifier")).sendKeys("nag022");
		//driver.findElement(By.id("identifierId")).sendKeys("nag022");
		driver.findElement(By.xpath("//input[@name='identifier'  or @id='identifierId']")).sendKeys("nag022");
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		WebElement element = elements.get(1);
		element.click();
	}
	
	@Test
	public void createAccount()
	{
		launchApplication();
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		WebElement element = elements.get(2);  //0 1 2
		element.click();
	}
	@Test
	public void createAccount_getText()
	{
		launchApplication();
		/*
		 * List<WebElement> elements =
		 * driver.findElements(By.className("VfPpkd-vQzf8d")); //Create account for(int
		 * i=0;i<elements.size();i++) { String mytext = elements.get(i).getText();
		 * System.out.println("Text of element :" + mytext);
		 * if(mytext.equals("Create account")) { elements.get(i).click(); break; } }
		 */
		//driver.findElement(By.xpath("//span[text()='Create account']")).click();
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d'  and text()='Create account']")).click();
	}
	//XPATH : Absolute xpath  /  Static xpath / fixed static 
	// /html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button
	//Relative xpath : like SQL select query  - select Salary from Emp where EmpName='Ram'
	
	//tagName[@attribute=value]   ->  Ex : //button[@jsname='Cuz2Ue']
	//tagName[text()='value']     ->  Ex : //span[text()='Create account']
	
	//*[@attribute=value]   ->  Ex : //*[@jsname='Cuz2Ue']
	//*[text()='value']     ->  Ex : //*[text()='Create account']
	
	//tagName[contains(@attribute,value)]   ->  Ex : //button[contains(@jsname,'Cuz2Ue')]
	//tagName[contains(text(),'value')]     ->  Ex : //span[contains(text(),'Create')]
	
	//tagName[@attribute1='value'  and @attribute2='value']   -> Ex : //span[@class='VfPpkd-vQzf8d'  and @jsname='Cuz2Ue']
	//tagName[@attribute1='value'  and text()='value']   -> Ex : //span[@class='VfPpkd-vQzf8d'  and text()='Create account']
	
	//tagName[@attribute1='value'  or  @attribute2='value']   -> Ex : //input[@name='identifier'  or @id='identifierId']
	//tagName[@attribute1='value'  or  text()='value']   -> Ex : 
	
	//relative xpath with parent child relationship
	
	@Test
	public void forgotEmail()
	{
		launchApplication();
		//driver.findElement(By.tagName("button")).click();
		//List<WebElement> elements = driver.findElements(By.tagName("button"));
		//WebElement element = elements.get(0);  //0 1 2
		//element.click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
		driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
	}
	@Test
	public void learnMore()
	{
		launchApplication();
		//driver.findElement(By.tagName("button")).click();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		WebElement element = elements.get(0);  //0 1 2
		element.click();
	}
	@Test
	public void learnMore_getText()
	{
		launchApplication();
		//driver.findElement(By.tagName("button")).click();
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("a")); for(int
		 * i=0;i<elements.size();i++) { String mytext = elements.get(i).getText();
		 * if(mytext.equals("Learn more")) { elements.get(i).click(); break; } }
		 */
		driver.findElement(By.xpath("//a[text()='Learn more']")).click();
	}
	
	@Test
	public void learnMore_linkText()
	{
		launchApplication();
		//driver.findElement(By.linkText("Learn more")).click();
		driver.findElement(By.partialLinkText("Learn")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
