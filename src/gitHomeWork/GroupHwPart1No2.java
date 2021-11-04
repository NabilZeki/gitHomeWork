package gitHomeWork;

public class GroupHwPart1No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Create a 2D array or integer type where you will store odd and even numbers. 
		*  Develop a program which will identify/print the even numbers only.
		*/

				
		int[][] intValues = { 
				{ 19, 30, 1, 44, 5 },
				{ 2, 18, 15, 25, 7 } 
				};
		

			for (int[] val:intValues) {
			for(int v:val) {
				if(v%2==0) {								System.out.println(v);
				}				
				
			}
		}
		
		
		

	}

}
