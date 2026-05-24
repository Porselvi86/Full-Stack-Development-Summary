package javaprograms;

		import java.util.Scanner;

		public class SimpleInterest {

			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter principal amount:");
				double principal = sc.nextDouble();
				
				System.out.println("Enter rate of interest:");
				double rate = sc.nextDouble();
				
				System.out.println("Enter time:");
				double time = sc.nextDouble();
				
				double si = (principal * rate * time) / 100;
				
				System.out.println("Simple Interest:" + si);

			}


	}

