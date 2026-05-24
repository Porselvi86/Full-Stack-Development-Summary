package javaprograms;

public class SwapNumbers {

	public static void main(String[] args) {
				int a = 8;
				int b = 5;

				System.out.println("Before Swap");
				System.out.println("a = " + a);
				System.out.println("b = " + b);

				int c=a;
				a = b;
				b = c;

				System.out.println("After Swap");
				System.out.println("a = " + a);
				System.out.println("b = " + b);
			}
		}