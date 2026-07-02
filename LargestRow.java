package jaggedarray;

public class LargestRow {

	public static void main(String[] args) {
		int[][]large= {
				{2,4,6},
				{5,7,9,2,3},
				{12,5}};
		int largelength=0;
		int largeRow=0;
		for(int i=0;i<large.length;i++) {
			if(large[i].length>largelength) {
				largelength=large[i].length;
				largeRow=i;
			}
		}

        System.out.println("Largest Row : " + (largeRow+1));
        System.out.println("Number of Elements : " + largelength);
	}

}
