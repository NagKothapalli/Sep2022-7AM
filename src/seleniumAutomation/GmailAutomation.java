package seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation {
	
	//Selenium IDE - Tool / Plugin , WebDriver - jar file
	//ChromeDriver , FiIrefoxDriver , InternetExplorerDriver
	String expectedTitle = "Gmail";
	@Test
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Application");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//Inside the constructor they wrote small code to open
		//an empty google chrome browser by executing the chrome.exe file
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
		driver.findElement(By.name("identifier")).sendKeys("nag022");
		
		/*
		 * WebElement email = driver.findElement(By.name("identifier")); email.click();
		 * email.sendKeys("dfdfdsfsdfsdds"); email.clear(); email.sendKeys("nag022");
		 */
	}
	
	public void loginToApplication()
	{
		//How to Enter my username  - Object Identification
	}
}
