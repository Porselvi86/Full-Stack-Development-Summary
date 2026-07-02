package jaggedarray;

public class TotalElement {

	public static void main(String[] args) {
		int [][] total= {
				{1,2,3},
				{4,5,6},
				{2,3}
		};
		int totalcount=0;
		for(int i=0;i<total.length;i++) {
			totalcount=totalcount+total[i].length;
					}
             System.out.println("Total number of elements:"+totalcount);
	}

}
