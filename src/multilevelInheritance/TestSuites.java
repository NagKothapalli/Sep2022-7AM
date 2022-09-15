package multilevelInheritance;

import org.junit.Test;
//               a                b                    c    : a -> c
//             grand child       immediate parent         grand parent
//             child             parent  
public class TestSuites extends TestCases //,ReusableComponents  //Multiple Inheritance
{
	/*
	 * public void launchApplication() {
	 * System.out.println("RC : Launch Application from TS"); }
	 */
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
