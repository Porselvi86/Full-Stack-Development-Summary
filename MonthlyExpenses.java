package jaggedarray;

public class MonthlyExpenses {

	public static void main(String[] args) {
		int[][] Monthly= {
				{200,400,500,6000},
				{350,600},
				{5000,890,4567,236},
				{800,567,3456}
		};
        System.out.println("Show monthly Expensive:");
        for(int i=0;i<Monthly.length;i++) {
        	for(int j=0;j<Monthly[i].length;j++) {
        		System.out.print(Monthly[i][j]+" ");
        
        	}
        	 System.out.println();
        }
      
       
	}

}
