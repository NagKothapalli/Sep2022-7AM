package heirarchialInheritance;

import org.junit.Test;

public class TestCases_Module1 extends ReusableComponents  //Ram
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

}
