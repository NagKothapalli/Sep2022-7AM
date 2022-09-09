package basicConcepts;

import org.junit.Test;

public class MyArrays {
	// Array : Is a group of memory locations with similar data type .
	// [2,4,6,4,3,67] ["Ram","Ravi","Raj"]
	// fixed array : to store names of the students in the class room .
	// dynamic array : to store marks percentage , here we know the length but we
	// don't know the marks initially .
	// array list : we don't know the length , we don't have the data
	int num = 22;
	// Modifier DataType name = value;
	// Modifier DataType[] name = { values } ;
	public int[] rollNumbers = { 22, 24, 25, 67, 4, 8, 47 };

	// Declaration , Assign , Length , Read , Write
	// java.lang.ArrayIndexOutOfBoundsException: 10
	@Test
	public void fixedArray_integer() {
		// index : 0 1 2 3 4 5 6
		int[] numbers = { 22, 24, 25, 67, 4, 8, 47 }; // local variable
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		int temp = numbers[10];
		for (int i = 0; i < len; i++) {
			int mynum = numbers[i]; // i = 0 1 2 3 4
			System.out.println("Elements:" + mynum); // 22 24 25 67 4 ....
		}
		for (int i = 0; i < len; i++) {
			numbers[i] = 222 + i; // writing
			int mynum = numbers[i]; // reading // i = 0 1 2 3 4
			System.out.println("Elements after:" + mynum); // 22 24 25 67 4 ....
		}
	}

	@Test
	public void fixedArray_string() {
		// index : 0 1 2 3 4 5 6
		//int[] numbers = { 22, 24, 25, 67, 4, 8, 47 }; // local variable
		String[] names = {"Ram","Raj","Ravi","Rani"};
		int len = names.length;
		System.out.println("Length of the array :" + len);
		String temp = names[1];
		for (int i = 0; i < len; i++) {  //3<4 -> T  4<=4 -> T
			 String mynum = names[i]; // i = 0 1 2 3 4
			System.out.println("Elements:" + mynum); // 22 24 25 67 4 ....
		}
		for (int i = 0; i < len; i++) {
			names[i] = "Selenium" + i; // writing
			String mynum = names[i]; // reading // i = 0 1 2 3 4
			System.out.println("Elements after:" + mynum); // 22 24 25 67 4 ....
		}
	}
	//Modifier  DataType[]  name = new  DataType[size];
	@Test
	public void dynamicArray_integer() {
		// index : 0 1 2 3 4 5 6
		//int[] numbers = { 22, 24, 25, 67, 4, 8, 47 }; // local variable
		int[]  numbers = new int[10];
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		//int temp = numbers[10];
		for (int i = 0; i < len; i++) {
			int mynum = numbers[i]; // i = 0 1 2 3 4
			System.out.println("Elements:" + mynum); // 22 24 25 67 4 ....
		}
		for (int i = 0; i < len; i++) {
			numbers[i] = 222 + i; // writing
			int mynum = numbers[i]; // reading // i = 0 1 2 3 4
			System.out.println("Elements after:" + mynum); // 22 24 25 67 4 ....
		}
	}
	
	@Test
	public void dynamicArray_string() {
		// index : 0 1 2 3 4 5 6
		//int[] numbers = { 22, 24, 25, 67, 4, 8, 47 }; // local variable
		//String[] names = {"Ram","Raj","Ravi","Rani"};
		String[] names = new String[10];
		int len = names.length;
		System.out.println("Length of the array :" + len);
		String temp = names[1];
		for (int i = 0; i < len; i++) {  //3<4 -> T  4<=4 -> T
			 String mynum = names[i]; // i = 0 1 2 3 4
			System.out.println("Elements:" + mynum); // 22 24 25 67 4 ....
		}
		for (int i = 0; i < len; i++) {
			names[i] = "Selenium" + i; // writing
			String mynum = names[i]; // reading // i = 0 1 2 3 4
			System.out.println("Elements after:" + mynum); // 22 24 25 67 4 ....
		}
	}
	
	//ArrayList - Object of class
	
	//https://github.com/NagKothapalli/May2022-7PM-Maven.git
	
	
	
	
	
	
	
	
	
	

}
