package Javaprograms;
import java.util.Scanner;

public class StudentPerformance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		
		if(marks >= 90)
		{
			System.out.println("Excellent Performance");
		}
		else if(marks >= 75)
		{
			System.out.println("Good Performance");
		}
		else if(marks >= 45)
		{
			System.out.println("Average Performance");
		}
		else
		{
			System.out.println("Needs Improvement");
		}

	}

}
