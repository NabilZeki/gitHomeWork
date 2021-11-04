package gitHomeWork;

public class GroupHWPart1No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a 2D array of integers.
		 *  Develop a program which will calculate the sum of  even and odd numbers for that array.
		 */
		
		int[][] intValues = { 
				{ 19, 30, 1, 44, 5 },
				{ 2, 18, 15, 25, 7 } 
				};
		
		int eSum=0;
		int oSum=0;
		
		for(int[] values:intValues) {
			for(int v:values) {
				if (v%2==0) {
					eSum+=v;

				}else {
					oSum=oSum+v;
				}
			}		
		}
		System.out.println("The sum of even numbers is: "+eSum);
		System.out.println("The sum of odd numbers is: "+oSum);

		
		

	}

}
