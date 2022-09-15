package inheritanceByObject;

import org.junit.Test;
//            Child               parent
public class TestCases // extends ReusableComponents
{
	//Modifier ClassName                objName  = new Constructor();
	  public   ReusableComponents        rc      = new ReusableComponents(); //Default constructor
	  
	//***********************Test Cases ****************************
	@Test
	public void composeAndSendAnMail()
	{
		System.out.println("Test Case : Compose And Send An Email");
		//launch , login , compose , send , logout , close	
		rc.launchApplication();
		rc.loginToApplication();
		rc.compose();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	
	@Test
	public void replyToAnMail()
	{
		System.out.println("Test Case : Reply to An Email");
		//launch , login , open , reply , logout , close
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();		
	}
	@Test
	public void forwardAnMail()
	{
		System.out.println("Test Case : Forward An Email");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();		
	}
	@Test
	public void deleteAnMail()
	{
		System.out.println("Test Case : Delete An Email");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}

}
