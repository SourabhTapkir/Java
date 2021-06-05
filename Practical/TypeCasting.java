package Practical;

import java.util.Scanner;
public class TypeCasting {
 
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter an integer value");
			int i = scan.nextInt();
			char ch = (char) i;
			System.out.println("character value of given integer is :" + ch);
		}
	}

}
