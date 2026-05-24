package javaprograms;


import java.util.Scanner;

public class SquareAndCube {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		int square = num * num;
		int cube = num * num * num;
		
		System.out.println("Square of number: " + square);
		System.out.println("Cube of number: " + cube);

	}

}