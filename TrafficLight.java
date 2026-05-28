package Javaprograms;
import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter traffic light color:");
		String color = sc.nextLine();
		
		if(color.equalsIgnoreCase("Red"))
		{
			System.out.println("Stop");
		}
		else if(color.equalsIgnoreCase("Yellow"))
		{
			System.out.println("Get Ready");
		}
		else if(color.equalsIgnoreCase("Green"))
		{
			System.out.println("Go");
		}
		else
		{
			System.out.println("Invalid Color");
		}

	}

}



