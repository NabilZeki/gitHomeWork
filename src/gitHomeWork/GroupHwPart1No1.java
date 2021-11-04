package gitHomeWork;

public class GroupHwPart1No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a 2D array of integer values. Print the sum of all numbers.

		int[][] intValues = { 
				{ 19, 30, 1, 44, 5 },
				{ 2, 18, 15, 25, 7 } 
				};

		int tot = 0;
		for (int[] val : intValues) {
			for (int v : val) {
				tot = tot + v;
			}
		}
		System.out.println("The total sum of the array elements is  "+tot);
	}

}
