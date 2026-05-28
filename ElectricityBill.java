package javaprograms;
import java.util.Scanner;


public class ElectricityBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- Electricity Bill System -----");
		System.out.println("1. Domestic");
		System.out.println("2. Commercial");
		
		System.out.println("Enter tariff type:");
		int type = sc.nextInt();
		
		System.out.println("Enter number of units consumed:");
		int units = sc.nextInt();
		
		double bill = 0;
		double fixedCharge = 50;
		
		switch(type)
		{
			case 1:
				bill = (units * 5) + fixedCharge;
				System.out.println("Domestic Connection");
				break;
				
			case 2:
				bill = (units * 8) + fixedCharge;
				System.out.println("Commercial Connection");
				break;
				
			default:
				System.out.println("Invalid Tariff Type");
				return;
		}
		
		System.out.println("Total Electricity Bill: Rs." + bill);
		
		if(units > 500)
		{
			System.out.println("High Power Consumption");
		}
		else if(units < 100)
		{
			System.out.println("Energy Saver");
		}
		else
		{
			System.out.println("Normal Usage");
		}

	}

}
