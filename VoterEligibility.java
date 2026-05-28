package javaprogrsm;
import java.util.Scanner;
	import java.util.Scanner;

	public class VoterEligibility {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter age:");
			int age = sc.nextInt();
			
			System.out.println("Do you have voter ID? (true/false)");
			boolean voterId = sc.nextBoolean();
			
			if(age >= 18)
			{
				if(voterId)
				{
					System.out.println("Person is eligible to vote");
				}
				else
				{
					System.out.println("Person does not have voter ID");
				}
			}
			else
			{
				System.out.println("Person is not eligible to vote");
			}

		}

	}