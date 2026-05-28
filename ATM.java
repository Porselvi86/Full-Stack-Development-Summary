package javaprograms;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- ATM MENU -----");
		System.out.println("1. Balance Check");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("Your Balance is Rs.5000");
				break;
				
			case 2:
				System.out.println("Amount Deposited Successfully");
				break;
				
			case 3:
				System.out.println("Amount Withdrawn Successfully");
				break;
				
			default:
				System.out.println("Invalid Choice");
		}

	}

}
