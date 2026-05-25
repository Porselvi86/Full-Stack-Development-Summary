package Javaprograms;
import java.util.Scanner;

public class StudentPassCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		
		if(marks >= 30)
		{
			System.out.println("Student Passed");
		}

	}

}
