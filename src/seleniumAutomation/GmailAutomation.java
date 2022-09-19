package seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {
	
	//Selenium IDE - Tool / Plugin , WebDriver - jar file
	//ChromeDriver , FiIrefoxDriver , InternetExplorerDriver
	@Test
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Application");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//Inside the constructor they wrote small code to open
		//an empty google chrome browser by executing the chrome.exe file
		driver.get("https://gmail.com");
		
	}

}
