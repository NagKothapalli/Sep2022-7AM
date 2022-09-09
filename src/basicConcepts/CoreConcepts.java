package basicConcepts;
//Signature : CLASS
   //Modifier   class   Name{  Members : variables / functions  }
public class CoreConcepts 
{
  //Area you will write your java code
	//variables 
	//functions / methods  -  Task
 //Signature : VARIABLE
	//Modifier[opt]  DataType  Name ; - Declaration         //Modifier  DataType  Name = value ; - Assignment
	//Access Modifiers : private - with in the class , default - with in the package , public / protected - across packages / projects
	//Non Access Modifiers : static , final
	
	public static final String  collegeName = "JNTU" ;
	public         int    stdNum = 22;
	protected char stdGrade = 'A';
	boolean stdResult = true; //default
	private double stdMarks = 88.56;
	//Typemismatch Error
 //Signature : FUNCTION     [] - square   () - parenthesis   { } - curly braces
	//Modifier[opt]   ReturnType  Name(inputs[opt]){  body  }
	                                  //DataType arg1,DataType arg2,DataType arg3  .......
	//psvm
	public static void main(String[] args) //String[] args is for reading command line arguments
	{
		System.out.println("Welcome to Selenium Java");
		//addition(); //how to call a function
		//addition(64,38);
		//addition(664,358,436);
		int x = addition(664,35,436,765);
		System.out.println("Output of the program :" + x);
		//addition(624,388);
		//subtraction();
		//multiplication();
		//division();
	}
	public static void addition()
	{
		//body - implementation
		int sum = 22+44; //int+int = int |  int+string  , string+int , string+string  = string
		System.out.println("Sum of two numbers : + sum");
		System.out.println("Sum of two numbers :" + sum);
	}
	//Duplicate : if the name and the inputs are same then that will be a duplicate function
	public static void addition(int a,int b)
	{
		//body - implementation
		int sum = a+b; //int+int = int |  int+string  , string+int , string+string  = string
		System.out.println("Number One : "+ a);
		System.out.println("Number Two : "+ b);
		System.out.println("Sum of two numbers :" + sum);
	}
	public static void addition(int a,int b,int c) //Method Overloading - Polymorphism -Oops
	{
		//body - implementation
		int sum = a+b+c; //int+int = int |  int+string  , string+int , string+string  = string
		System.out.println("Number One : "+ a);
		System.out.println("Number Two : "+ b);
		System.out.println("Number Three : "+ c);
		System.out.println("Sum of Three numbers :" + sum);
	}
	public static int addition(int a,int b,int c,int d) //Method Overloading - Polymorphism -Oops
	{
		//body - implementation
		int sum = a+b+c+d; //int+int = int |  int+string  , string+int , string+string  = string
		System.out.println("Number One : "+ a);
		System.out.println("Number Two : "+ b);
		System.out.println("Number Three : "+ c);
		System.out.println("Number Four : "+ d);
		//System.out.println("Sum of Four numbers :" + sum);
		return sum;
	}
	public static void subtraction()
	{
		//body - implementation
		int sum = 282-44; //int+int = int |  int+string  , string+int , string+string  = string
		
		System.out.println("difference of two numbers :" + sum);
	}
	public static void multiplication()
	{
		//body - implementation
		int sum = 22*44; //int+int = int |  int+string  , string+int , string+string  = string
		
		System.out.println("product of two numbers :" + sum);
	}
	public static void division()
	{
		//body - implementation
		int sum = 242/44; //int+int = int |  int+string  , string+int , string+string  = string
		
		System.out.println("division of two numbers :" + sum);
	}
}
