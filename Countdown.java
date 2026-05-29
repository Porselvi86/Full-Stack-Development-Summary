package javaprogram;
import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting number:");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--)
		{
			System.out.println(i);
		}

	}

}
