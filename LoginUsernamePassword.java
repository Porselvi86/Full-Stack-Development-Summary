package javaprogrsm;
import java.util.Scanner;

public class LoginUsernamePassword {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String correctUsername = "porselvi";
		String correctPassword = "98765";
		
		System.out.println("Enter username:");
		String username = sc.nextLine();
		
		System.out.println("Enter password:");
		String password = sc.nextLine();
		
		if(username.equals(correctUsername))
		{
			if(password.equals(correctPassword))
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Incorrect Password");
			}
		}
		else
		{
			System.out.println("Incorrect Username");
		}

	}

}


