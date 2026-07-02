package jaggedarray;

public class StudentMark {

	public static void main(String[] args) {
		int[][]Subjects= {
				{79,98,90},
				{90,67,96,90},
				{78,89,45,90,60}};
		System.out.println("Displaying Student marks");
		for(int i=0;i<Subjects.length;i++) {
			for(int j=0;j<Subjects[i].length;j++) {
				System.out.print(Subjects[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
