package jaggedarray;

public class ReverseOrder {

	public static void main(String[] args) {
			int[][] Monthly= {
					{200,400,500,6000},
					{350,600},
					{5000,890,4567,236},
					{800,567,3456}
			};
	        for(int i=Monthly.length-1;i>=0;i--) {
	        	for(int j=Monthly[i].length-1;j>=0;j--) {
	        		System.out.print(Monthly[i][j]+" ");
	        
	        	}
	        	 System.out.println();
	        }
	      
	       
		}
}
