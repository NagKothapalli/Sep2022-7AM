package basicConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	int a = 22; //instance variable  / global
	int b = 25;
	//if(expression -> boolean : true/false){ task } 
	//a+b = c+d , =  , ==
	@Test
	public void compareNumbers()
	{
		System.out.println("Number One : "+ a);
		System.out.println("Number Two : "+ b);
		if(a==b)
		{ //true
			//Task - sum of numbers
			int sum = a+b;
			System.out.println("Sum of two numbers :" + sum);
		}		
	}
	@Test
	public void compareNumbers_ifelse()
	{
		System.out.println("Number One : "+ a);
		System.out.println("Number Two : "+ b);
		if(a==b)
		{ //true
			//Task - sum of numbers
			int sum = a+b;
			System.out.println("Sum of two numbers :" + sum);
		}	
		else
		{
			int diff = a-b;
			System.out.println("Difference of two numbers :" + diff);
		}
	}
	@Test
	public void compareNumbers_elseif_test() //unit testing
	{
		compareNumbers_elseif(55,55);  // code coverage = lines covered / total lines * 100    =  6/18  *100 = 33.333 %
		compareNumbers_elseif(255,55);
		compareNumbers_elseif(55,545);
	}
	//Write a program to read two numbers as inputs and perform addition if they are equal , subtraction if a>b , product if a < b
	public void compareNumbers_elseif(int a,int b)
	{
		System.out.println("Number One : "+ a);
		System.out.println("Number Two : "+ b);
		if(a==b)
		{ //true
			//Task - sum of numbers
			int sum = a+b;
			System.out.println("Sum of two numbers :" + sum);
		}	
		else if(a>b)
		{
			int diff = a-b;
			System.out.println("Difference of two numbers :" + diff);
		}
		else if(a<b)
		{
			int prod = a*b;
			System.out.println("Product of two numbers :" + prod);
		}
	}
	
	//Write a program to read two numbers as inputs and perform the below task if and only if both inputs are above 10
	 //Task : perform addition if they are equal , subtraction if a>b , product if a < b
	@Test
	public void logicalOperators_test()
	{
		logicalOperators(4,8);
		logicalOperators(14,8);
		logicalOperators(4,58);
		logicalOperators(24,24);
		logicalOperators(244,24);
		logicalOperators(24,274);
	}
	public void logicalOperators(int a, int b)
	{
		System.out.println("Number One : "+ a);
		System.out.println("Number Two : "+ b);
		if((a>10) && (b>10)) //Outer if  // T && T  -> T  // && -Logical Operator
		{ //true
			//Task  // Condition inside a condition - Nested if Condition
			if(a==b) //Inner if condition // == , > , <  - Relational Operator
			{ //true
				//Task - sum of numbers
				int sum = a+b;  // + , - , / , * - Arithmetic Operators
				System.out.println("Sum of two numbers :" + sum);
			}	
			else if(a>b)
			{
				int diff = a-b;  // =  - Assignment Operator
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(a<b)
			{
				int prod = a*b;
				System.out.println("Product of two numbers :" + prod);
			}
		}
		else //  F T , T F , F F -> F
		{ //false
			System.out.println("Your Task is not performed because both or anyone of the inputs might be below 10");
		}
	}
	
	//Write a program to find the given number is Even or Odd
	@Test
	public void findEvenOdd_test()
	{
		findEvenOdd(22);
		findEvenOdd(25);
	}
	public void findEvenOdd(int num)
	{
		System.out.println("Given Number :" + num);
		// if the number is divisible by 2[Reminder = 0 ] then that is a even .
		// Num / 2 -> Q   Num % 2  -> R
		int reminder = num % 2 ;
		if(reminder == 0)
		{
			System.out.println("Given Nmber is EVEN");
		}
		else
		{
			System.out.println("Given Number is ODD");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
