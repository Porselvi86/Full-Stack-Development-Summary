package javaprograms;

import java.util.Scanner;

public class VehicleType {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter vehicle type number:");
		System.out.println("1. Bike");
		System.out.println("2. Car");
		System.out.println("3. Bus");
		System.out.println("4. cycle");
		System.out.println("5. Truck");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("You selected Bike");
				break;
				
			case 2:
				System.out.println("You selected Car");
				break;
				
			case 3:
				System.out.println("You selected Bus");
				break;
			case 4:
				System.out.println("You selected cycle");
				break;
			case 5:
				System.out.println("You selected Truck");
				break;
			default:
				System.out.println("Invalid Vehicle Type");
		}

	}

}