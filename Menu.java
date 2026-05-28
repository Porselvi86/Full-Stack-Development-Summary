package javaprograms;


	import java.util.Scanner;
	public class Menu {
	

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Restaurant Menu ");
			System.out.println("1. Idly");
			System.out.println("2. Dosa");
			System.out.println("3. Ice cream");
			System.out.println("4. Juice");
			
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("You ordered Idly");
					break;
					
				case 2:
					System.out.println("You ordered Dosa");
					break;
					
				case 3:
					System.out.println("You ordered Ice cream");
					break;
					
				case 4:
					System.out.println("You ordered Juice");
					break;
					
				default:
					System.out.println("Invalid Choice");
			}

		}

	}

