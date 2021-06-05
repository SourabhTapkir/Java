/**
 * 
 */
package Day3;

 import java.util.Scanner;

/**
 * @author HP LAPTOP
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double A ,B;
		System.out.println("A = ");
		A = sc.nextDouble();
		System.out.println("B = ");
		B = sc.nextDouble();
		
		System.out.println("For Addition enter +");
		System.out.println("For Substraction enter -");
		System.out.println("For Multiplication enter *");
		System.out.println("For Division enter /");
		
		
		System.out.println("Enter a symbol for calculation:");
		String s = sc.next();
		
		switch(s) {
		case "+":
			System.out.println(A+B);
		break;
		case "-":
			System.out.println(A-B);
		break;
		case "*":
			System.out.println(A*B);
		break;case "/":
			System.out.println(A/B);
		break;
			
		default:
			System.out.println("Enter a valid symbol.");
		} 
	}
}
