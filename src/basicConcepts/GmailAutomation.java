package basicConcepts;

import org.junit.Test;

public class GmailAutomation
{
	//***********************Test Cases ****************************
	@Test
	public void composeAndSendAnMail()
	{
		System.out.println("Test Case : Compose And Send An Email");
		//launch , login , compose , send , logout , close		
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	
	@Test
	public void replyToAnMail()
	{
		System.out.println("Test Case : Reply to An Email");
		//launch , login , open , reply , logout , close
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void forwardAnMail()
	{
		System.out.println("Test Case : Forward An Email");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
		
	}
	@Test
	public void deleteAnMail()
	{
		System.out.println("Test Case : Delete An Email");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	//************Reusable Components ********************************
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		//launch application code
		//open browser
		//maximize
		//call url
		//verify the title
		//verify the home page
	}
	
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	public void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
	public void compose()
	{
		System.out.println("RC : Compose Email");
	}
	public void send()
	{
		System.out.println("RC : Send Email");
	}
	public void open()
	{
		System.out.println("RC : Open Email");
	}
	public void reply()
	{
		System.out.println("RC : Reply Email");
	}
	public void forward()
	{
		System.out.println("RC : Forward Email");
	}
	public void delete()
	{
		System.out.println("RC : Delete Email");
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
