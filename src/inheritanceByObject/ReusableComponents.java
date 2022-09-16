package inheritanceByObject;

import org.junit.Test;

public class ReusableComponents //Ice Cream shop
{
	public ReusableComponents()
	{
		System.out.println("Clear the Temp Records in the DataBase");
		System.out.println("Open Google Chrome as Default Browser"); //By default butterscotch
	}
	
	public ReusableComponents(String browser) //constructor overloading
	{
		System.out.println("Clear the Temp Records in the DataBase");
		System.out.println("Open Browser of user choice :" + browser); //we have to write the code with if conditions to open the required browser
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
