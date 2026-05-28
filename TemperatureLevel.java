package Javaprograms;
import java.util.Scanner;

public class TemperatureLevel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature:");
		int temp = sc.nextInt();
		
		if(temp > 50)
		{
			System.out.println("High Temperature");
		}
		else if(temp > 40)
		{
			System.out.println("Normal Temperature");
		}
		else
		{
			System.out.println("Low Temperature");
		}

	}

}

