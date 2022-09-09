package basicConcepts;

import org.junit.Test;

public class SeleiumWithJunit
{
	@Test
	public void sendMail()
	{
		System.out.println("Please send mail");
	}
	//@Before , @After
	@Test  //junit annotation
	public  void addition()
	{
		//body - implementation
		int sum = 282+44; //int+int = int |  int+string  , string+int , string+string  = string		
		System.out.println("sum of two numbers :" + sum);
	}
	@Test
	public  void subtraction()
	{
		//body - implementation
		int sum = 282-44; //int+int = int |  int+string  , string+int , string+string  = string		
		System.out.println("difference of two numbers :" + sum);
	}
	@Test
	public  void multiplication()
	{
		//body - implementation
		int sum = 22*44; //int+int = int |  int+string  , string+int , string+string  = string		
		System.out.println("product of two numbers :" + sum);
	}
	@Test
	public  void division()
	{
		//body - implementation
		int sum = 242/44; //int+int = int |  int+string  , string+int , string+string  = string		
		System.out.println("division of two numbers :" + sum);
	}


}
