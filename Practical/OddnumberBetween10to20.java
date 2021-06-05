package Practical;

public class OddnumberBetween10to20 {

	public static void main(String[] args) {
	int i=10;
	System.out.println("odd number from 10 to 20: \n");
	do {
		if(i%2==1) {
			System.out.print(i+"\n");
		}
		i++;
	}
	while(i>=10 && i<=20);
	}

}
