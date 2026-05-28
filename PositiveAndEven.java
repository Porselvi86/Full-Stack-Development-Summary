package javaprogrsm;
import java.util.Scanner;

public class PositiveAndEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		if(num > 0)
		{
			if(num % 2 == 0)
			{
				System.out.println("Number is Positive and Even");
			}
			else
			{
				System.out.println("Number is Positive but Odd");
			}
		}
		else
		{
			System.out.println("Number is not Positive");
		}

	}

}
