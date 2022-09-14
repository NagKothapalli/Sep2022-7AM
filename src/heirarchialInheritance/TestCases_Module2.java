package heirarchialInheritance;

import org.junit.Test;

public class TestCases_Module2 extends ReusableComponents // Raj
{
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
