package javaprogrsm;
import java.util.Scanner;

public class StudentPassFail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks for Subject 1:");
		int sub1 = sc.nextInt();
		
		System.out.println("Enter marks for Subject 2:");
		int sub2 = sc.nextInt();
		
		if(sub1 >= 35)
		{
			if(sub2 >= 35)
			{
				System.out.println("Student Passed in both subjects");
			}
			else
			{
				System.out.println("Failed in Subject 2");
			}
		}
		else
		{
			System.out.println("Failed in Subject 1");
		}

	}

}

