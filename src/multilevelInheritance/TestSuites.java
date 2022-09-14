package multilevelInheritance;

import org.junit.Test;
//             grand child       immediate parent         grand parent
//             child             parent  
public class TestSuites extends TestCases
{
	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		//launchApplication();
		composeAndSendAnMail();
		replyToAnMail();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnMail();
		replyToAnMail();
		forwardAnMail();
		deleteAnMail();
	}
}
