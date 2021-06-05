package Practical;

public class ReversetheIntegerdigit {

	public static void main(String[] args) {
		int number=987;
		while(number!=0)
		{
			int r= number%10;
			System.out.println(r);
			number=number/10;
		
		}

	}

}
