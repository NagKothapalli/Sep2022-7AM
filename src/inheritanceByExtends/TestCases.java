package inheritanceByExtends;

import org.junit.Test;
//            Child               parent
public class TestCases extends ReusableComponents
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

}
