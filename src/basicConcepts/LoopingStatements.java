package basicConcepts;

import org.junit.Test;

public class LoopingStatements
{
	//Perform a Task repeatedly for n number of times . 
	//Till 6 pm pls do this task .
	//Please do this task till he comes .
	
	//for(int iterator=1;condition;step size){ Task } 
	
	//for(int i=1;i<100;i=i+1){ Take the steps - Task }
	//for(int i=1;i<50;i=i+1){ Apply Color to Step - Task }
	
	//Write a program to apply color to the steps in a building
	//Write a program to print first 100 numbers
	@Test
	public void applyColor()
	{
		for(int i=1;i<=100;i=i+1) // i = 1 1<100->true , 2<100->true , 3<100->true , 4<100->true ,....99<100->true,100<=100->true
		{ //as long as the condition gives a true value then the loop will be repeated  (or) task will be executed
			//Task : Apply color to steps
			System.out.println("Apply Color to Step :" + i);
		}
	}
	
	@Test
	public void applyColor_iterator()
	{
		System.out.println("Apply Color Task : Day 1");
		for(int i=1;i<=50;i=i+1) // i = 1 1<100->true , 2<100->true , 3<100->true , 4<100->true ,....99<100->true,100<=100->true
		{ //as long as the condition gives a true value then the loop will be repeated  (or) task will be executed
			//Task : Apply color to steps
			System.out.println("Apply Color to Step :" + i);
		}
		System.out.println("Apply Color Task : Day 2");
		for(int i=51;i<=100;i=i+1) // i = 1 1<100->true , 2<100->true , 3<100->true , 4<100->true ,....99<100->true,100<=100->true
		{ //as long as the condition gives a true value then the loop will be repeated  (or) task will be executed
			//Task : Apply color to steps
			System.out.println("Apply Color to Step :" + i);
		}
	}
	@Test
	public void applyColor_multicolor()
	{
		for(int i=1;i<100;i=i+2)  // i=1 , 3 , 5 ,7
		{
			System.out.println("Apply Green Color to step :" + i);
		}
		for(int i=2;i<100;i=i+2)  // i=2,4,6,8
		{
			System.out.println("Apply Red Color to step :" + i);
		}
	}
	
	
	//Write a program to print all even numbers in the first 100
	@Test
	public void printEvenNumbers()
	{
		for(int i=2;i<=100;i=i+2)
		{
			System.out.println(i);
		}
	}
	
	//Write a program to print all odd numbers in the first 100
	@Test
	public void printOddNumbers()
	{
		for(int i=1;i<=100;i=i+2)
		{
			System.out.println(i);
		}
	}
		
	//Write a program to apply different color to each floor in the 5 floored building, every floor contains 20 steps 
	
	@Test
	public void applyColorToBuilding()
	{
		for(int i=1;i<=5;i++)//Outer loop // This loop will count floor numbers
		{
			System.out.println("**************Apply Color to the Floor :" + i);
			//Start counting the steps in floor i -1  till 20
			for(int j=1;j<=20;j++) //inner loop
			{
				System.out.println("Apply color to step :" + j + " in the floor :" + i);  // to step 1 in 2
			}
		}
	}
	
	//Write a program to find a student in a class room [1 to 100]
	@Test
	public void findStudent() //25
	{
		boolean flag = false;
		for(int i=1;i<=100;i++)
		{
			//System.out.println("Student number searched :" + i);
			if(i==55)  //25==25
			{ //true				
				flag = true;
				break;
			}			
		} //here for loop completes
		if(flag==true) //this condition should be executed only once 
		{
			System.out.println("Found the student");
		}
		else
		{
			System.out.println("Not Found the student");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
