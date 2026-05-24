package javaprograms;
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle:");
		int length = sc.nextInt();
		System.out.println("Enter breadth of rectangle:");
		int breadth = sc.nextInt();
		int rectangle=length*breadth;
		System.out.println("Area of rectangle:"+rectangle);
		
	}

}
