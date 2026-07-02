package jaggedarray;

public class jagged {
	
		public static void main(String[] args) {
			int [][]jagged={
					{1,2},
					{3,4,5,6},
					{7,8,9}};
			System.out.println("Enter the jagged array:");
			for(int i=0;i<jagged.length;i++) {
				for(int j=0;j<jagged[i].length;j++) {
					System.out.print(jagged[i][j]+" ");
				}
				System.out.println();
			}
		}
	}