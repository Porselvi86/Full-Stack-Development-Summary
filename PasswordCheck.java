package Javaprograms;
import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String correctPassword = "5678";
		
		System.out.println("Enter password:");
		String password = sc.nextLine();
		
		if(password.equals(correctPassword))
		{
			System.out.println("Password is Correct");
		}
		else
		{
			System.out.println("Wrong Password");
		}

	}

}

