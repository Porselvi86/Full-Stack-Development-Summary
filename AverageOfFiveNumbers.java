package javaprograms;

import java.util.Scanner;

public class AverageOfFiveNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third number:");
		int num3 = sc.nextInt();
		
		System.out.println("Enter fourth number:");
		int num4 = sc.nextInt();
		
		System.out.println("Enter fifth number:");
		int num5 = sc.nextInt();
		
		double average = (num1 + num2 + num3 + num4 + num5) / 5.0;
		
		System.out.println("Average: " + average);

	}

}