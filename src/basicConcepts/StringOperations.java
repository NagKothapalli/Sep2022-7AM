package basicConcepts;

import org.junit.Test;

public class StringOperations
{
	String a = "    Selenium Java Automation            ";
	@Test
	public void basicOperations()
	{
		int len = a.length();
		System.out.println("Length of the string :"+len);
		String aT = a.trim();
		System.out.println("Length of the string after trim :" + aT.length());
		String aL = a.trim().toLowerCase();
		System.out.println("String after lowercase :" + aL);
		String aU = a.trim().toUpperCase();
		System.out.println("String after uppercase :" + aU);
	}
	@Test
	public void subString()
	{
		String a8 = a.trim().substring(8);
		System.out.println("Substring from 8th char :"+a8);
		String a08 = a.trim().substring(0, 8);
		System.out.println("Substring from 0 to 7th char :" + a08);
	}
	
	String b = "JAVA";
	@Test
	public void stringContains()
	{
		//String aTL = a.trim().toLowerCase();
		//String bTL = b.trim().toLowerCase();
		//boolean flag = a.trim().contains(b);
		//boolean flag = aTL.contains(bTL);
		//boolean flag = a.trim().toLowerCase().contains(b.trim().toLowerCase());
		//if(flag == true)
		if(a.trim().toLowerCase().contains(b.trim().toLowerCase()))
		{
			System.out.println("a contains b");
		}
		else
		{
			System.out.println(" b is not there in a");
		}
	}
	String c = "        Selenium JAVA Automation   ";
	@Test
	public void stringEquals()
	{
		//Both must strings , must be same in length , must be same in case , must be same in character sequence
		//boolean flag = a.equals(c);
		//boolean flag = a.trim().toUpperCase().equals(c.trim().toUpperCase());
		boolean flag = a.trim().equalsIgnoreCase(c.trim());
		if(flag) // true
		{
			System.out.println("Both Stirngs are equal");
		}
		else
		{
			System.out.println("Both Strings are not equal");
		}
	}
	@Test
	public void characterAtIndex()
	{
		char c0 = a.trim().charAt(0);
		System.out.println("Character at 0th place :" + c0);
		int len = a.trim().length();
		for(int i=0;i<len;i++)
		{
			System.out.println(a.trim().charAt(i));
		}
	}
	
	//Write a program to know how many time a char is repeated in the given string
	@Test
	public void findCharacter()
	{
		String s = "Selenium Automation With Java";
		int len = s.length();
		int count = 0;
		for(int i=0;i<len;i++)// i=i+1
		{
			char ith_char = s.charAt(i); //i=0 1 2 3 4 5
			if(ith_char == 'a')
			{
				count++ ; // count = count+1;
			}
		}
		System.out.println("Char Count :" + count);
	}
	
	//concatenation
	@Test
	public void stringConcatenation()
	{
		String d = a+b+c;
		System.out.println(d);
		d = a.trim().concat(b.trim()).concat(c.trim());
		System.out.println(d);
	}
	
	//split
	
	
	
	
	
	
	
	
	
	
	
	
	

}
