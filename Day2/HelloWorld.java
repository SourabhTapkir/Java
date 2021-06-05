package Day2;

import java.util.Scanner;

/**
 * 
 */



/**
 * @author HP LAPTOP
 *
 */
public class HelloWorld {

	/**
	 * 
	 */
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("HelloWorld");
		
		int a = 60;
		int b = 50;
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println(a - b);
		System.out.println(a / b);
		
	    int j = 5;
	    System.out.println(j);
	   final int i = 3;
	   System.out.println(i);
	   
	   String name = "Sourabh";
	   System.out.println(name);
	   
	   boolean fun = true;
	   System.out.println(fun);
	   
	   int p = 5, q = 6, r = 7;
	   System.out.println(p);
	   
	   float Z = 80.42f;
	   System.out.println(Z);
	   
	   /*Two types of Data Type:
	    * 1. Primitive - byte (1 byte), short (2 bytes), int(4 bytes), long(8 bytes), float(4 bytes)
	    * double (8 bytes), boolean(1  bit), char (2 bytes).\
	    * 
	    * 2. Non Primitive or Reference Data Type. 
	    */
	   byte u = -70;
	   System.out.println(u);
	   double d = 80.9876d;
	   System.out.println(d);
	   char grade = 'C';
	   System.out.println(grade);
	   
	   /*operators in java
	    */
	   int num1 = 80;
	   int num2 = 60;
	   //Explore these operator - += , -+ , *=,
	   System.out.println("The value of num1 + num2 is");
	   System.out.println(num1 + num2);
	   
	   System.out.println("The value of num1 - num2 is");
	   System.out.println(num1 - num2);
	   
	   System.out.println("The value of num1 * num2 is");
	   System.out.println(num1 * num2);
	   
	  //Taking user input in java
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Input");
	    String input = scan.nextLine();
	    System.out.println(input);
	    
   
	}

}

